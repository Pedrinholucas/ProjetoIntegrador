import { Component } from '@angular/core';
import { Transportadora } from '../../classes/Transportadora';
import { Router } from '@angular/router';
import { TransportadoraService } from '../transportadora.service';
import axios from 'axios';

@Component({
  selector: 'app-form-transportadora',
  templateUrl: './form-transportadora.component.html',
  styleUrl: './form-transportadora.component.css'
})
export class FormTransportadoraComponent {
  transportadora: Transportadora = new Transportadora();
  constructor(public service: TransportadoraService, public router: Router){}
  ngOnInit(){
    if(this.service.transportadora)
    this.transportadora = this.service.transportadora;
  }

  salvarTransportadora(){
    let str = `'${this.transportadora.nome}', ${this.transportadora.cnpj}`
    if(!this.transportadora.id)
    axios.post('http://localhost:3001/transportadora', {str})
    else
    axios.put('http://localhost:3001/transportadora', this.transportadora)
    this.router.navigate(['list-transportadora'])
  }
}
