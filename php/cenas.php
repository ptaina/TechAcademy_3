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
    'estado_A' => [ // Resultado da escolha 2.1
        'texto' => "Joe entrega os arquivos a Gen, que passa a noite analisando-os. Ela percebeu que todas as vítimas eram mulheres ruivas, altas, magras e tinham entre 20 e 30 anos.",
        'opcoes' => [
            'Falar com Joe' => "Falar com Joe sobre as vítimas",
            'Continuar' => "Próxima cena",
            'Sair' => "Sair do jogo"
        ],
        'dialogo' => '"Joe, preciso de todos os arquivos das mortes anteriores. Quero ver se há algum padrão que possamos identificar."'
    ],
    'estado_B' => [ // Resultado da escolha 2.2
        'texto' => "Na cena do crime, Gen encontra uma pista deixada pelo assassino: um lenço vermelho.",
        'opcoes' => [
            'Falar com a polícia' => "Falar com os policiais presentes",
            'Investigar lenço' => "Examinar o lenço",
            'Voltar' => "Voltar ao início"
        ],
        'dialogo' => '"Scott, já que a cena do crime é o quarto que você e a Jean compartilhavam, será que poderia me levar até lá? Quero ver se há algo que os investigadores possam ter perdido."'
    ],
    'estado_C' => [ // Resultado da escolha 2.3
        'texto' => "As testemunhas revelam que viram um homem suspeito na área.",
        'opcoes' => [
            'Falar com testemunhas' => "Falar com mais testemunhas",
            'Voltar' => "Voltar ao início"

        ],
        'dialogo' => '"Gostaria de falar com as pessoas que conheciam Jean e as outras vítimas. Às vezes, pequenos detalhes podem ser a chave."'
    ],

    'Segunda' => [
        'texto' => "Com as novas informações adquiridas, Gen decide de qualquer maneira manter seu foco na cena do crime e no melhor amigo da vítima Scott, pois acredita que apesar da perícia ser minuciosa algo às vezes pode passar batido. 
   
. Escolha uma ação:",
        'opcoes' => [
            'A' => "Compartilhar as suas novas descobertas com Scott",
            'B' => "Entregar uma das provas encontradas na cena do crime para seu parceiro Joe",
            'C' => "Suspeitar de Scott e confrontá-lo",
            'Sair' => "Sair do Jogo"
        ]
    ],
    'estado_D' => [ // Resultado da escolha 4.1
        'texto' => "Hey Scott, já que você era muito próximo de Jean, acho justo compartilhar as minhas novas descobertas",
        'opcoes' => [
            'Continuar' => "Próxima cena",
            'Sair' => "Sair do jogo"
        ],
        'textoR' => 'Gen compartilha suas descobertas com Scott. Scott menciona que Joe Goldberg conhecia todas as vítimas e que tinha um comportamento estranho em relação a elas. ',
        'dialogo' => '"Joe estava sempre perto das vítimas, antes e depois das mortes. Ele até deu uma carona para Jean algumas vezes.”'
    ],
    'estado_E' => [ // Resultado da escolha 4.2
        'texto' => "Joe, eu encontrei essa fibra no quarto de Jean. Quero que você me ajude a conectá-la com os outros casos. Talvez isso seja a chave para desvendarmos tudo.",
        'opcoes' => [
            'Investigar lenço' => "Examinar o lenço",
            'Continuar' => "Próxima cena",
            'Voltar' => "Voltar ao início"
        ],
        'textoR' => "Após Gen entregar a fibra de algodão manchada de sangue para Joe. Joe com um olhar desconfiado franziu a testa e mencionou que Scott anteriormente foi considerado suspeito pois na semana do primeiro assassinato ele foi visto comprando um carretel de linha daquela mesma fibra. ",
        'dialogo' => '"Só não prosseguimos com a investigação em cima do Scott por falta de provas"'
    ],
    'estado_F' => [ // Resultado da escolha 4.3
        'texto' => "“Scott, o modelo do seu carro bate com a descrição do carro visto perto do local das últimas mortes, muita coincidência não acha?”",
        'opcoes' => [
            'Continuar' => "Próxima cena",
            'Voltar' => "Voltar ao início"
            
        ],
        'textoR' => " Após confrontar Scott sobre o carro, Scott se defende dizendo que não é só ele que possui o carro daquele modelo.",
        'dialogo' => 'A cidade é pequena e esse tipo de carro ainda não é popular aqui, acredito que você consiga investigar os donos dos poucos carros como esse, começando pelo Joe..."'
    ],

];
