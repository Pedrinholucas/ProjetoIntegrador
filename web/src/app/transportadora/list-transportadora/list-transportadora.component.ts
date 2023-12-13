import { Component } from '@angular/core';
import { Transportadora } from '../../classes/Transportadora';
import axios from 'axios';
import { Router } from '@angular/router';
import { TransportadoraService } from '../transportadora.service';

@Component({
  selector: 'app-list-transportadora',
  templateUrl: './list-transportadora.component.html',
  styleUrl: './list-transportadora.component.css'
})
export class ListTransportadoraComponent {
  transportadoras: Transportadora[];
  constructor(public service: TransportadoraService, public router: Router){}
  async ngOnInit(){
    this.transportadoras = (await axios.get('http://localhost:3001/transportadora')).data
  };

  excluirTransportadora(transportadora: Transportadora){
    axios.delete('http://localhost:3001/transportadora', {params: {id: transportadora.id}})
  }
  adicionarTransportadora(){
    this.service.transportadora = new Transportadora();
    this.router.navigate(['transportadora'])
  }
}
