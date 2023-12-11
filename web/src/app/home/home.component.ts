import {Component, Inject, PLATFORM_ID} from '@angular/core';
import {Produto} from '../classes/Produto';
import {ProdutoService} from '../produto.service';
import {isPlatformBrowser} from "@angular/common";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  produtos: Produto[] = [];
  isBrowser: any;

  constructor(public service: ProdutoService, @Inject(PLATFORM_ID) private platformId) {
    this.isBrowser = isPlatformBrowser(platformId);
  }

  async ngOnInit() {
    // this.produtos = await this.service.get()
    if (this.isBrowser){
      localStorage.setItem('key', 'value');
    }
  }

}
