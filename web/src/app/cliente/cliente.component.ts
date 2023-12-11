import { Component } from '@angular/core';
import { updateUser, user } from '../app.component';
import axios from 'axios';

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrl: './cliente.component.css'
})
export class ClienteComponent {
  client = user;

  save() {
    updateUser(this.client);
    axios.put('http://localhost:3001/cliente', this.client)
    console.log('Cliente salvo:', this.client);
  }
}
