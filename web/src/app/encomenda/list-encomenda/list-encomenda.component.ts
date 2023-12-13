import { Component } from '@angular/core';
import { Encomenda } from '../../classes/Encomenda';
import axios from 'axios';
import { Router } from '@angular/router';
import { EncomendaService } from '../encomenda.service';

@Component({
  selector: 'app-list-encomenda',
  templateUrl: './list-encomenda.component.html',
  styleUrl: './list-encomenda.component.css'
})
export class ListEncomendaComponent {
  encomendas: Encomenda[] = [];
  constructor(public router: Router, public service: EncomendaService){}
  async ngOnInit(){
    //@ts-ignore
    this.encomendas = (await axios.get('http://localhost:3001/encomenda', {params: {id: JSON.parse(localStorage.getItem('user')).id}})).data
    console.log(this.encomendas)
  }

  excluirEncomenda(encomenda: Encomenda){
    axios.delete('http://localhost:3001/encomenda', {params: {id: encomenda.id}})
  }
}
