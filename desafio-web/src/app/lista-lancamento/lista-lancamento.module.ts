import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListaLancamentoComponent } from './lista-lancamento.component';
import { ListaLancamentoService } from './lista-lancamento.service';
import { FormsModule } from '@angular/forms';

@NgModule({
  imports: [CommonModule, FormsModule],
  declarations: [ListaLancamentoComponent],
  exports: [ListaLancamentoComponent],
  providers: [ListaLancamentoService]
})
export class ListaLancamentoModule { }
