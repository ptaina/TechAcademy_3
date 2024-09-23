<?php
// Exemplos de cenas

$cenas = [
    'inicio' => [
        'texto' => "Está na hora de encontrar um assassino. Escolha uma ação:",
        'opcoes' => [
            'A' => "Pedir arquivos das mortes anteriores",
            'B' => "Visitar a cena do crime de Jean Grey",
            'C' => "Entrevistar testemunhas e familiares das vítimas",
            'Sair' => "Sair do Jogo"
        ]
    ],
    'estado_A' => [ // Resultado da escolha A
        'texto' => "Joe entrega os arquivos a Gen, que passa a noite analisando-os. Ela percebeu que todas as vítimas eram mulheres ruivas, altas, magras e tinham entre 20 e 30 anos.",
        'opcoes' => [
            'Falar com Joe' => "Falar com Joe sobre as vítimas",
            'Continuar' => "Próxima cena",
            'Sair' => "Sair do jogo"
        ],
        'dialogo' => '"Joe, preciso de todos os arquivos das mortes anteriores. Quero ver se há algum padrão que possamos identificar."'
    ],
    'estado_B' => [ // Resultado da escolha B
        'texto' => "Na cena do crime, Gen encontra uma pista deixada pelo assassino: um lenço vermelho.",
        'opcoes' => [
            'Falar com a polícia' => "Falar com os policiais presentes",
            'Investigar lenço' => "Examinar o lenço",
            'Voltar' => "Voltar ao início"
        ],
        'dialogo' => '"Scott, já que a cena do crime é o quarto que você e a Jean compartilhavam, será que poderia me levar até lá? Quero ver se há algo que os investigadores possam ter perdido."'
    ],
    'estado_C' => [ // Resultado da escolha C
        'texto' => "As testemunhas revelam que viram um homem suspeito na área.",
        'opcoes' => [
            'Falar com testemunhas' => "Falar com mais testemunhas",
            'Seguir o homem' => "Seguir o homem suspeito",
            'Voltar' => "Voltar ao início"
            
        ],
        'dialogo' => '"Gostaria de falar com as pessoas que conheciam Jean e as outras vítimas. Às vezes, pequenos detalhes podem ser a chave."'
    ],

];
