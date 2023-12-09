CREATE DATABASE EmporioDonaMaria;

USE EmporioDonaMaria;

CREATE TABLE Cliente(
codCliente INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
cpf BIGINT,
nome VARCHAR(255), 
senha VARCHAR(31), 
email VARCHAR(63), 
telefone INT
);

CREATE TABLE Fornecedor (
codFornecedor INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
cnpj BIGINT,
nome VARCHAR(255),
email VARCHAR(63),
senha VARCHAR(31),
avaliacao FLOAT(1)
);

CREATE TABLE Transportadora(
codTransportadora INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
cnpj BIGINT,
nome VARCHAR(255)
);

CREATE TABLE Categoria(
codCategoria INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(255), 
descricao VARCHAR(2047)
);

CREATE TABLE Produto(
codProduto INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(255),
valor FLOAT(2),
descricao VARCHAR(2047),
quantidadeEstoque INT,
avaliacao FLOAT(1),
detalhesGarantia VARCHAR(2047),
codFornecedor INT,
codCategoria INT,
FOREIGN KEY (codFornecedor) REFERENCES Fornecedor(codFornecedor),
FOREIGN KEY (codCategoria) REFERENCES Categoria(codCategoria)
);

CREATE TABLE Encomenda(
codEncomenda INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
enderecoEntrega VARCHAR(255),
formaPagamento VARCHAR(63),
frete FLOAT(2),
valorTotal FLOAT(2),
dataAquisicao DATE,
dataEntrega DATE,
codCliente INT,
codTransportadora INT,
FOREIGN KEY (codCliente) REFERENCES Cliente(codCliente),
FOREIGN KEY (codTransportadora) REFERENCES Transportadora(codTransportadora)
);

CREATE TABLE Interesses (
codInteresse INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
codCliente INT,
codCategoria INT,
FOREIGN KEY (codCliente) REFERENCES Cliente(codCliente),
FOREIGN KEY (codCategoria) REFERENCES Categoria(codCategoria)
); 

CREATE TABLE PreferenciasTransp(
codPreferencia INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
codCliente INT,
codTransportadora INT,
FOREIGN KEY (codCliente) REFERENCES Cliente(codCliente),
FOREIGN KEY (codTransportadora) REFERENCES Transportadora(codTransportadora)
);

CREATE TABLE Reconhecimento(
codReconhecimento INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
quantidade INT,
codProduto INT,
codEncomenda INT,
FOREIGN KEY (codProduto) REFERENCES Produto(codProduto),
FOREIGN KEY (codEncomenda) REFERENCES Encomenda(codEncomenda)
);
