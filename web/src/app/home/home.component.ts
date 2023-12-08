import { Component } from '@angular/core';
import { Produto } from '../classes/Produto';
import { ProdutoService } from '../produto.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  constructor(public service: ProdutoService) { }
  produtos: Produto[] = [];
 async ngOnInit(){
    this.produtos = await this.service.get()
  }
}
