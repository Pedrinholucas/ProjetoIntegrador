import { Component, Inject, PLATFORM_ID } from '@angular/core';
import { Produto } from '../../classes/Produto';
import { ProdutoService } from '../../produto.service';
import { Categoria } from '../../classes/Categoria';
import { isPlatformBrowser } from '@angular/common';
import axios from 'axios';

@Component({
  selector: 'app-form-produto',
  templateUrl: './form-produto.component.html',
  styleUrl: './form-produto.component.css'
})
export class FormProdutoComponent {
  produto: Produto = new Produto();
  listaCategoria: Categoria[];
  categoriaValue: Categoria = new Categoria();
  isBrowser: boolean;
  user: any;
  avaliacao: number;
  avaliar: boolean = false;
  nota: number;
  constructor(public service: ProdutoService, @Inject(PLATFORM_ID) private platformId) {
    this.isBrowser = isPlatformBrowser(platformId);
  }  async ngOnInit(){
    if(this.service.produto){
      this.produto = this.service.produto;
      this.categoriaValue = await this.service.getUniqueCategoria(this.produto.idCategoria)
      console.log(this.categoriaValue)
    }
    this.listaCategoria = await this.service.getCategoria();
    if (this.isBrowser){
      //@ts-ignore
      this.user = JSON.parse(localStorage.getItem('user'));
      if(this.user.tipo == 'cliente' && this.service.produto){
        let params = {id: this.produto.id}
        console.log(params)
        let avaliation = (await axios.get('http://localhost:3001/avaliacao', {params})).data[0]
        this.avaliacao = avaliation.sum / avaliation.count
      }
    }
  }
  save(){
    this.service.salvar(this.produto)
  }
  trocarCategoria(a){
    this.produto.idCategoria = a.value
  }
  avaliation(){
    axios.post('http://localhost:3001/avaliacao', {idProduto: this.produto.id, numero: this.nota})
    alert('Avaliação salva!')
    this.avaliar = false
  }
}
