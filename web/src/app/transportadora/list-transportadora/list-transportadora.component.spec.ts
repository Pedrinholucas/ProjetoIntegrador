import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListTransportadoraComponent } from './list-transportadora.component';

describe('ListTransportadoraComponent', () => {
  let component: ListTransportadoraComponent;
  let fixture: ComponentFixture<ListTransportadoraComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ListTransportadoraComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListTransportadoraComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
