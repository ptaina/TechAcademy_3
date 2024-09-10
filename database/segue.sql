create table if not exists cenas (
	id int auto_increment primary key,
	descricao text
);

create table jogador (
	id int primary key auto_increment,
	nome varchar (80),
	idade int,
	progresso_cena int default 1
);

create table inventario (
	id int primary key auto_increment,
	jogador_id int,
	item_nome varchar (100),
	descricao text,
	foreign key (jogador_id) references jogador(id)
);

create table cena (
	id int primary key auto_increment,
	descricao text,
	proxima_cena_a int,
	proxima_cena_b int,
	proxima_cena_c int,
	foreign key (proxima_cena_a) references cena(id) on delete set null,
	foreign key (proxima_cena_b) references cena(id) on delete set null,
	foreign key (proxima_cena_c) references cena(id) on delete set null
);

create table escolha (
	id int primary key auto_increment,
	jogador_id int,
	cena_id int,
	escolha varchar (100),
	foreign key (jogador_id) references jogador(id),
	foreign key (cena_id) references cena(id)
);

create table prova (
	id int primary key auto_increment,
	jogador_id int,
	descricao text,
	data_encontrada date,
	cena_encontrada int,
	foreign key (jogador_id) references jogador(id),
	foreign key (cena_encontrada) references cena(id)
);

create table estado_jogo (
	id int primary key auto_increment,
	jogador_id int,
	cena_atual int,
	foreign key (jogador_id) references jogador(id),
	foreign key (cena_atual) references cena(id)
);

create table personagem (
	id int auto_increment primary key,
	nome varchar(100) not null,
	descricao text,
	papel varchar (255)
);

ALTER TABLE cena ADD personagem_id INT;

ALTER TABLE cena 
ADD CONSTRAINT fk_personagem
FOREIGN KEY (personagem_id) REFERENCES personagem(id) ON DELETE SET NULL;

insert into jogador (nome, idade) values ('Gen Winchester', 25);

INSERT INTO personagem (nome, descricao, papel) 
VALUES 
('Scott Summers', 'Melhor amigo de Jean Gray e colega de quarto', 'Suspeito'),
('Joe Goldberg', 'Parceiro de Gen e amigo de longa data', 'Parceiro'),
('Jean Gray', 'Vítima de assassinato, colega de quarto de Scott', 'Vítima'),
('Gen Winchester', 'Protagonista e perita criminal', 'Jogadora');

INSERT INTO cena (descricao) VALUES ('Introdução: Nesse jogo você é Gen Winchester, uma perita criminal recém-formada de 25 anos, que é contratada pelo xerife de Lawrence, uma pequena cidade no Texas, para investigar uma série de assassinatos de mulheres. A mais recente vítima é Jean Gray, a melhor amiga e colega de quarto de Scott Summers. Para acelerar a investigação, Gen contacta o seu antigo parceiro da polícia local, Joe Goldberg.');

