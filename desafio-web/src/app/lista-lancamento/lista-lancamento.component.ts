import { Import } from '@angular/compiler-cli/src/ngtsc/host';
import { ListaLancamentoService } from './lista-lancamento.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lista-lancamento',
  templateUrl: './lista-lancamento.component.html',
  styleUrls: ['./lista-lancamento.component.css']
})
export class ListaLancamentoComponent implements OnInit {

  list: any  = [];
  status: string;
  description: string;
  id: string;

  constructor(private listaLancamentoService: ListaLancamentoService) {
    this.status = '';
    this.description = '';
    this.id = '';

    this.list = this.listaLancamentoService.getItems(this.id, this.description, this.status);
    console.log(this.list);
  }

  ngOnInit() {
  }

  showItems(){
    this.list = this.listaLancamentoService.getItems(this.id, this.description, this.status);
    console.log(this.list);
  }

}
