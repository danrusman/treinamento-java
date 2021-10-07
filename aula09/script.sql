# cria um novo BD - DataBase
CREATE DATABASE bd_itau;

# Marca o BD como default (padrão)
USE bd_itau;

# criar uma table no BD
CREATE TABLE carro (
	codigo integer not null AUTO_INCREMENT,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(100),
    anoFabricacao INTEGER,
    CONSTRAINT pk_carro PRIMARY KEY (codigo)
);

# PRIMARY KEY serve para identificar unicamente uma linha na tabela
# FOREIGN KEY serve para relacionar as tabelas
CREATE TABLE cliente (
	codigo integer NOT NULL AUTO_INCREMENT,
	nome VARCHAR(120) NOT NULL,
    telefone varchar(15) NOT NULL UNIQUE,
    cod_carro INTEGER,
    CONSTRAINT pk_cliente PRIMARY KEY (codigo),
	CONSTRAINT fk_carro FOREIGN KEY (cod_carro) references carro(codigo)
);

# inserir dados na tabela
INSERT INTO carro VALUES (
	NULL, "Chevrolet", "Cruze", 2020
);
INSERT INTO carro VALUES (
	NULL, "Tesla", "Model S", 2020
);
INSERT INTO carro VALUES (
	NULL, "Ferrari", "F400", 2020
);
INSERT INTO cliente VALUES (
	null, "Carlos Augusto", "(11) 1111-1111", 1
);
INSERT INTO cliente VALUES (
	null, "Marcos Silva", "(11) 1111-2222", 2
);
INSERT INTO cliente VALUES (
	null, "Gabriela", "(11) 1111-3333", 3
);
INSERT INTO cliente VALUES (
	null, "Fabiana", "(11) 1111-4444", 2
);


# buscar todas as informações da tabela
SELECT * FROM carro;

# busque apenas a marca, o modelo e o ano
SELECT marca, modelo, anoFabricacao FROM carro;

# busque as informações sobre o carro fabricados após o ano de 2019
SELECT * from carro
	WHERE anoFabricacao > 2019;
    
# SELECT <quais colunas>
# FROM <qual(is) tabela(s)>
# WHERE <condição>

# listar todos os clientes
SELECT * FROM cliente;

# listar os carros com seus proprietarios
SELECT * FROM carro
	INNER JOIN cliente ON carro.codigo = cliente.cod_carro;
    
# alteração de dados

# alterar o telefone do cliente Carlos
UPDATE cliente
		SET telefone = "(19) 9999-8888"
        WHERE codigo = 1;

# apagar dados
DELETE FROM cliente
	WHERE codigo = 4;

# apagar um carro do BD
DELETE FROM carro
	WHERE codigo = 3;
    