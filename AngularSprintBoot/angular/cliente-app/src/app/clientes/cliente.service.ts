import { Injectable } from '@angular/core';
import { CLIENTES } from './clientes.json';
import { Cliente } from './cliente';
import { of, Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable()
export class ClienteService {
  private urlEndPoint:string = 'http://localhost:8080/api/clientes';
  constructor(private http: HttpClient) { }

  getClientes(): Observable<Cliente[]> {
    /* Una forma:
    return this.http.get(this.urlEndPoint).pipe(
      map( response => response as Cliente[])
    );
    */
    // Otra forma
    return this.http.get<Cliente[]>(this.urlEndPoint);
  }
}
