import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ContattoService } from './services/contatto.service';
import { UtenteService } from './services/utente.service';
import { AdminComponent } from './components/admin/admin.component';
import { HomeComponent } from './components/home/home.component';
import { ViewContattoComponent } from './components/view-contatto/view-contatto.component';
import { EditContattoComponent } from './components/edit-contatto/edit-contatto.component';
import { SearchContattoComponent } from './components/search-contatto/search-contatto.component';
import { MainMenuComponent } from './components/main-menu/main-menu.component';


@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    HomeComponent,
    ViewContattoComponent,
    EditContattoComponent,
    SearchContattoComponent,
    MainMenuComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [ContattoService, UtenteService],
  bootstrap: [AppComponent]
})
export class AppModule { }
