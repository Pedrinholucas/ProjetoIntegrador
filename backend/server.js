const express = require('express');
var app = express();
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
    con.query('USE EmporioDonaMaria;');
    con.query('select * from produto;', function (err, result) {
        if (err) throw err;
        console.log(result[0])
    });
});

app.listen(door, () => {
    console.log('aberto na porta '+door)
})