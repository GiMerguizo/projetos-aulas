import { Component } from '@angular/core';

@Component({
  selector: 'app-cadastro-aluno',
  templateUrl: './cadastro-aluno.component.html',
  styleUrls: ['./cadastro-aluno.component.css']
})
export class CadastroAlunoComponent {
  aluno = {
    ra: '',
    nome: '',
    email: '',
    celular: ''
  };

  cadastrarAluno() {
    console.log(this.aluno);
    // Aqui você pode adicionar a lógica para enviar os dados do aluno para um servidor ou serviço
  }
}
