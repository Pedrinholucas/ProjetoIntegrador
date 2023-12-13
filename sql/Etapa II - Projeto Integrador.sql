DROP DATABASE EmporioDonaMaria;
CREATE DATABASE EmporioDonaMaria;

USE EmporioDonaMaria;

CREATE TABLE Cliente(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
cpf BIGINT,
nome VARCHAR(255), 
senha Varchar(31),
email VARCHAR(63), 
telefone INT
);

CREATE TABLE Fornecedor (
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
cnpj BIGINT,
nome VARCHAR(255),
email VARCHAR(63),
senha Varchar(31),
);

CREATE TABLE Transportadora(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
cnpj BIGINT,
nome VARCHAR(255)
);

CREATE TABLE Categoria(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(255), 
descricao VARCHAR(2047)
);

CREATE TABLE Produto(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(255),
img VARCHAR(255),
valor FLOAT,
descricao VARCHAR(2047),
estoque INT,
detalhesGarantia VARCHAR(2047),
idFornecedor INT,
idCategoria INT,
FOREIGN KEY (idFornecedor) REFERENCES Fornecedor(id),
FOREIGN KEY (idCategoria) REFERENCES Categoria(id)
);

CREATE TABLE Avaliacao(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
numero FLOAT,
idProduto INT,
FOREIGN KEY (idProduto) REFERENCES Produto(id)
);

CREATE TABLE Encomenda(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
enderecoEntrega VARCHAR(255),
frete FLOAT,
valorTotal FLOAT,
dataAquisicao DATE,
dataEntrega DATE,
idCliente INT,
idTransportadora INT,
FOREIGN KEY (idCliente) REFERENCES Cliente(id),
FOREIGN KEY (idTransportadora) REFERENCES Transportadora(id)
);

CREATE TABLE Interesses (
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
idCliente INT,
idCategoria INT,
FOREIGN KEY (idCliente) REFERENCES Cliente(id),
FOREIGN KEY (idCategoria) REFERENCES Categoria(id)
); 

create table FornecedorTrans(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
idFornecedor INT,
idTransportadora INT,
FOREIGN KEY (idFornecedor) REFERENCES Fornecedor(id),
FOREIGN KEY (idTransportadora) REFERENCES Transportadora(id)
);

CREATE TABLE Reconhecimento(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
quantidade INT,
idProduto INT,
idEncomenda INT,
FOREIGN KEY (idProduto) REFERENCES Produto(id),
FOREIGN KEY (idEncomenda) REFERENCES Encomenda(id)
);

INSERT INTO Cliente (cpf, nome, senha, email, telefone) 
VALUES
(11111111111, 'Carlos Santos', 'senha111', 'carlos@email.com', 111111111 ),
(22222222222, 'Ana Rodrigues', 'senha222', 'ana@email.com', 222222222 ),
(33333333333, 'Pedro Almeida', 'senha333', 'pedro@email.com', 333333333 ),
(44444444444, 'Sandra Oliveira', 'senha444', 'sandra@email.com', 444444444 ),
(55555555555, 'Paulo Santos', 'senha555', 'paulo@email.com', 555555555 ),
(66666666666, 'Mariana Lima', 'senha666', 'mariana@email.com', 666666666 ),
(77777777777, 'Lucas Fernandes', 'senha777', 'lucas@email.com', 777777777 ),
(88888888888, 'Julia Alves', 'senha888', 'julia@email.com', 888888888 ),
(99999999999, 'João Silva', 'senha123', 'joao@email.com', 999999999 ),
(10101010101, 'Maria Souza', 'senha000', 'maria@email.com', 101010101)
;

INSERT INTO Fornecedor (CNPJ, nome, email, senha) 
VALUES
(11111111111111, 'Fornecedor A', 'fornecedor_a@email.com', 'senha5678'),
(22222222222222, 'Fornecedor B', 'fornecedor_b@email.com', 'abcd9012'),
(33333333333333, 'Fornecedor C', 'fornecedor_c@email.com', 'qwerty12'),
(44444444444444, 'Fornecedor D', 'fornecedor_d@email.com', 'senha3456'),
(55555555555555, 'Fornecedor E', 'fornecedor_e@email.com', 'abcd5678'),
(66666666666666, 'Fornecedor F', 'fornecedor_f@email.com', 'senha7890'),
(77777777777777, 'Fornecedor G', 'fornecedor_g@email.com', 'qwerty90'),
(88888888888888, 'Fornecedor H', 'fornecedor_h@email.com', 'abcd2345'),
(99999999999999, 'Fornecedor I', 'fornecedor_i@email.com', 'senha123'),
(10101010101010, 'Fornecedor J', 'fornecedor_j@email.com', 'abcd1234')
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

