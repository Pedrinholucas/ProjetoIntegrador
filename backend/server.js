const express = require('express');
var cors = require('cors')
var app = express()
app.use(cors());
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



app.listen(door, () => {
    console.log('aberto na porta '+door)
})