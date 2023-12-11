import { Component, EventEmitter, Output } from '@angular/core';
import axios from 'axios';
import { AppComponent } from '../app.component';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  constructor() { }
  @Output() login = new EventEmitter()
  email: string = 'carlos@email.com';
  senha: string = 'senha111';
  usuario: string = 'Cliente'
  ngOnInit(){}

  async logar(){
    let cu = {email: this.email, senha: this.senha}
    console.log(cu)
    if(this.usuario == 'Cliente'){
      let req = await axios.post('http://localhost:3001/cliente/login', cu)
      console.log(req.data)
      if(req.data[0]){
        req.data[0].tipo = 'cliente'
        this.login.emit(req.data[0])
      }
      else
      alert('Cliente não encontrado')
    } else{
      let req = await axios.post('http://localhost:3001/fornecedor/login', cu)
      console.log(req.data)
      if(req.data[0]){
        req.data[0].tipo = 'fornecedor'
        this.login.emit(req.data[0])
      }
      else
      alert('Fornecedor não encontrado')      
    }
  }
}
