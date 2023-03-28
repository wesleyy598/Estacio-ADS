CREATE DATABASE atividadeWESLEY;

CREATE TABLE funcionario(
	idfuncionario int not null identity,
	nome VARCHAR(45) not null,
	carteiraTrabalho INT not null,
	dataContratacao DATE not null,
	salario FLOAT,
	primary key(idfuncionario)
);

CREATE TABLE funcao(
	idfuncao int not null identity,
	nome VARCHAR(45),
	primary key(idfuncao)
);

CREATE TABLE horario(
	idHorario int not null identity,
	horario TIME,
	primary key(idHorario)
);

CREATE TABLE sala(
	idSala int not null identity,
	nome VARCHAR(45),
	capacidade INT not null,
	primary key(idSala)
);

CREATE TABLE diretor(
	idDiretor int not null identity,
	nome VARCHAR(45),
	primary key(idDiretor)
);

CREATE TABLE genero(
	idgenero int not null identity,
	nome VARCHAR(45),
	primary key(idgenero)
);

CREATE TABLE premiacao(
	idpremiacao int not null identity,
	nome VARCHAR(45),
	ano INT not null,
	primary key(idpremiacao)
);

CREATE TABLE filme(
	idfilme int not null identity,
	nomeBR VARCHAR(45),
	nomeEN VARCHAR(45),
	anoLancamento INT not null,
	id_Diretor int not null,
	id_genero int not null,
	constraint fk_diretor_filme foreign key (id_Diretor) references Diretor(id),
	sinopse TEXT,
	constraint fk_genero_filme foreign key (id_genero) references genero(id),
	primary key(idfilme)
);

CREATE TABLE horario_trabalho_funcionario(
	horario_idhorario INT,
	funcionario_idfuncionario INT,
	id_funcao int not null,
	constraint fk_funcao_horario_trabalho_funcionario foreign key (id_funcao) references funcao(id)
);

CREATE TABLE filme_exibido_sala(
	filme_idfilme INT,
	sala_idsala INT,
	horario_idhorario INT
)

CREATE TABLE filme_has_premiacao(
	filme_idfilme INT,
	premiacao_idpremiacao INT,
	ganhou bit
)

-- FUNCAO, DIRETOR E GENERO SÃO ESTRANGEIROS --

CREATE TABLE dependente(
	
)

DROP TABLE premiacao
go

ALTER COLUMN nomeBR VARCHAR(100) not null

ALTER TABLE sala
add constraint validaCapacidade check(capacidade > 20)

ALTER TABLE dependente
add constraint PK_dependente primary key(id)

ALTER TABLE funcionario
add data_cadastro date not null

ALTER TABLE funcionario
drop constraint data_cadastro

sp_RENAME 'dependente' , 'depen'

-- 10 e 11 --

alter table depen 
add id_funcionario int not null identity

alter table depen 
ADD CONSTRAINT  fd_id_funcionario
FOREIGN KEY (id_funcionario)
REFERENCES funcionario (id_funcionario)


