<?php
session_start();


if (!isset($_SESSION['estado'])) {
    $_SESSION['estado'] = 'inicio';
}

function getEstado() {
    return json_encode(['estado' => $_SESSION['estado']]);
}

function atualizarEstado($acao) {
    switch ($acao) {
        case 'A':
            $_SESSION['estado'] = 'estado_A';
            break;
        case 'B':
            $_SESSION['estado'] = 'estado_B';
            break;
        case 'C':
            $_SESSION['estado'] = 'estado_C';
            break;
        case 'Sair':
            session_destroy();
            header('Location: index.php'); 
            exit;
        case 'Iniciar':
            $_SESSION['estado'] = 'inicio';
            break;
            case 'Help': 
                $_SESSION['estado'] = 'help'; 
                break;
            
    }
}


if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['acao'])) {
    atualizarEstado($_POST['acao']);
}


switch ($_SESSION['estado']) {
    case 'inicio':
        $cena = "<h2>Escolha uma ação:</h2>
                 <form method='post'>
                     <button name='acao' value='A'>Usar A</button>
                     <button name='acao' value='B'>Usar B</button>
                     <button name='acao' value='C'>Usar C</button>
                     <button name='acao' value='Sair'>Sair</button>
                 </form>";
        break;

    case 'estado_A':
        $cena = "<h2>Você escolheu a opção A!</h2>
                 <form method='post'>
                     <button name='acao' value='Iniciar'>Iniciar Novamente</button>
                 </form>";
        break;

    case 'estado_B':
        $cena = "<h2>Você escolheu a opção B!</h2>
                 <form method='post'>
                     <button name='acao' value='Iniciar'>Iniciar Novamente</button>
                 </form>";
        break;

    case 'estado_C':
        $cena = "<h2>Você escolheu a opção C!</h2>
                 <form method='post'>
                     <button name='acao' value='Iniciar'>Iniciar Novamente</button>
                 </form>";
        break;

    default:
        $cena = "<h2>Estado inválido!</h2>";
        break;
}


?>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Assassino Invisível - Jogo</title>
    <link rel="stylesheet" href="estilo.css">
</head>
<body>
    <div id="jogo">
        <?php echo $cena; ?>
    </div>
    <a href="index.php">Voltar ao começo</a>
</body>
</html>
