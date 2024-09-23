<?php
//exemplos de cenas?

$cenas = [
    'inicio' => [
        'texto' => "Está na hora de encontrar um assassino. Escolha uma ação:",
        'opcoes' => [
            'A' => "Usar A",
            'B' => "Usar B",
            'C' => "Usar C",
            'Sair' => "Sair do Jogo"
        ]
    ],
    'estado_A' => [
        'texto' => "Você escolheu a opção A! O que deseja fazer agora?",
        'opcoes' => [
            'continuar' => "Continuar com A",
            'voltar' => "Voltar ao início"
        ]
    ],
    'estado_B' => [
        'texto' => "Você escolheu a opção B! O que deseja fazer agora?",
        'opcoes' => [
            'investigar' => "Investigar",
            'voltar' => "Voltar ao início"
        ]
    ],
    'estado_C' => [
        'texto' => "Você escolheu a opção C! O que deseja fazer agora?",
        'opcoes' => [
            'explorar' => "Explorar",
            'voltar' => "Voltar ao início"
        ]
    ],
    
];
