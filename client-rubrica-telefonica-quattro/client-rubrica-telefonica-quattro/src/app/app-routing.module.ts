import { SelectorMatcher } from '@angular/compiler';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ConteggioComponent } from './conteggio/conteggio.component';
import { LoginErrorComponent } from './login-error/login-error.component';
import { LoginComponent } from './login/login.component';
import { MainPageComponent } from './main-page/main-page.component';
import { SearchPageComponent } from './search-page/search-page.component';

const routes: Routes = [
{path:"login",component:LoginComponent },
{path:"login-error",component:LoginErrorComponent },
{path:"conteggio",component:ConteggioComponent },
{path:"home",component:MainPageComponent },
{path:"ricerca",component:SearchPageComponent },
{path:"", redirectTo:"/home",pathMatch:'full' },
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
