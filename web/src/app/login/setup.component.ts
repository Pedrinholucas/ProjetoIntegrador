import { Component } from '@angular/core';
import { Cliente } from '../classes/Cliente';
import { Fornecedor } from '../classes/Fornecedor';
import axios from 'axios';
import { Categoria } from '../classes/Categoria';
import { ProdutoService } from '../produto/produto.service';
import { Router } from '@angular/router';
import { updateUser } from '../app.component';

@Component({
  selector: 'app-setup',
  templateUrl: './setup.component.html',
  styleUrl: './setup.component.css'
})
export class SetupComponent {
  client: boolean = true;
  cliente: Cliente = new Cliente();
  fornecedor: Fornecedor = new Fornecedor()
  listaCategoria: Categoria[];
  interesseValue: number;
  constructor(public service: ProdutoService, public router: Router){}
  async ngOnInit(){
    this.listaCategoria = await this.service.getCategoria();
  }
 async cadastrar(){
    if(this.client){
      let str = `${this.cliente.cpf}, '${this.cliente.nome}', '${this.cliente.senha}', '${this.cliente.email}', ${this.cliente.telefone}`;
      let id = (await axios.post('http://localhost:3001/cliente', {str})).data.count;
      this.cliente.id = id;
      console.log(id)
      console.log(this.interesseValue)
      let str1 = `${id}, ${this.interesseValue}`;

      axios.post('http://localhost:3001/interesse', {str: str1})

    }else{
      let str = `${this.fornecedor.cnpj}, '${this.fornecedor.nome}', '${this.fornecedor.email}', '${this.fornecedor.senha}'`
      axios.post('http://localhost:3001/fornecedor', {str})
    }
    let user: any = this.client? this.cliente: this.fornecedor
    user.tipo = this.client? 'cliente' : 'fornecedor'
    localStorage.setItem('user', JSON.stringify(user))
    updateUser(user)
    this.router.navigate([''])
  }

  trocarInteresse(e){
    console.log(e);
    this.interesseValue = e.value;
  }
}
