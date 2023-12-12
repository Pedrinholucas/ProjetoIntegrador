import { Injectable } from '@angular/core';
import axios from 'axios';
import { Produto } from './classes/Produto';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  produto: Produto | null;
  constructor(public router: Router) { }

  async get(){
    let a =await axios.get('http://localhost:3001/produto')
    return (a.data);
  }

  async getCategoria(){
    let a =await axios.get('http://localhost:3001/categoria')
    return (a.data);
  }

  async getUniqueCategoria(idCategoria: number){
    let params = {id: idCategoria}
    console.log(params)
    let a = await axios.get('http://localhost:3001/categoria', { params })
    return (a.data);
  }

  salvar(produto: Produto) {
    let str = `'${produto.nome}', ${produto.valor}, '${produto.descricao}', ${produto.estoque}, '${produto.detalhesGarantia}', ${produto.idFornecedor}, ${produto.idCategoria}`
    console.log(str)
    if(!produto.id)
    axios.post('http://localhost:3001/produto', {str})
    else
    axios.put('http://localhost:3001/produto', produto)
    this.router.navigate([''])
  }
}
