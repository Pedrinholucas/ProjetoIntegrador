const express = require('express');
var cors = require('cors')
var app = express()
app.use(cors());
app.use(express.json());
var mysql = require('mysql');
let door = 3001;
var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "1234"
});

con.connect(function(err) {
    if (err) throw err;
    console.log("Connected!");
});

app.get('/', function(req, res) {
    res.send('hello world');
});

app.post('/', (req, res) => {
    console.log(req.body)
    res.send('pinto')
})

app.get('/produto', function(req, res) {
    con.query('USE EmporioDonaMaria;');
    con.query('select * from produto;', function (err, result) {
        if (err) {
            res.send('deu erro kkkkkkkkkkkkk '+err.code)
            throw err;
        }
        console.log('me chamaram')
        res.send(result)
    });
});
app.post('/produto', (req, res) => {
    console.log(req.body)
    con.query('USE EmporioDonaMaria;');
    con.query('INSERT INTO Produto (nome, valor, descricao, estoque, detalhesGarantia, idFornecedor, idCategoria) values ('+req.body.str+');', function (err, result) {
        if (err) {
            res.send('deu erro kkkkkkkkkkkkk '+err.code)
            throw err;
        }
        console.log(result)
        res.send(result)
    });
})
app.put('/produto', function(req, res) {
    con.query('USE EmporioDonaMaria;');
    con.query(`update produto set nome = '${req.body.nome}', img = '${req.body.img}', valor = ${req.body.valor}, descricao = '${req.body.descricao}', estoque = ${req.body.estoque}, detalhesGarantia = '${req.body.detalhesGarantia}', idFornecedor = ${req.body.idFornecedor}, idCategoria = ${req.body.idCategoria} where id = ${req.body.id}`, function (err, result) {
        if (err) {
            res.send('Ocorreu um erro: ' + err.code);
            throw err;
        }
        console.log(result);
        res.send(result);
    });
});



app.get('/cliente', function(req, res) {
    con.query('USE EmporioDonaMaria;');
    con.query('SELECT * FROM Cliente;', function (err, result) {
        if (err) {
            res.send('Ocorreu um erro: ' + err.code);
            throw err;
        }
        console.log(result[0]);
        res.send(result);
    });
});
app.post('/cliente/login', (req, res) => {
    console.log(req.body)
    con.query('USE EmporioDonaMaria;');
    con.query(`select * from cliente where email = '${req.body.email}' and senha = '${req.body.senha}'`, function (err, result) {
        if (err) {
            res.send('deu erro kkkkkkkkkkkkk '+err.code)
            throw err;
        }
        console.log(result)
        res.send(result)
    });
})
app.post('/cliente', (req, res) => {
    con.query('USE EmporioDonaMaria;');
    con.query('insert into cliente (cpf, nome, senha, email, telefone) values ('+req.body.str+');', function (err, result) {
        if (err) {
            res.send('deu erro kkkkkkkkkkkkk '+err.code)
            throw err;
        }
        console.log(result)
        res.send(result)
    });
})

app.put('/cliente', function(req, res) {
    con.query('USE EmporioDonaMaria;');
    con.query(`update cliente set nome = '${req.body.nome}', email = '${req.body.email}', telefone = '${req.body.telefone}' where id = ${req.body.id}`, function (err, result) {
        if (err) {
            res.send('Ocorreu um erro: ' + err.code);
            throw err;
        }
        console.log(result);
        res.send(result);
    });
});

