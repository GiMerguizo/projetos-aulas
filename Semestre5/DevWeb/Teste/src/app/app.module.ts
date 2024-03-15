import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TesteComponent } from './teste/teste.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { SimpleNgModelComponentComponent } from './simple-ng-model-component/simple-ng-model-component.component';

@NgModule({
  declarations: [
    AppComponent,
    TesteComponent,
    SimpleNgModelComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    CommonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
