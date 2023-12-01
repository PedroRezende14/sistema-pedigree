drop database projetofinal;
create database projetofinal; 
 

create table projetofinal.usuarios(
	id_usuario int primary key auto_increment,
	nome_usuario varchar(50),
    senha_usuario Varchar(50),
    email_usuario Varchar(50)
    );


create table projetofinal.dadoscao(
	nmicrochip int auto_increment,
	nomecao varchar(50)  ,
	Raca varchar(50) ,
    registrostudbook varchar(50),
    cor varchar (20)  ,
    origemraca varchar(30),
    criador varchar(50) ,
    sexo varchar (23) ,
    primary key (nMicroChip)
);

create table projetofinal.pai(
	pk_pai int auto_increment, 
    nomepai varchar (50),
    registrostudbook varchar(50),
	primary key (pk_pai)
);

create table projetoFinal.Mae(
	pk_mae int auto_increment, 
    nomemae varchar (50),
    registrostudbook varchar(50),
	primary key (pk_mae)
);
select * from projetofinal.dadoscao;
select * from projetoFinal.Mae;
select * from projetofinal.pai;
select * from projetofinal.usuarios;


#drop table projetofinal.usuarios;
#where cpf = 1 and senha_usuario = '1';
