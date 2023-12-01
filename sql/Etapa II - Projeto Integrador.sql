DROP DATABASE EmporioDonaMaria;
CREATE DATABASE EmporioDonaMaria;

USE EmporioDonaMaria;

CREATE TABLE Cliente(
codCliente INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
cpf BIGINT,
nome VARCHAR(255), 
senha VARCHAR(31), 
email VARCHAR(63), 
telefone INT,
numeroCartao BIGINT,
interesses VARCHAR(2047)
);

CREATE TABLE Fornecedor (
codFornecedor INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
cnpj BIGINT,
nome VARCHAR(255),
email VARCHAR(63),
senha VARCHAR(31),
avaliacao FLOAT,
meiosPagamento VARCHAR(2047)
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
valor FLOAT,
descricao VARCHAR(2047),
quantidadeEstoque INT,
avaliacao FLOAT,
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
frete FLOAT,
valorTotal FLOAT,
dataAquisicao DATE,
dataEntrega DATE,
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


INSERT INTO Cliente (cpf, nome, senha, email, telefone, numeroCartao, interesses) 
VALUES
(11111111111, 'Carlos Santos', 'senha111', 'carlos@email.com', 111111111, 1111111111111111, 'Tecnologia'),
(22222222222, 'Ana Rodrigues', 'senha222', 'ana@email.com', 222222222, 2222222222222222, 'Moda'),
(33333333333, 'Pedro Almeida', 'senha333', 'pedro@email.com', 333333333, 3333333333333333, 'Esportes'),
(44444444444, 'Sandra Oliveira', 'senha444', 'sandra@email.com', 444444444, 4444444444444444, 'Alimentação'),
(55555555555, 'Paulo Santos', 'senha555', 'paulo@email.com', 555555555, 5555555555555555, 'Decoração'),
(66666666666, 'Mariana Lima', 'senha666', 'mariana@email.com', 666666666, 6666666666666666, 'Viagens'),
(77777777777, 'Lucas Fernandes', 'senha777', 'lucas@email.com', 777777777, 7777777777777777, 'Esportes'),
(88888888888, 'Julia Alves', 'senha888', 'julia@email.com', 888888888, 8888888888888888, 'Jogos'),
(99999999999, 'João Silva', 'senha123', 'joao@email.com', 999999999, 9999999999999999, 'Esportes'),
(10101010101, 'Maria Souza', 'senha000', 'maria@email.com', 101010101, 1010101010101010, 'Automoveis')
;

INSERT INTO Fornecedor (CNPJ, nome, email, senha, avaliacao, meiosPagamento) 
VALUES
(11111111111111, 'Fornecedor A', 'fornecedor_a@email.com', 'senha5678', 3, 'Boleto, Transferência'),
(22222222222222, 'Fornecedor B', 'fornecedor_b@email.com', 'abcd9012', 2, 'Transferência, Cartão'),
(33333333333333, 'Fornecedor C', 'fornecedor_c@email.com', 'qwerty12', 1, 'Boleto, Transferência'),
(44444444444444, 'Fornecedor D', 'fornecedor_d@email.com', 'senha3456', 5, 'Boleto, Cartão'),
(55555555555555, 'Fornecedor E', 'fornecedor_e@email.com', 'abcd5678', 4, 'Transferência, Cartão'),
(66666666666666, 'Fornecedor F', 'fornecedor_f@email.com', 'senha7890', 3, 'Boleto, Transferência'),
(77777777777777, 'Fornecedor G', 'fornecedor_g@email.com', 'qwerty90', 2, 'Boleto, Cartão'),
(88888888888888, 'Fornecedor H', 'fornecedor_h@email.com', 'abcd2345', 5, 'Transferência, Cartão'),
(99999999999999, 'Fornecedor I', 'fornecedor_i@email.com', 'senha123', 4, 'Cartão, Transferência'),
(10101010101010, 'Fornecedor J', 'fornecedor_j@email.com', 'abcd1234', 5, 'Boleto, Cartão')
;

INSERT INTO Transportadora (nome, cnpj) 
VALUES
('Transportadora X', '11111111111111'),
('Transportadora Y', '22222222222222'),
('Transportadora Z', '33333333333333'),
('Transportadora W', '44444444444444'),
('Transportadora V', '55555555555555')
;

INSERT INTO Categoria (nome, descricao) 
VALUES
('Eletrônicos', 'Produtos eletrônicos em geral'),
('Roupas', 'Vestuário e acessórios'),
('Livros', 'Livros de diversos gêneros'),
('Alimentos', 'Produtos alimentícios variados'),
('Cosméticos', 'Produtos de beleza e cuidados pessoais'),
('Móveis', 'Móveis para casa e escritório'),
('Automóveis', 'Peças e acessórios para automóveis'),
('Esportes', 'Artigos esportivos e equipamentos'),
('Jogos', 'Jogos de tabuleiro, vídeo games e consoles'),
('Decoração', 'Objetos de decoração para ambientes')
;

INSERT INTO Produto (nome, valor, descricao, quantidadeEstoque, avaliacao, detalhesGarantia, codFornecedor, codCategoria)
VALUES
('notebook', 2800.00, 'Notebook da  xuxa', 30, 5, 'Possui garantia de 1 ano para falhas de fabrica e danos durante o transporte', 1, 1),
('bone do corinthians', 33.00, 'Bone preto com brasão do Corinthian na parte frontal e ajuste de tamanho trazeiro', 54, 4.5, 'Não possui garantia', 2, 2),
('Harry Potter e a Pedra filosofal', 67.00, 'Livro do harry potter capa dura edição JBC 2003', 6, 3.8, 'Não possui garantia', 3, 3),
('pote de marmita', 27.90, 'Vazilha para armazenar comida com 3 repartições', 98, 2.5, 'Possui garantia de 3 meses para falhas de fabricação', 4, 4),
('creme para calvice', 60.00, 'Creme anti queda capiar, que estimula o cresimento de cabelo, 500g', 183, 5, 'Não possui garantia', 5, 5),
('Conjunto de cadeiras', 83.00, 'Conjunto de cadeiras de madeira com 15 unidades', 17, 2.3, 'Possui garantia de 6 meses para falhas de fabricação', 6, 6),
('capa para volante', 14.99, 'Capa protetora para volante, estampa animal print onça', 47, 1.8, 'Não possui garantia', 7, 7),
('bicicleta', 660.00, 'Bicicleta para trilha com 5 marchas', 36, 4.8, 'Possui garantia de 6 meses para falhas de fabricação', 8, 8),
('tabuleiro de xadres', 49.00, 'Tabuleiro de xadres convencional', 70, 5, 'Possui garantia de 1 ano para falhas de fabrica e danos durante o transporte', 9, 9),
('action figure: Big Daddy - Bioshock', 900.00, 'Figure figma 15 cm com 3 variações de rosto', 3, 5, 'Possui garantia de 5 meses para falhas de fabrica e danos durante o transporte', 10, 10)
;

INSERT INTO Encomenda (enderecoEntrega, formaPagamento, frete, valorTotal, dataAquisicao, dataEntrega, codCliente, codTransportadora) 
VALUES
('Rua A, 123', 'Cartão', 10.00, 2810.00, '2023-05-01', '2023-05-05', 1, 1),
('Rua B, 456', 'Boleto', 5.00, 38.00, '2023-05-02', '2023-05-06', 2, 2),
('Rua C, 789', 'Transferência', 7.50, 74.50, '2023-05-03', '2023-05-07', 3, 3),
('Rua D, 012', 'Boleto', 8.00, 35.00, '2023-05-04', '2023-05-08', 4, 4),
('Rua E, 345', 'Cartão', 12.50, 72.50, '2023-05-05', '2023-05-09', 5, 5),
('Rua F, 678', 'Boleto', 5.00, 88.00, '2023-05-06', '2023-05-10', 6, 1),
('Rua G, 901', 'Transferência', 9.50, 23.49, '2023-05-07', '2023-05-11', 7, 2),
('Rua H, 234', 'Cartão', 6.00, 666.00, '2023-05-08', '2023-05-12', 8, 3),
('Rua I, 567', 'Boleto', 7.50, 56.50, '2023-05-09', '2023-05-13', 9, 4),
('Rua J, 890', 'Transferência', 10.00, 910.00, '2023-05-10', '2023-05-14', 10, 5)
;

INSERT INTO Reconhecimento (quantidade, codProduto, codEncomenda)
VALUES
(1,1,1),
(2,2,2),
(3,3,3),
(4,4,4),
(5,5,5),
(6,6,6),
(7,7,7),
(8,8,8),
(9,9,9),
(10,10,10)
;