import {Component, Inject, PLATFORM_ID} from '@angular/core';
import {Produto} from '../classes/Produto';
import {ProdutoService} from '../produto.service';
import {isPlatformBrowser} from "@angular/common";
import axios from 'axios';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  produtos: Produto[] = [];
  isBrowser: any;
  user: any;
  constructor(public service: ProdutoService, @Inject(PLATFORM_ID) private platformId, public router: Router) {
    this.isBrowser = isPlatformBrowser(platformId);
  }

  async ngOnInit() {
    this.produtos = await this.service.get()
    if (this.isBrowser){
      // @ts-ignore
      this.user = JSON.parse(localStorage.getItem('user'));
      this.produtos = (await axios.post('http://localhost:3001/filtrarProdutos', this.user)).data
    } 
  }

}
