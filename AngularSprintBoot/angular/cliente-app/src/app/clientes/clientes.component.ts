import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteService } from './cliente.service';
import swal from 'sweetalert2'

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html'
})
export class ClientesComponent implements OnInit {

  clientes: Cliente[];

  constructor(private clienteService: ClienteService) { }

  ngOnInit(): void {
    this.clienteService.getClientes().subscribe(
      clientes => this.clientes = clientes
    );
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

}
