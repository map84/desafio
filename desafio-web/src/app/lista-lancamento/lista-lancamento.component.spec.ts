import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaLancamentoComponent } from './lista-lancamento.component';

describe('ListaLancamentoComponent', () => {
  let component: ListaLancamentoComponent;
  let fixture: ComponentFixture<ListaLancamentoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListaLancamentoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaLancamentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
