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






select * from cena;
show tables cena;



delete from cena where id = 9;
