import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SetupComponent } from './login/setup.component';
import { ClienteComponent } from './cliente/cliente.component';
import { FormProdutoComponent } from './produto/form-produto/form-produto.component';

const routes: Routes = [{
  path: '', component: HomeComponent
},{
  path: 'signup', component: SetupComponent
},{
  path: 'cliente', component: ClienteComponent
},{
  path: 'produto', component: FormProdutoComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
