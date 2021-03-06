import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { LoginErrorComponent } from './login-error/login-error.component';
import { MainPageComponent } from './main-page/main-page.component';
import { ConteggioComponent } from './conteggio/conteggio.component';
import { SearchPageComponent } from './search-page/search-page.component';
import { CampiComponent } from './campi/campi.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    LoginErrorComponent,
    MainPageComponent,
    ConteggioComponent,
    SearchPageComponent,
    CampiComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
