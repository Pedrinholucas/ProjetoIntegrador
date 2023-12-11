import { Component } from '@angular/core';

@Component({
  selector: 'nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrl: './nav-bar.component.css'
})
export class NavBarComponent {
  routes: any[] = [{label: 'Suas Transportadoras' ,rota: 'transportadora'}, {label: 'Seus Produtos' ,rota: 'produto'}]

}
