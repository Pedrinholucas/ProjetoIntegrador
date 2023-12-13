import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SetupComponent } from './login/setup.component';
import { ClienteComponent } from './cliente/cliente.component';
import { FormProdutoComponent } from './produto/form-produto/form-produto.component';
import { FormEncomendaComponent } from './encomenda/form-encomenda/form-encomenda.component';
import { ListEncomendaComponent } from './encomenda/list-encomenda/list-encomenda.component';
import { AdicionarProdutoComponent } from './adicionar-produto/adicionar-produto.component';
import { FormTransportadoraComponent } from './transportadora/form-transportadora/form-transportadora.component';
import { ListTransportadoraComponent } from './transportadora/list-transportadora/list-transportadora.component';

const routes: Routes = [{
  path: '', component: HomeComponent
},{
  path: 'signup', component: SetupComponent
},{
  path: 'cliente', component: ClienteComponent
},{
  path: 'produto', component: FormProdutoComponent
},{
  path: 'encomenda', component:FormEncomendaComponent
},{
  path: 'list-encomenda', component: ListEncomendaComponent
},{
  path: 'novo-produto', component: AdicionarProdutoComponent
},{
  path: 'transportadora', component: FormTransportadoraComponent
},{
  path: 'list-transportadora', component: ListTransportadoraComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
