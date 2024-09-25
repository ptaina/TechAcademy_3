import model.Jogador;
import repository.JogadorDao;
import repository.EscolhaDao;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogador jogador;

        try {
            // Tentando encontrar o jogador pelo ID
            jogador = JogadorDao.findJogadorById(1);

            if (jogador == null) {
                // cria um novo jogador se ele não existir
                jogador = new Jogador(null, "Gen Winchester", 25, 0);
                JogadorDao.createJogador(jogador);
                System.out.println("Novo jogador criado: " + jogador.getNome());
            } else {
                System.out.println("Jogador encontrado: " + jogador.getNome());

                // Pergunta se deseja reiniciar o jogo
                if (jogador.getProgressoCena() > 0) {
                    System.out.println("Deseja reiniciar o jogo? (s/n)");
                    String resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("s")) {
                        jogador.setProgressoCena(0); // Reinicia o progresso
                        System.out.println("Progresso reiniciado. Você começará do início.");
                    }
                }
            }


            iniciarJogo(jogador, scanner);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void iniciarJogo(Jogador jogador, Scanner scanner) {
        int progresso = jogador.getProgressoCena();
        int escolha = -1;

        while (true) {

            System.out.println("Digite 'help' para ver as instruções ou 'proceed' para continuar.");
            String comando = scanner.next();

            if (comando.equalsIgnoreCase("help")) {
                mostrarAjuda();
                continue; // Volta ao início
            } else if (!comando.equalsIgnoreCase("proceed")) {
                System.out.println("Comando inválido.");
                continue;
            }

            switch (progresso) {
                case 0:
                    System.out.println("Nesse jogo você é Gen Winchester, uma perita criminal recém-formada de 25 anos, que é contratada pelo xerife de Lawrence, uma pequena cidade no Texas, para investigar uma série de assassinatos de mulheres. A mais recente vítima é Jean Gray, a melhor amiga e colega de quarto de Scott Summers. Para acelerar a investigação, Gen contacta o seu antigo parceiro da polícia local, Joe Goldberg.");
                    progresso = 1; // Avança para a próxima cena
                    break;
                case 1:
                    System.out.println("Cena 1: Você chega ao escritório do xerife já acompanhada por Joe Goldberg e é recepcionada por Scott Summers na porta de entrada, que parece exausto e ansioso. Joe a apresenta ao xerife e deixa Scott explicar que a sua colega de quarto Jean Gray foi brutalmente assassinada, assim como várias outras mulheres antes dela. Gen decide que é hora de botar a mão na massa: ");
                    System.out.println("Escolhas:");
                    System.out.println("1. Pedir os arquivos das mortes anteriores a Joe:\n" + "\"Joe, preciso de todos os arquivos das mortes anteriores. Quero ver se há algum padrão que possamos identificar.\"\n" );
                    System.out.println("2. Visitar a cena do crime de Jean Gray: \n" + "\" Scott, já que a cena do crime é o quarto que você e a Jean compartilhavam, será que poderia me levar até lá? Quero ver se há algo que os investigadores possam ter perdido.\"\n");
                    System.out.println("3. Entrevistar testemunhas e familiares das vítimas: \n" + "\" Gostaria de falar com as pessoas que conheciam Jean e as outras vítimas. Às vezes, pequenos detalhes podem ser a chave.\"\n");

                    escolha = scanner.nextInt(); // Recebe a escolha
                    processarEscolha(jogador, escolha);
                    progresso = 2; // Avança para a próxima cena
                    break;
                case 2:
                    mostrarResultadoEscolha1(escolha);
                    progresso = 3; // Avança para a próxima cena de ação
                    break;

                case 3:
                    System.out.println("Cena 3: Cena do Crime: Com as novas informações adquiridas, Gen decide manter seu foco na cena do crime e em Scott, pois acredita que algo pode ter passado despercebido.");
                    System.out.println("Escolhas:");
                    System.out.println("1. Compartilhar as suas novas descobertas com Scott: \n" + "\"Hey Scott, já que você era muito próximo de Jean, acho justo compartilhar as minhas novas descobertas.\"\n");
                    System.out.println("2. Entregar uma das provas encontradas na cena do crime para seu parceiro Joe: \n"+ "\"Joe, eu encontrei essa fibra no quarto de Jean. Quero que você me ajude a conectá-la com os outros casos.\"\n");
                    System.out.println("3. Suspeitar de Scott e confrontá-lo: \n" + "\"Scott, o modelo do seu carro bate com a descrição do carro visto perto do local das últimas mortes. Muita coincidência, não acha?\"\n");

                    escolha = scanner.nextInt(); // Recebe a nova escolha
                    processarEscolha(jogador, escolha);
                    progresso = 4; // Avança para a próxima cena
                    break;
                case 4:
                    mostrarResultadoEscolha2(escolha);
                    progresso = 5; // Avança para a próxima cena de ação
                    break;


                case 5:
                System.out.println("Cena 5: Com a descoberta de novas pistas cruciais, Gen se vê confusa com tantas informações inesperadas e para lidar melhor com a situação e continuar conduzindo a investigação, ela precisa ampliar seu campo de visão e acredita agora que deve duvidar até de uma formiga no chão... ");
                        System.out.println("Escolhas:");
                System.out.println("1. Perguntar ao seu parceiro Joe se ele possuía algum tipo de relação com alguma das vítimas:\n"+"\"Joe, você conhecia alguma das vítimas antes dos assassinatos aconteceram? Soube que você já deu até carona para algumas delas... \"\n");
                System.out.println("2. Questionar Scott mais uma vez:\n"+ "\"Scott, eu soube que você comprou um carretel de linha na semana do primeiro assassinato e que coincidentemente é do mesmo tipo encontrado no seu quarto e da Jean e nas outras cenas de crime? Isso não é algo que podemos ignorar...\"\n");
                System.out.println("3. Refazer seus passos para verificar se não está deixando nada escapar:\n"+"\"Acho melhor visitar novamente as cenas dos crimes e ver se encontro algo melhor que uma fibra de linha de algodão, quem sabe acho até um veículo suspeito?! \"\n");

                escolha = scanner.nextInt(); // Recebe a nova escolha
                processarEscolha(jogador, escolha);
                progresso = 6; // Avança para a próxima cena
                break;
                case 6:
                    mostrarResultadoEscolha3(escolha);
                    progresso = 7; // Avança para a próxima cena de ação
                    break;


                case 7:

                    System.out.println("Cena 7 - Revelações Finais: Gen sente que o cerco está se fechando. Ela reuniu provas suficientes para confrontar o verdadeiro culpado, mas ainda está dividida entre Scott Summers e Joe Goldberg. As suspeitas são fortes para ambos, e qualquer movimento errado pode ser fatal. Mais do que nunca, Gen decide que é hora de agir e decide escolher em quem confiar. As evidências a levaram a um ponto onde ela sabe que um dos dois está mentindo, mas ainda precisa de uma última peça do quebra-cabeça. Ela marca um encontro com ambos separadamente, fingindo estar indecisa, mas na verdade pronta para desmascarar o verdadeiro culpado.");

                    System.out.println("Escolhas:");
                    System.out.println("1. Confiar em Joe Goldberg: Gen resolve que a única maneira de obter respostas é confiar em Joe. Ela acredita que Scott está tentando desviar as suspeitas e decide se unir a Joe para confrontar Scott juntos. \n"+ "\"Joe, como você é um amigo de longa data estou te confidencializando minhas conclusões para este caso, estou convencida de que Scott está escondendo algo. Precisamos confrontá-lo juntos e descobrir a verdade.\"\n");
                    System.out.println("2. Confiar em Scott Summers: Gen decide que precisa confiar em Scott. Algo na maneira como Joe reagiu às perguntas anteriores deixou Gen desconfiada. Ela se encontra com Scott em particular para discutir o próximo passo. \n"+ "\"Scott, acredito que você estava tentando me ajudar o tempo todo. Precisamos armar uma cilada para Joe. Ele é o único que pode ser o culpado, e temos que agir rápido.\"\n");

                    escolha = scanner.nextInt(); // Recebe a escolha final
                    processarEscolhaFinal(jogador, escolha);

                    // Atualiza o progresso do jogador e salva antes de encerrar
                    jogador.setProgressoCena(progresso);
                    salvarProgresso(jogador);

                    return; // Acaba tudo aqui Mari

            }
    }
    }
    //E aqui começa os métodos para mostrar as respostas e o negócio do help


    private static void mostrarAjuda () {
        System.out.println("Ajuda do Jogo:");
        System.out.println("1. Escolha as opções de 1 a 3 quando forem apresentadas.");
        System.out.println("2. Ao digitar 'proceed', você avança no jogo.");
        System.out.println("3. Digite 'help' a qualquer momento para rever essas instruções.");
        System.out.println("4. Seu progresso é salvo automaticamente após cada escolha.");
        System.out.println("5. Suas decisões afetam o desfecho da história.");

    }


    // as escolhas do jogador
    private static void processarEscolha(Jogador jogador, int escolha) {
        String descricao = "";
        switch (escolha) {
            case 1:
                descricao = "Pediu os arquivos das mortes anteriores.";
                break;
            case 2:
                descricao = "Visitou a cena do crime de Jean Gray.";
                break;
            case 3:
                descricao = "Entrevistou testemunhas e familiares das vítimas.";
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }
        System.out.println("Você escolheu a opção " + escolha + ".");
        EscolhaDao.createEscolha(jogador.getJogadorId(), escolha, descricao);
    }

    //  resultado da primeira escolha
    private static void mostrarResultadoEscolha1(int escolha) {
        switch (escolha) {
            case 1:
                System.out.println("Cena 2.1: Joe entrega os arquivos a Gen, que passa a noite analisando-os. Ela percebeu que todas as vítimas eram mulheres ruivas, altas, magras e tinham entre 20 e 30 anos.");
                break;
            case 2:
                System.out.println("Cena 2.2: Na cena do crime de Jean Gray, o quarto está revirado, com móveis desalinhados e sinais de luta. Gen observa atentamente cada detalhe, buscando qualquer pista que possa ter escapado aos investigadores anteriores. Sob a cama, algo chama sua atenção. É um pequeno pedaço de fibra de algodão manchada de sangue, quase imperceptível em meio à poeira e aos destroços. \n" +
                        " \n" +
                        "Gen recolhe a fibra cuidadosamente com uma pinça e a guarda em um saco plástico de evidências. Essa pequena fibra pode ser a chave para conectar esse assassinato aos outros crimes na cidade. Agora, com essa nova prova em mãos, ela precisa decidir seu próximo passo...");
                break;
            case 3:
                System.out.println("Cena 2.3: Durante as entrevistas, uma testemunha menciona ter visto um carro suspeito na área, que poderia pertencer à Scott. Isso planta uma semente de desconfiança. ");
                break;
        }

    }

    //resultado da segunda escolha
    private static void mostrarResultadoEscolha2(int escolha) {
        switch (escolha) {
            case 1:
                System.out.println("Cena 4.1:Gen compartilha suas descobertas com Scott. Scott menciona que Joe Goldberg conhecia todas as vítimas e que tinha um comportamento estranho em relação a elas. \n" +
                        "\"Joe estava sempre perto das vítimas, antes e depois das mortes. Ele até deu uma carona para Jean algumas vezes.”");
                break;
            case 2:
                System.out.println("Cena 4.2:Após Gen entregar a fibra de algodão manchada de sangue para Joe. Joe com um olhar desconfiado franziu a testa e mencionou que Scott anteriormente foi considerado suspeito pois na semana do primeiro assassinato ele foi visto comprando um carretel de linha daquela mesma fibra.  \n" +
                        "Só não prosseguimos com a investigação em cima do Scott por falta de provas.");
                break;
            case 3:
                System.out.println("Cena 4.3:Após confrontar Scott sobre o carro, Scott se defende dizendo que não é só ele que possui o carro daquele modelo. \n" +
                        "\"A cidade é pequena e esse tipo de carro ainda não é popular aqui, acredito que você consiga investigar os donos dos poucos carros como esse, começando pelo Joe...\" \n");
                break;
        }
    }

    //  resultado da terceira escolha
    private static void mostrarResultadoEscolha3(int escolha) {
        switch (escolha) {
            case 1:
                System.out.println("Cena 6.1: \n" + "\" Por que, Gen? Desconfia de mim agora? Como policial eu fazia e costumo fazer patrulha a noite para garantir a segurança da cidade e foi numa dessas noites que dei carona para algumas, afim de evitar que algo de ruim acontecesse com elas.\"\n");
                break;
            case 2:
                System.out.println("Cena 6.2: Com suas principais suspeitas em cima de Scott, o mesmo reage alegando ser inocente e dizendo que foi ele quem a contratou por intermédio do xerife.  \n" +
                        "“Com todo respeito Gen, por que alguém que fosse culpado cooperaria com as investigações e até contrataria um novo detetive para solucionar o caso? Sim, foi eu quem sugeriu a sua contratação ao xerife. E quanto a uma das provas que estou diretamente ligado e por isso devo ser um dos principais suspeitos, acredito eu que não passa de uma mera coincidência, pois sou um artista nato e gosto de presentear pessoas próximas mim com presentes cuidadosamente feitos a mão, como foi o caso da Jean, dei a ela uma linda pulseira feita com fibra de algodão e miçangas.”\n");
                break;
            case 3:
                System.out.println("Cena 6.3: Ao refazer seus passos, Gen descobre que apenas duas pessoas na cidade possuem o modelo de carro próximo ao local dos crimes. \n" +
                        "“Esse caso está ficando mais difícil do que achei que era, agora a única coisa suspeita é o modelo de carro que aparentemente somente Scott Summers e Joe Goldberg possuem....” \n");
                break;
        }
    }

    //  escolha final do jogador
    private static void processarEscolhaFinal(Jogador jogador, int escolha) {
        if (escolha == 1) {
            System.out.println( "Cena 8.1: Você confiou na pessoa errada e pagou o preço mais alto. Gen Winchester, uma jovem promissora, tornou-se mais uma vítima de um assassino que se esconde nas sombras. O verdadeiro horror não está apenas no ato, mas na traição que precedeu sua morte. Que essa tragédia seja um lembrete: no mundo da investigação, nem tudo é o que parece, e as aparências podem ser mortais. Como tudo aconteceu:  Gen decide que Scott é o culpado e confia em Joe para ajudá-la a prendê-lo. Ela marca um encontro com Scott em um local isolado, com Joe a acompanhando para garantir sua segurança. No entanto, durante o encontro, Joe revela suas verdadeiras intenções... Joe, aproveitando a oportunidade, ataca Gen enquanto ela está distraída, revelando que ele é o assassino. Ele tira um pedaço do fio de algodão que usou nos crimes anteriores e o utiliza para amarrar Gen. Em um ato cruel, ele a enforca com o mesmo fio que usou para matar as outras vítimas. Gen tenta resistir, mas é dominada e morre, tornando-se a mais recente vítima de Joe. Joe então foge da cidade, pronto para continuar seus crimes em outro lugar. Joe: Você foi tão fácil de manipular, Gen. Foi quase um jogo. E agora, assim como as outras, você será apenas mais uma história que nunca será contada. Gen: (lutando para respirar) Joe... você ... monstro... " );
        } else if (escolha == 2) {
            System.out.println("Cena 8.2: Parabéns, você desvendou o mistério e trouxe justiça para as vítimas. Graças à sua perspicácia e coragem, Gen Winchester conseguiu desmascarar o assassino e impedir que ele tirasse mais vidas. A cidade de Lawrence pode finalmente respirar aliviada, mas lembre-se: o mal pode se esconder nos lugares mais inesperados. Mantenha seus instintos afiados e sua desconfiança sempre alerta. Como tudo aconteceu: Gen e Scott armam um plano para expor Joe. Eles o chamam para um encontro sob o pretexto de que Gen encontrou novas provas que precisam ser analisadas. Joe, acreditando que pode manipular Gen, concorda em se encontrar com ela sozinho. Quando Joe chega, Gen o confronta com todas as evidências que recolheu. Joe, percebendo que foi descoberto, tenta atacar Gen para escapar, mas Scott aparece a tempo de intervir. Em uma luta desesperada, Gen consegue se defender e dispara contra Joe, matando-o em legítima defesa.Joe: Você não deveria ter se intrometido, Gen. Agora, ninguém vai poder me parar.Gen: Você subestimou o quanto eu queria justiça para essas mulheres. Isso termina agora.");
        } else {
            System.out.println("Escolha inválida.");
        }

        String descricao = "";
        int escolhaFinal = 0;
        EscolhaDao.createEscolha(jogador.getJogadorId(), escolhaFinal, descricao);
        System.out.println("Fim do jogo!");
    }

    private static void salvarProgresso(Jogador jogador) {
        try {
            JogadorDao.updateJogador(jogador);
            System.out.println("Progresso salvo com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    }









