<?php
session_start();
include 'cenas.php';


if (!isset($_SESSION['estado'])) {
    $_SESSION['estado'] = 'inicio';
}


?>


<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Assassino invisível</title>
    <link rel="stylesheet" href="estilo.css">
    <script>
        function enviarAcao(acao) {
            const formData = new FormData();
            formData.append('acao', acao);


            fetch('api.php', {
                method: 'POST',
                body: formData
            })
            .then(response => response.json())
            .then(data => {
                if (data.estado === 'sair') {
                    alert("Você saiu do jogo.");
                    window.location.href = 'index.php';
                } else {
                    mostrarCena(data.estado);
                }
            });
        }


        function mostrarCena(estado) {
            const cenas = {
                'inicio': "<h2>Escolha uma ação:</h2>" +
                          '<button onclick="enviarAcao(\'A\')">Usar A</button>' +
                          '<button onclick="enviarAcao(\'B\')">Usar B</button>' +
                          '<button onclick="enviarAcao(\'C\')">Usar C</button>' +
                          '<button onclick="enviarAcao(\'Sair\')">Sair</button>',
                'estado_A': "<h2>Escolheu a opção A</h2>" +
                            '<button onclick="enviarAcao(\'Iniciar\')">Iniciar Novamente</button>',
                'estado_B': "<h2>Escolheu opção B</h2>" +
                            '<button onclick="enviarAcao(\'Iniciar\')">Iniciar Novamente</button>',
                'estado_C': "<h2>Escolheu opção C/h2>" +
                            '<button onclick="enviarAcao(\'Iniciar\')">Iniciar Novamente</button>'
            };


            document.getElementById('cena').innerHTML = cenas[estado] || "Ação inválida.";
        }


        document.addEventListener('DOMContentLoaded', () => {
            mostrarCena('<?php echo $_SESSION['estado']; ?>');
        });
    </script>
</head>
<body>
    <div id="cena"></div>
    <a href="index.php">Sair do Jogo</a>
</body>

</html>



