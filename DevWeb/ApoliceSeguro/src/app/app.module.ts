import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ApoliceComponent } from './apolice/apolice.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
// import { CadastroAlunoComponent } from './cadastro-aluno/cadastro-aluno.component';


@NgModule({
  declarations: [
    AppComponent,
    ApoliceComponent,
    // CadastroAlunoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CommonModule,
    FormsModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
