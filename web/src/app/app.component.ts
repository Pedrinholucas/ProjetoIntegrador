import { Component, EventEmitter, Output, afterNextRender } from '@angular/core';
import { InjectionToken  } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})

export class AppComponent {
  usuario = user
  constructor(public router: Router) {}
  title = 'Empório Dona Maria';
  sidenavOpened = false;
  logar = false;
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
}
export let user: any = ''

export function updateUser(valor: any){
  user = valor
}

