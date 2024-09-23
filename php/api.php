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
            exit;
        case 'Iniciar':
            $_SESSION['estado'] = 'inicio';
            break;
    }
}


if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['acao'])) {
    atualizarEstado($_POST['acao']);
    echo getEstado();
} else {
    echo getEstado();
}



?>
