import { Component } from '@angular/core';

@Component({
  selector: 'app-simple-ng-model-component',
  templateUrl: './simple-ng-model-component.component.html',
  styleUrl: './simple-ng-model-component.component.css'
})
export class SimpleNgModelComponentComponent {
  name: string = '';

  setValue() {
    this.name = 'Nancy';
  }
}