app.get('/fornecedor', function(req, res) {
    con.query('USE EmporioDonaMaria;');
    con.query('SELECT * FROM Fornecedor;', function (err, result) {
        if (err) {
            res.send('Ocorreu um erro: ' + err.code);
            throw err;
        }
        console.log(result[0]);
        res.send(result);
    });
});
app.post('/fornecedor/login', (req, res) => {
    console.log(req.body)
    con.query('USE EmporioDonaMaria;');
    con.query(`select * from fornecedor where email = '${req.body.email}' and senha = '${req.body.senha}'`, function (err, result) {
        if (err) {
            res.send('deu erro kkkkkkkkkkkkk '+err.code)
            throw err;
        }
        console.log(result)
        res.send(result)
    });
})
app.post('/fornecedor', (req, res) => {
    con.query('USE EmporioDonaMaria;');
    con.query('insert into fornecedor (cnpj, nome, email, senha) values ('+req.body.str+');', function (err, result) {
        if (err) {
            res.send('deu erro kkkkkkkkkkkkk '+err.code)
            throw err;
        }
        console.log(result)
        res.send(result)
    });
})

app.get('/encomenda', function(req, res) {
    con.query('USE EmporioDonaMaria;');
    con.query('SELECT * FROM Encomenda;', function (err, result) {
        if (err) {
            res.send('Ocorreu um erro: ' + err.code);
            throw err;
        }
        console.log(result[0]);
        res.send(result);
    });
});
app.get('/categoria', function(req, res) {
    con.query('USE EmporioDonaMaria;');
    if(Object.keys(req.query).length != 0){
        con.query("SELECT * FROM Categoria where id = '"+req.query.id+"';", function (err, result) {
            if (err) {
                res.send('Ocorreu um erro: ' + err.code);
                throw err;
            }
            console.log(result[0]);
            res.send(result[0]);
        });
    }else
    con.query('SELECT * FROM Categoria;', function (err, result) {
        if (err) {
            res.send('Ocorreu um erro: ' + err.code);
            throw err;
        }
        console.log(result[0]);
        res.send(result);
    });
});


app.get('/transportadora', function(req, res) {
    con.query('USE EmporioDonaMaria;');
    con.query('SELECT * FROM Transportadora;', function (err, result) {
        if (err) {
            res.send('Ocorreu um erro: ' + err.code);
            throw err;
        }
        console.log(result[0]);
        res.send(result);
    });
});
app.post('/transportadora', (req, res) => {
    con.query('USE EmporioDonaMaria;');
    con.query('insert into transportadora (nome, cnpj) values ('+req.body+');', function (err, result) {
        if (err) {
            res.send('deu erro kkkkkkkkkkkkk '+err.code)
            throw err;
        }
        console.log(result)
        res.send(result)
    });
})

app.post('/filtrarProdutos', (req, res) => {
    con.query('USE EmporioDonaMaria;');
    if(req.body.tipo == 'cliente')
    con.query(`select * from produto where idCategoria in (select idCategoria from Interesses where idCliente = ${req.body.id})`, function (err, result) {
        if (err) {
            res.send('deu erro kkkkkkkkkkkkk '+err.code)
            throw err;
        }
        res.send(result)
    });
    else
    con.query(`select * from produto where idFornecedor = ${req.body.id}`, function (err, result) {
        if (err) {
            res.send('deu erro kkkkkkkkkkkkk '+err.code)
            throw err;
        }
        res.send(result)
    })
})

app.get('/avaliacao', function(req, res) {
    con.query('USE EmporioDonaMaria;');
    con.query('SELECT sum(numero) as sum, count(id) as count FROM Avaliacao where idProduto = '+req.query.id+';', function (err, result) {
        if (err) {
            res.send('Ocorreu um erro: ' + err.code);
            throw err;
        }
        console.log(result);
        res.send(result);
    });
});
app.post('/avaliacao', (req, res) => {
    con.query('USE EmporioDonaMaria;');
    con.query('insert into avaliacao (numero, idProduto) values ('+req.body.numero+', '+req.body.idProduto+');', function (err, result) {
        if (err) {
            res.send('deu erro kkkkkkkkkkkkk '+err.code)
            throw err;
        }
        console.log(result)
        res.send(result)
    });
})

app.listen(door, () => {
    console.log('aberto na porta '+door)
})