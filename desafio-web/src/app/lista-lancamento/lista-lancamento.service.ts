import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable()
export class ListaLancamentoService {

  items: any  = [];

  constructor(private http: HttpClient) { }

  getItems(id: String, description: String, status: String) {

    var URL = `http://localhost:8081/account/launch?status=${status}&description=${description}&id=${id}`;

    //alert('Id: ' + id + ',Status: ' + status + ', Description: ' + description);

    this.http.get(URL)
      .subscribe((res : any[])=>{
        console.log(res);
        this.items = res;
        });
      return this.items;
  }
}
