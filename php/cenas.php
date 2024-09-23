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

    'Terceira' => [
        'texto' => "Com a descoberta de novas pistas cruciais, Gen se vê confusa com tantas informações inesperadas e para lidar melhor com a situação e continuar conduzindo a investigação, ela precisa ampliar seu campo de visão e acredita agora que deve duvidar até de uma formiga no chão.... 
   
. Escolha uma ação:",
        'opcoes' => [
            'A' => "Perguntar ao seu parceiro Joe se ele possuía algum tipo de relação com alguma das vítimas:",
            'B' => "Questionar Scott mais uma vez",
            'C' => "Suspeitar de Scott e confrontá-lo",
            'Sair' => "Sair do Jogo"
        ]
    ],
    'estado_G' => [ // Resultado da escolha 6.1
        'texto' => "Joe, você conhecia algumas da vítimas antes dos assinatores aconteceram? Soube que você já deu até carona para algumas delas...",
        'opcoes' => [
            'Continuar' => "Próxima cena",
            'Sair' => "Sair do jogo"
        ],
        'textoR' => '',
        'dialogo' => '“Por que, Gen? Desconfia de mim agora? Como policial eu fazia e costumo fazer patrulha a noite para garantir a segurança da cidade e foi numa dessas noites que dei carona para algumas, afim de evitar que algo de ruim acontecesse com elas”  
'
    ],
    'estado_H' => [ // Resultado da escolha 6.2
        'texto' => "Scott, eu soube que você comprou um carretel de linha na semana do primeiro assassinato e que coincidentemente é o mesmo tipo encontrado no seu quarto e da Jean, e nas outras cenas de crime? Isso não é algo que podemos ignorar",
        'opcoes' => [
            'Continuar' => "Próxima cena",
            'Voltar' => "Voltar ao início"
        ],
        'textoR' => "Com suas principais suspeitas em cima de Scott, o mesmo reage alegando ser inocente e dizendo que foi ele quem a contratou por intermédio do xerife.  
 ",
        'dialogo' => '"Com todo respeito Gen, por que alguém que fosse culpado cooperaria com as investigações e até contrataria um novo detetive para solucionar o caso? Sim, foi eu quem sugeriu a sua contratação ao xerife. E quanto a uma das provas que estou diretamente ligado e por isso devo ser um dos principais suspeitos, acredito eu que não passa de uma mera coincidência, pois sou um artista nato e gosto de presentear pessoas próximas mim com presentes cuidadosamente feitos a mão, como foi o caso da Jean, dei a ela uma linda pulseira feita com fibra de algodão e miçangas"'
    ],
    'estado_I' => [ // Resultado da escolha 6.3
        'texto' => "“Acho melhor visitar novamente as cenas dos crimes e ver se encontro algo melhor que uma fibra de linha de algodão, quem sabe acho até um veículo suspeito?! “ 
",
        'opcoes' => [
            'Continuar' => "Próxima cena",
            'Voltar' => "Voltar ao início"
            
        ],
        'textoR' => "  Ao refazer seus passos, Gen descobre que apenas duas pessoas na cidade possuem o modelo de carro próximo ao local dos crimes. 
",
        'dialogo' => '“Esse caso está ficando mais difícil do que achei que era, agora a única coisa suspeita é o modelo de carro que aparentemente somente Scott Summers e Joe Goldberg possuem....” "'
    ],

    
    'Quarta' => [
        'texto' => "Gen sente que o cerco está se fechando. Ela reuniu provas suficientes para confrontar o verdadeiro culpado, mas ainda está dividida entre Scott Summers e Joe Goldberg. As suspeitas são fortes para ambos, e qualquer movimento errado pode ser fatal.  
Mais do que nunca, Gen decide que é hora de agir e decide escolher em quem confiar. As evidências a levaram a um ponto onde ela sabe que um dos dois está mentindo, mas ainda precisa de uma última peça do quebra-cabeça. Ela marca um encontro com ambos separadamente, fingindo estar indecisa, mas na verdade pronta para desmascarar o verdadeiro culpado.
.. 
   
. Escolha uma ação:",
        'opcoes' => [
            'A' => "Confiar em Joe Goldberg",
            'B' => "Congiar em Scott Summers",
            'Sair' => "Sair do Jogo"
        ]
    ],
    'estado_j' => [ // Resultado da escolha 8.1
        'texto' => "“Joe, como você é um amigo de longa data estou te confidencializando minhas conclusões para este caso, estou convencida de que Scott está escondendo algo. Precisamos confrontá-lo juntos e descobrir a verdade.”",
        'opcoes' => [
            'Continuar' => "Próxima cena",
            'Sair' => "Sair do jogo"
        ],
        'textoR' => ' Gen resolve que a única maneira de obter respostas é confiar em Joe. Ela acredita que Scott está tentando desviar as suspeitas e decide se unir a Joe para confrontar Scott juntos.  
',
        'dialogo' => '“"Você confiou na pessoa errada e pagou o preço mais alto. Gen Winchester, uma jovem promissora, tornou-se mais uma vítima de um assassino que se esconde nas sombras. O verdadeiro horror não está apenas no ato, mas na traição que precedeu sua morte. Que essa tragédia seja um lembrete: no mundo da investigação, nem tudo é o que parece, e as aparências podem ser mortais." 
”  
'
    ],
    'estado_k' => [ // Resultado da escolha 8.2
        'texto' => '"Scott, acredito que você estava tentando me ajudar o tempo todo. Precisamos armar uma cilada para Joe. Ele é o único que pode ser o culpado, e temos que agir rápido."',
        'opcoes' => [,
            'Continuar' => "Próxima cena",
            'Voltar' => "Voltar ao início"
        ],
        'textoR' => " Gen e Scott armam um plano para expor Joe. Eles o chamam para um encontro sob o pretexto de que Gen encontrou novas provas que precisam ser analisadas. Joe, acreditando que pode manipular Gen, concorda em se encontrar com ela sozinho. 
.   
 ",
        'dialogo' => '"Parabéns, você desvendou o mistério e trouxe justiça para as vítimas. Graças à sua perspicácia e coragem, Gen Winchester conseguiu desmascarar o assassino e impedir que ele tirasse mais vidas. A cidade de Lawrence pode finalmente respirar aliviada, mas lembre-se: o mal pode se esconder nos lugares mais inesperados. Mantenha seus instintos afiados e sua desconfiança sempre alerta." 
'
    ],


];
