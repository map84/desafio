import { ListaLancamentoModule } from './lista-lancamento.module';

describe('ListaLancamentoModule', () => {
  let listaLancamentoModule: ListaLancamentoModule;

  beforeEach(() => {
    listaLancamentoModule = new ListaLancamentoModule();
  });

  it('should create an instance', () => {
    expect(listaLancamentoModule).toBeTruthy();
  });
});
