import { isPlatformBrowser } from '@angular/common';
import { Component, EventEmitter, Inject, Output, PLATFORM_ID, afterNextRender } from '@angular/core';
import { InjectionToken  } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})

export class AppComponent {
  usuario = user
  isBrowser: boolean;
  constructor(public router: Router, @Inject(PLATFORM_ID) private platformId) {    
    this.isBrowser = isPlatformBrowser(platformId);
  }
  title = 'Empório Dona Maria';
  sidenavOpened = false;
  logar = false;
  ngOnInit(){
    if(this.isBrowser && localStorage.getItem('user')){
      console.log('penis')
      //@ts-ignore
      this.usuario = JSON.parse(localStorage.getItem('user'))
    }
  }
  toggleSidenav() {
    console.log('cu')
    this.sidenavOpened = !this.sidenavOpened;
  }
  fazerSexo(a?: any){
    this.logar = false;
    if(a){
      user = a
    this.usuario = user
    }
    console.log(this.logar)
  }
  caminhao(){
    if(this.usuario.tipo == 'cliente')
    this.router.navigate(['list-encomenda'])
    else if(this.usuario.tipo == 'fornecedor')
    this.router.navigate(['list-transportadora'])
  }
}
export let user: any = {tipo: ''}

export function updateUser(valor: any){
  user = valor
}

export function datar(a: Date){
  let str = '';
  str += a.getFullYear()
  str += '-'+a.getMonth()
  if(a.getDay() >= 10)
  str += '-'+a.getDay()
  else
  str += '-0'+a.getDay()
  return str
}

export function desdatar(a: string){
  let date = new Date();
  
}

