import { Component } from '@angular/core';
import { Encomenda } from '../../classes/Encomenda';
import { EncomendaService } from '../encomenda.service';
import { datar } from '../../app.component';
import axios from 'axios';
import { Router } from '@angular/router';

@Component({
  selector: 'app-form-encomenda',
  templateUrl: './form-encomenda.component.html',
  styleUrl: './form-encomenda.component.css'
})
export class FormEncomendaComponent {
  encomenda: Encomenda = new Encomenda();
  constructor(private service: EncomendaService, public router: Router){}
  async ngOnInit(){
    if(this.service.encomenda){
      this.encomenda = this.service.encomenda
      if(this.service.editando)
      this.encomenda.produtos = (await axios.post('http://localhost:3001/filtrarProdutos', {tipo: 'encomenda', id: this.encomenda.id})).data
    }
  }
  
  adicionarNovoProduto(){
    this.service.novoProduto(this.encomenda)
  }

  adicionarUnidade(index){
    this.encomenda.produtos[index].quantidade ++
  }

  subtrairUnidade(index){
    if(this.encomenda.produtos[index].quantidade > 1)
    this.encomenda.produtos[index].quantidade --
  }

  async salvar(){
    this.service.editando = false;
    this.encomenda.valorTotal = 0;
    this.encomenda.produtos.map(produto => {
      this.encomenda.valorTotal += (produto.valor * produto.quantidade)
    })
    let data = new Date()
    this.encomenda.dataAquisicao = datar(data)
    console.log(datar(data))
    data.setDate(data.getDate() + 7)
    this.encomenda.dataEntrega = datar(data)
    //@ts-ignore
    this.encomenda.idCliente = JSON.parse(localStorage.getItem('user')).id
    let str = `'${this.encomenda.endereco}', '${this.encomenda.formaPagamento}', ${this.encomenda.valorTotal}, '${this.encomenda.dataAquisicao}', '${this.encomenda.dataEntrega}', ${this.encomenda.idCliente}, ${this.service.idTransportadora}`
    this.encomenda.id = (await axios.post('http://localhost:3001/encomenda', {str})).data.insertId;
    this.encomenda.produtos.map(produto => {
      let str = `${produto.quantidade}, ${produto.id}, ${this.encomenda.id}`
      axios.post('http://localhost:3001/reconhecimento', { str })
    })
    this.router.navigate(['list-encomenda'])
  }
}
