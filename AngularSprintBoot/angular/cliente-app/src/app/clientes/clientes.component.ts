import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteService } from './cliente.service';
import { ModalService } from './detalle/modal.service';
import swal from 'sweetalert2'
import { tap } from 'rxjs/operators'
import { ActivatedRoute } from '@angular/router'
import { AuthService } from '../usuarios/auth.service';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html'
})
export class ClientesComponent implements OnInit {

  clientes: Cliente[];
  paginador: any;
  clienteSeleccionado: Cliente

  constructor(private clienteService: ClienteService,
              private modalService: ModalService,
              public authService: AuthService,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe( params => {
      let page: number = +params.get('page')
      if(!page) {
        page = 0
      }

      this.clienteService.getClientes(page).pipe(
        tap(response => {
          console.log('ClientesComponent: tap 3');
          (response.content as Cliente[]).forEach(cliente => {
            console.log(cliente.nombre)
          })
          console.log('ClientesComponent: tap 4');
        })
      ).subscribe(response => {
          this.clientes = response.content as Cliente[]
          this.paginador = response
        });
    });

    this.modalService.notificarUpload.subscribe(cliente => {
      this.clientes.map(cienteOriginal => {
        if (cliente.id == cienteOriginal.id) {
          cienteOriginal.foto = cliente.foto
        }
        return cienteOriginal
      })
    })

  }

  delete(cliente: Cliente): void{
    swal({
      title: '¿Está seguro de eliminar?',
      text: `¿Seguro que desea eliminar el cliente ${cliente.nombre} ${cliente.apellido}`,
      type: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Si, eliminar',
      cancelButtonText: 'No, cancelar',
      confirmButtonClass: 'btn btm-success',
      cancelButtonClass: 'btn btn-danger',
      buttonsStyling: false,
      reverseButtons: true
    }).then((result) => {
      if (result.value) {
        this.clienteService.delete(cliente.id).subscribe(
          responce => {
            this.clientes = this.clientes.filter(cli => cli !== cliente)
            swal(
              'Cliente Eliminado!',
              `Usted ha eliminado el cliente  ${cliente.nombre} ${cliente.apellido}`,
              'success'
            )
          }
        )
      }
    })
  }

  abrirModal(cliente: Cliente) {
    this.clienteSeleccionado = cliente
    this.modalService.abrirModal()
  }

}
