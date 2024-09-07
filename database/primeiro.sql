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
insert into jogador (nome, idade) values ( 1, 'Gen Winchester', '25');

