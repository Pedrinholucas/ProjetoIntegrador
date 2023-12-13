import { Component } from '@angular/core';
import { EncomendaService } from '../encomenda/encomenda.service';
import { Router } from '@angular/router';
import axios from 'axios';
import { Produto } from '../classes/Produto';

@Component({
  selector: 'app-adicionar-produto',
  templateUrl: './adicionar-produto.component.html',
  styleUrl: './adicionar-produto.component.css'
})
export class AdicionarProdutoComponent {
  produtos: Produto[] = [];
  constructor(public service: EncomendaService, public router: Router) {}

  async ngOnInit() {
    console.log('init')
    if(this.service.idTransportadora)
    this.produtos = (await axios.post('http://localhost:3001/filtrarProdutos',{tipo: 'transportadora', id: this.service.idTransportadora})).data
    
  }

}
