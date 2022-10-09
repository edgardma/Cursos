import { Injectable } from '@angular/core';
import { formatDate, DatePipe } from '@angular/common'
import { Cliente } from './cliente';
import { map, Observable, catchError, throwError, tap } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import swal from 'sweetalert2';
import { Router } from '@angular/router';

@Injectable()
export class ClienteService {
  private urlEndPoint:string = 'http://localhost:8090/api/clientes';
  private httpHeaders = new HttpHeaders({'Content-Type':'application/json'})

  constructor(private http: HttpClient, private router: Router) { }

  getClientes(): Observable<Cliente[]> {
    return this.http.get<Cliente[]>(this.urlEndPoint).pipe(
      tap(response => {
        console.log('ClienteService: tap 1')
        //let clientes = response as Cliente[]
        response.forEach( cliente => {
            console.log(cliente.nombre)
        }
        )
      }),

      map(response => {
        return response.map( cliente => {
          cliente.nombre = cliente.nombre.toUpperCase()
          //cliente.creatAt = formatDate(cliente.creatAt, 'dd-MM-yyyy', 'en-US')
          //let datePipe = new DatePipe('es-PE')
          //cliente.creatAt = datePipe.transform(cliente.creatAt, 'EEEE dd, MMMM yyyy')
          return cliente
        })
      }),

      tap(response => {
        console.log('ClienteService: tap 2')
        response.forEach( cliente => {
            console.log(cliente.nombre)
        })
      }),

    );
  }

  create(cliente: Cliente) : Observable<Cliente> {
    return this.http.post(this.urlEndPoint, cliente, {headers: this.httpHeaders}).pipe(
      map( (response: any) => response.cliente as Cliente),
      catchError(e => {

        if (e.status == 400) {
          return throwError(e);
        }

        console.error(e.error.mensaje);
        swal(e.error.mensaje, e.error.error, 'error');
        return throwError(e);
      })
    );
  }

  getCliente(id): Observable<Cliente> {
    return this.http.get<Cliente>(`${this.urlEndPoint}/${id}`).pipe(
      catchError(e => {
        this.router.navigate(['/clientes']);
        console.error(e.error.mensaje);
        swal('Error al editar', e.error.mensaje, 'error');
        return throwError(e);
      })
    );
  }

  update(cliente: Cliente): Observable<any> {
    return this.http.put<any>(`${this.urlEndPoint}/${cliente.id}`, cliente, {headers: this.httpHeaders}).pipe(
      catchError(e => {

        if (e.status == 400) {
          return throwError(e);
        }

        console.error(e.error.mensaje);
        swal('Error al actualizar', e.error.mensaje, 'error');
        return throwError(e);
      })
    );
  }

  delete(id: number): Observable<Cliente> {
    return this.http.delete<Cliente>(`${this.urlEndPoint}/${id}`, {headers: this.httpHeaders}).pipe(
      catchError(e => {
        console.error(e.error.mensaje);
        swal('Error al eliminar', e.error.mensaje, 'error');
        return throwError(e);
      })
    );
  }

}
