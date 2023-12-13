import { Injectable } from '@angular/core';
import { Encomenda } from '../classes/Encomenda';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class EncomendaService {
  encomenda: Encomenda;
  idTransportadora
  editando: boolean = false;
  constructor(public router: Router) { }
  produtoToEncomenda(encomenda: Encomenda, transportadora: number) {
    this.encomenda = encomenda;
    this.encomenda.idTransportadora = transportadora;
    this.idTransportadora = transportadora;
    console.log(this.idTransportadora);
    this.router.navigate(['encomenda']);
  }

  novoProduto(encomenda: Encomenda){
    this.encomenda = encomenda;
    this.router.navigate(['novo-produto']);
  }
}
