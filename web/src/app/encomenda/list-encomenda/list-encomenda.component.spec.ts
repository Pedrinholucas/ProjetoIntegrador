import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListEncomendaComponent } from './list-encomenda.component';

describe('ListEncomendaComponent', () => {
  let component: ListEncomendaComponent;
  let fixture: ComponentFixture<ListEncomendaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ListEncomendaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListEncomendaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
