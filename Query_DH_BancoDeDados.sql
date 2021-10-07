CREATE DATABASE bancodedados;
USE bancodedados;

---------------------------------------------------------------------------------------

CREATE TABLE vendedores(
	codigo bigint NOT NULL AUTO_INCREMENT,
	cpf varchar(255) NOT NULL,
	nome varchar(255) NOT NULL,
	PRIMARY KEY (codigo)
);

CREATE TABLE enderecos (
	id bigint NOT NULL AUTO_INCREMENT,
	vendedores_codigo bigint,
	cep varchar(255),
	logradouro varchar(255),
	complemento varchar(255),
	numero integer not null,
	uf varchar(255),
	cidade varchar(255),
	PRIMARY KEY (id),
    FOREIGN KEY (vendedores_codigo) references vendedores(codigo)
);

CREATE TABLE anuncios(
	codigo bigint NOT NULL AUTO_INCREMENT,
	titulo varchar(15) NOT NULL,
	codigo_vendedor bigint(4) NOT NULL,
	preco decimal(10,2) NOT NULL,
	data_anuncio date NOT NULL,
	num_vendas int(4) NOT NULL,
	PRIMARY KEY (codigo),
	FOREIGN KEY (codigo_vendedor) references vendedores(codigo)
);
---------------------------------------------------------------------------------------

INSERT INTO vendedores(codigo, cpf, nome, endereco, cidade, uf) 
VALUES (null, "111.111.111-11", "Jhony", "Rua Um, 11", "Sao Paulo", "SP") ;

INSERT INTO enderecos(id, vendedores_codigo, cep, logradouro, complemento, numero, uf, cidade) 
VALUES (null, 1, "11111-11", "Rua Um", "Ap 11", 111, "SP", "Sao Paulo") ;

INSERT INTO anuncios(codigo, titulo, codigo_vendedor, preco, data_anuncio, num_vendas) 
VALUES (null, "Patinete ES4", 1, 4000.00, "2021/10/05", 10) ;

--------------------------------------------------------------------------------------

select * from endereco;
select * from vendedores;
select * from anuncios;

--------------------------------------------------------------------------------------

drop table endereco;
drop table vendedores;
drop table anuncios;

--------------------------------------------------------------------------------------

delete from anuncios where codigo_vendedor = 2;

--------------------------------------------------------------------------------------

alter table vendedores add column endereco_codigo integer;



