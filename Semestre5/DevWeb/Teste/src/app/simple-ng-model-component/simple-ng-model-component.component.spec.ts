import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SimpleNgModelComponentComponent } from './simple-ng-model-component.component';

describe('SimpleNgModelComponentComponent', () => {
  let component: SimpleNgModelComponentComponent;
  let fixture: ComponentFixture<SimpleNgModelComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SimpleNgModelComponentComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SimpleNgModelComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
