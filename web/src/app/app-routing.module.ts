import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SetupComponent } from './login/setup.component';
import { ClienteComponent } from './cliente/cliente.component';

const routes: Routes = [{
  path: '', component: HomeComponent
},{
  path: 'signup', component: SetupComponent
},{
  path: 'cliente', component: ClienteComponent
},];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
