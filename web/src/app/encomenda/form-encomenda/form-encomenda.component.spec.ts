import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormEncomendaComponent } from './form-encomenda.component';

describe('FormEncomendaComponent', () => {
  let component: FormEncomendaComponent;
  let fixture: ComponentFixture<FormEncomendaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [FormEncomendaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FormEncomendaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