INSERT INTO cena (descricao) VALUES ('Cena 1:Gen chega ao escritório do xerife já acompanhada por Joe Goldberg e são recepcionados por Scott Summers na porta de entrada, que parece exausto e ansioso. Joe a apresenta ao xerife e deixa Scott explicar que a sua colega de quarto Jean Gray foi brutalmente assassinada, assim como várias outras mulheres antes dela. Gen decide que é hora de botar a mão na massa:  
');


INSERT INTO cena (descricao) VALUES ('Cena 2.1: Joe entrega os arquivos a Gen, que passa a noite analisando-os. Ela percebeu que todas as vítimas eram mulheres ruivas, altas, magras e tinham entre 20 e 30 anos.');


INSERT INTO cena (descricao) VALUES ('Cena 2.2:Na cena do crime de Jean Gray, o quarto está revirado, com móveis desalinhados e sinais de luta. Gen observa atentamente cada detalhe, buscando qualquer pista que possa ter escapado aos investigadores anteriores. Sob a cama, algo chama sua atenção. É um pequeno pedaço de fibra de algodão manchada de sangue, quase imperceptível em meio à poeira e aos destroços. 
 
Gen recolhe a fibra cuidadosamente com uma pinça e a guarda em um saco plástico de evidências. Essa pequena fibra pode ser a chave para conectar esse assassinato aos outros crimes na cidade. Agora, com essa nova prova em mãos, ela precisa decidir seu próximo passo... 
');


INSERT INTO cena (descricao) VALUES ('Cena 2.3: Durante as entrevistas, uma testemunha menciona ter visto um carro suspeito na área, que pode pertencer a Scott. Isso planta uma semente de desconfiança em Gen.');


INSERT INTO cena (descricao) VALUES ('Cena 3: Com as novas informações adquiridas, Gen decide de qualquer maneira manter seu foco na cena do crime e no melhor amigo da vítima Scott, pois acredita que apesar da perícia ser minuciosa algo às vezes pode passar batido.');

INSERT INTO cena (descricao) VALUES ('Cena 4.1: Gen compartilha suas descobertas com Scott. Scott menciona que Joe Goldberg conhecia todas as vítimas e que tinha um comportamento estranho em relação a elas. 
"Joe estava sempre perto das vítimas, antes e depois das mortes. Ele até deu uma carona para Jean algumas vezes.” ');


INSERT INTO cena (descricao) VALUES ('Cena 4.2: Após Gen entregar a fibra de algodão manchada de sangue para Joe. Joe com um olhar desconfiado franziu a testa e mencionou que Scott anteriormente foi considerado suspeito pois na semana do primeiro assassinato ele foi visto comprando um carretel de linha daquela mesma fibra.  
"Só não prosseguimos com a investigação em cima do Scott por falta de provas". ');


INSERT INTO cena (descricao) VALUES ('Cena 4.3:  Após confrontar Scott sobre o carro, Scott se defende dizendo que não é só ele que possui o carro daquele modelo. 
"A cidade é pequena e esse tipo de carro ainda não é popular aqui, acredito que você consiga investigar os donos dos poucos carros como esse, começando pelo Joe..." 
');


INSERT INTO cena (descricao) VALUES ('Cena 5: Com a descoberta de novas pistas cruciais, Gen se vê confusa com tantas informações inesperadas e para lidar melhor com a situação e continuar conduzindo a investigação, ela precisa ampliar seu campo de visão e acredita agora que deve duvidar até de uma formiga no chão... ');


INSERT INTO cena (descricao) VALUES ('Cena 6.1:  “Por que, Gen? Desconfia de mim agora? Como policial eu fazia e costumo fazer patrulha a noite para garantir a segurança da cidade e foi numa dessas noites que dei carona para algumas, afim de evitar que algo de ruim acontecesse com elas”  
');


INSERT INTO cena (descricao) VALUES ('Cena 6.2: Com suas principais suspeitas em cima de Scott, o mesmo reage alegando ser inocente e dizendo que foi ele quem a contratou por intermédio do xerife.  
“Com todo respeito Gen, por que alguém que fosse culpado cooperaria com as investigações e até contrataria um novo detetive para solucionar o caso? Sim, foi eu quem sugeriu a sua contratação ao xerife. E quanto a uma das provas que estou diretamente ligado e por isso devo ser um dos principais suspeitos, acredito eu que não passa de uma mera coincidência, pois sou um artista nato e gosto de presentear pessoas próximas mim com presentes cuidadosamente feitos a mão, como foi o caso da Jean, dei a ela uma linda pulseira feita com fibra de algodão e miçangas.”  
');


INSERT INTO cena (descricao) VALUES ('Cena 6.3: Ao refazer seus passos, Gen descobre que apenas duas pessoas na cidade possuem o modelo de carro próximo ao local dos crimes. 
“Esse caso está ficando mais difícil do que achei que era, agora a única coisa suspeita é o modelo de carro que aparentemente somente Scott Summers e Joe Goldberg possuem....”
');


INSERT INTO cena (descricao) VALUES ('Cena 7: Gen sente que o cerco está se fechando. Ela reuniu provas suficientes para confrontar o verdadeiro culpado, mas ainda está dividida entre Scott Summers e Joe Goldberg. As suspeitas são fortes para ambos, e qualquer movimento errado pode ser fatal.  
Mais do que nunca, Gen decide que é hora de agir e decide escolher em quem confiar. As evidências a levaram a um ponto onde ela sabe que um dos dois está mentindo, mas ainda precisa de uma última peça do quebra-cabeça. Ela marca um encontro com ambos separadamente, fingindo estar indecisa, mas na verdade pronta para desmascarar o verdadeiro culpado. 
');


INSERT INTO cena (descricao) VALUES ('Cena 8.1:"Você confiou na pessoa errada e pagou o preço mais alto. Gen Winchester, uma jovem promissora, tornou-se mais uma vítima de um assassino que se esconde nas sombras. O verdadeiro horror não está apenas no ato, mas na traição que precedeu sua morte. Que essa tragédia seja um lembrete: no mundo da investigação, nem tudo é o que parece, e as aparências podem ser mortais." 
Como tudo aconteceu:  Gen decide que Scott é o culpado e confia em Joe para ajudá-la a prendê-lo. Ela marca um encontro com Scott em um local isolado, com Joe a acompanhando para garantir sua segurança. No entanto, durante o encontro, Joe revela suas verdadeiras intenções...  
Joe, aproveitando a oportunidade, ataca Gen enquanto ela está distraída, revelando que ele é o assassino. Ele tira um pedaço do fio de algodão que usou nos crimes anteriores e o utiliza para amarrar Gen. Em um ato cruel, ele a enforca com o mesmo fio que usou para matar as outras vítimas. Gen tenta resistir, mas é dominada e morre, tornando-se a mais recente vítima de Joe. Joe então foge da cidade, pronto para continuar seus crimes em outro lugar. 
Joe: "Você foi tão fácil de manipular, Gen. Foi quase um jogo. E agora, assim como as outras, você será apenas mais uma história que nunca será contada." 
Gen: (lutando para respirar) "Joe... você ... monstro..."  
 ');


INSERT INTO cena (descricao) VALUES ('Cena 8.2:  "Parabéns, você desvendou o mistério e trouxe justiça para as vítimas. Graças à sua perspicácia e coragem, Gen Winchester conseguiu desmascarar o assassino e impedir que ele tirasse mais vidas. A cidade de Lawrence pode finalmente respirar aliviada, mas lembre-se: o mal pode se esconder nos lugares mais inesperados. Mantenha seus instintos afiados e sua desconfiança sempre alerta." 
Como tudo aconteceu: Gen e Scott armam um plano para expor Joe. Eles o chamam para um encontro sob o pretexto de que Gen encontrou novas provas que precisam ser analisadas. Joe, acreditando que pode manipular Gen, concorda em se encontrar com ela sozinho. 
Quando Joe chega, Gen o confronta com todas as evidências que recolheu. Joe, percebendo que foi descoberto, tenta atacar Gen para escapar, mas Scott aparece a tempo de intervir. Em uma luta desesperada, Gen consegue se defender e dispara contra Joe, matando-o em legítima defesa. 
Joe: "Você não deveria ter se intrometido, Gen. Agora, ninguém vai poder me parar." 
 
Gen: "Você subestimou o quanto eu queria justiça para essas mulheres. Isso termina agora." 

');

select * from cena;

UPDATE cena SET proxima_cena_a = 2, proxima_cena_b = 3, proxima_cena_c = 4 WHERE id = 1;

UPDATE cena SET proxima_cena_a = NULL, proxima_cena_b = NULL, proxima_cena_c = NULL WHERE id = 2;

UPDATE cena SET proxima_cena_a = NULL, proxima_cena_b = NULL, proxima_cena_c = NULL WHERE id = 3;

UPDATE cena SET proxima_cena_a = NULL, proxima_cena_b = NULL, proxima_cena_c = NULL WHERE id = 4;

UPDATE cena SET proxima_cena_a = 5, proxima_cena_b = 6, proxima_cena_c = 7 WHERE id = 5;

UPDATE cena SET proxima_cena_a = NULL, proxima_cena_b = NULL, proxima_cena_c = NULL WHERE id = 6;

UPDATE cena SET proxima_cena_a = NULL, proxima_cena_b = NULL, proxima_cena_c = NULL WHERE id = 7;

UPDATE cena SET proxima_cena_a = 8, proxima_cena_b = 9, proxima_cena_c = 10 WHERE id = 8;

UPDATE cena SET proxima_cena_a = NULL, proxima_cena_b = NULL, proxima_cena_c = NULL WHERE id = 9;

UPDATE cena SET proxima_cena_a = NULL, proxima_cena_b = NULL, proxima_cena_c = NULL WHERE id = 10;

UPDATE cena SET proxima_cena_a = NULL, proxima_cena_b = NULL, proxima_cena_c = NULL WHERE id = 11;

UPDATE cena SET proxima_cena_a = NULL, proxima_cena_b = NULL, proxima_cena_c = NULL WHERE id = 12;

UPDATE cena SET proxima_cena_a = NULL, proxima_cena_b = NULL, proxima_cena_c = NULL WHERE id = 13;

UPDATE cena SET proxima_cena_a = NULL, proxima_cena_b = NULL, proxima_cena_c = NULL WHERE id = 14;

UPDATE cena SET proxima_cena_a = NULL, proxima_cena_b = NULL, proxima_cena_c = NULL WHERE id = 15;

UPDATE cena SET proxima_cena_a = NULL, proxima_cena_b = NULL, proxima_cena_c = NULL WHERE id = 16;

INSERT INTO escolha (jogador_id, cena_id, escolha) 
VALUES 
(1, 3, 'Pedir os arquivos das mortes anteriores a Joe'),
(1, 4, 'Visitar a cena do crime de Jean Gray'),
(1, 5, 'Entrevistar testemunhas e familiares das vítimas'),
(1,7, 'Compartilhar novas descobertas com Scott'),
(1,8, 'Entregar uma das provas encontradas'),
(1,9, 'Suspeitar de Scott e confrotar o mesmo'),
(1,11, 'Questionar Joe'),
(1,12, 'Questionar Scott mais uma vez'),
(1,13,'Refazer seus passos'),
(1,15,'Confiar em Joe'),
(1,16, 'Confiar em Scott');


 