INSERT INTO Produto (nome, valor, descricao, estoque, detalhesGarantia, idFornecedor, idCategoria)
VALUES
('notebook', 2800.00, 'Notebook da  xuxa', 30, 'Possui garantia de 1 ano para falhas de fabrica e danos durante o transporte','https://th.bing.com/th/id/OIP.NPQJ0deft_aQVqs_mAjCYQHaFj?rs=1&pid=ImgDetMain', 1, 1),
('bone do corinthians', 33.00, 'Bone preto com brasão do Corinthian na parte frontal e ajuste de tamanho trazeiro', 54, 'Não possui garantia','https://th.bing.com/th/id/OIP.4g15mli9h30pMOZqkZmjdAHaHa?rs=1&pid=ImgDetMain', 2, 2),
('Harry Potter e a Pedra filosofal', 67.00, 'Livro do harry potter capa dura edição JBC 2003', 6, 'Não possui garantia','https://http2.mlstatic.com/D_NQ_NP_835050-MLU50462363202_062022E-O.webp', 3, 3),
('pote de marmita', 27.90, 'Vazilha para armazenar comida com 3 repartições', 98, 'Possui garantia de 3 meses para falhas de fabricação','https://lcpshop.net/wp-content/uploads/2022/10/1185796-oap9ne.jpg', 4, 4),
('Minoxidil', 60.00, 'Creme anti queda capiar, que estimula o cresimento de cabelo, 500g', 183, 'Não possui garantia','https://www.oficialfarma.com.br/media/catalog/product/m/i/minoxidil-turbinado-100ml-interrompe-a-queda-capilar.jpg?optimize=medium&bg-color=255,255,255&fit=bounds&height=500&width=480&canvas=480:500', 5, 5),
('Conjunto de cadeiras', 83.00, 'Conjunto de cadeiras de madeira com 15 unidades', 17,, 'Possui garantia de 6 meses para falhas de fabricação','https://cdn.leroymerlin.com.br/products/kit_8_x_cadeiras_masters_allegra_preto_1567167612_1b7e_600x600.jpg', 6, 6),
('capa para volante', 14.99, 'Capa protetora para volante, estampa animal print onça', 47, 'Não possui garantia','https://http2.mlstatic.com/D_NQ_NP_829176-MLB69255696454_052023-O.webp', 7, 7),
('bicicleta', 660.00, 'Bicicleta para trilha com 5 marchas', 36, 'Possui garantia de 6 meses para falhas de fabricação','https://http2.mlstatic.com/bicicleta-mongoose-brawler-freestyle-bmx-20-negra-D_NQ_NP_869280-MLM31224003855_062019-F.jpg', 8, 8),
('tabuleiro de xadres', 49.00, 'Tabuleiro de xadres convencional', 70, 'Possui garantia de 1 ano para falhas de fabrica e danos durante o transporte','https://http2.mlstatic.com/D_NQ_NP_2X_874476-MLB45837988839_052021-F.webp', 9, 9),
('action figure: Big Daddy - Bioshock', 900.00, 'Figure figma 15 cm com 3 variações de rosto', 3, 'Possui garantia de 5 meses para falhas de fabrica e danos durante o transporte','https://static3.tcdn.com.br/img/img_prod/460977/boneco_big_daddy_bioshock_2_neca_cg_42062_1_20201211173001.jpg', 10, 10)
;

INSERT INTO Avaliacao(numero, idProduto)
VALUES
(5,1),
(1,1),
(3,3),
(4,4),
(5,5),
(6,6),
(7,7),
(8,8),
(9,9),
(10,10);

INSERT INTO Encomenda (enderecoEntrega, formaPagamento, frete, valorTotal, dataAquisicao, dataEntrega, idCliente, idTransportadora) 
VALUES
('Rua A, 123', 'Cartão', 10.00, 2810.00, '2023-05-01', '2023-05-05', 1, 1),
('Rua B, 456', 'Boleto', 00, 38.00, '2023-05-02', '2023-05-06', 2, 2),
('Rua C, 789', 'Transferência', 7.50, 74.50, '2023-05-03', '2023-05-07', 3, 3),
('Rua D, 012', 'Boleto', 00, 35.00, '2023-05-04', '2023-05-08', 4, 4),
('Rua E, 345', 'Cartão', 12.50, 72.50, '2023-05-05', '2023-05-09', 5, 5),
('Rua F, 678', 'Boleto', 00, 88.00, '2023-05-06', '2023-05-10', 6, 1),
('Rua G, 901', 'Transferência', 9.50, 23.49, '2023-05-07', '2023-05-11', 7, 2),
('Rua H, 234', 'Cartão', 6.00, 666.00, '2023-05-08', '2023-05-12', 8, 3),
('Rua I, 567', 'Boleto', 50, 56.50, '2023-05-09', '2023-05-13', 9, 4),
('Rua J, 890', 'Transferência', 10.00, 910.00, '2023-05-10', '2023-05-14', 10, 5)
;

INSERT INTO Interesses (idCliente, idCategoria)
VALUES
(1,1),
(2,2),
(3,3),
(4,4),
(5,5),
(6,6),
(7,7),
(8,8),
(9,9),
(10,10);

INSERT INTO TornecedorTrans (idFornecedor, idTransportadora)
VALUES
(1,1),
(2,2),
(3,3),
(4,4),
(5,5),
(6,1),
(7,2),
(8,3),
(9,4),
(10,5);

INSERT INTO Reconhecimento (quantidade, idProduto, idEncomenda)
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
(10,10,10);


#ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '1234';

#flush privileges;

