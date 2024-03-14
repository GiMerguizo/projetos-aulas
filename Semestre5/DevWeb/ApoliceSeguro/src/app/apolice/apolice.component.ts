import { Component } from '@angular/core';

@Component({
  selector: 'app-apolice',
  templateUrl: './apolice.component.html',
  styleUrl: './apolice.component.css'
})
export class ApoliceComponent {
  nome: string = '';
/*
  setValue(nome: string) {
    this.nome = nome;+
  }

  getValue() {
    console.log(this.nome)
  }*/

  exibirNome() {
    this.nome = getElementById('nome').value
    alert('O nome digitado foi: ' + this.nome);
  }
}


function getElementById(arg0: string) {
  throw new Error('Function not implemented.');
}

