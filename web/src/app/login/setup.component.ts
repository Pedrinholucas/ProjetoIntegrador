import { Component } from '@angular/core';
import { Cliente } from '../classes/Cliente';
import { Fornecedor } from '../classes/Fornecedor';
import axios from 'axios';

@Component({
  selector: 'app-setup',
  templateUrl: './setup.component.html',
  styleUrl: './setup.component.css'
})
export class SetupComponent {
  client: boolean = true;
  cliente: Cliente = new Cliente();
  fornecedor: Fornecedor = new Fornecedor()

  cadastrar(){
    if(this.client){
      let str = `${this.cliente.cpf}, '${this.cliente.nome}', '${this.cliente.senha}', '${this.cliente.email}', ${this.cliente.telefone}`
      axios.post('http://localhost:3001/cliente', {str})
    }else{
      let str = `${this.fornecedor.cnpj}, '${this.fornecedor.nome}', '${this.fornecedor.email}', '${this.fornecedor.senha}'`
      axios.post('http://localhost:3001/fornecedor', {str})
      
    }
  }
}
