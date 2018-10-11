import { TestBed } from '@angular/core/testing';

import { ListaLancamentoService } from './lista-lancamento.service';

describe('ListaLancamentoService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ListaLancamentoService = TestBed.get(ListaLancamentoService);
    expect(service).toBeTruthy();
  });
});
