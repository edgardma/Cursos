import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente';
import { Region } from './region';
import {ClienteService} from './cliente.service'
import {Router, ActivatedRoute} from '@angular/router'
import swal from 'sweetalert2'

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html'
})
export class FormComponent implements OnInit {
  public cliente: Cliente = new Cliente()
  public regiones: Region[]
  public titulo: string = "Crear Cliente"
  public errores: string[]

  constructor(private clienteService: ClienteService,
              private router: Router,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    this.cargarCliente()
  }

  public cargarCliente(): void {
    this.activatedRoute.params.subscribe(params => {
      let id = params['id']
      if(id) {
        this.clienteService.getCliente(id).subscribe(
          (cliente) => this.cliente = cliente)
      }
    })
    
    this.clienteService.getRegiones().subscribe(regiones => this.regiones = regiones)
  }

  public create(): void {
    console.log(this.cliente)
    this.clienteService.create(this.cliente)
      .subscribe(cliente => {
        this.router.navigate(['/clientes'])
        swal('Nuevo Cliente', `El cliente ${cliente.nombre} creado con éxito!`, 'success')
      },
      err => {
        this.errores = err.error.errors as string[]
        console.error('Código del error desde el backend: ' + err.status)
        console.error(err.error.errors)
      }
    )
  }

  public update(): void {
    console.log(this.cliente)
    this.cliente.facturas = null
    this.clienteService.update(this.cliente)
    .subscribe( json => {
        this.router.navigate(['/clientes'])
        swal('Cliente Actualizado', `${json.mensaje}: ${json.cliente.nombre} actualizado con éxito!`, 'success')
      },
      err => {
        this.errores = err.error.errors as string[]
        console.error('Código del error desde el backend: ' + err.status)
        console.error(err.error.errors)
      }
    )
  }

  public compararRegion(o1: Region, o2: Region): boolean {
    if (o1 === undefined && o2 == undefined ) {
      return true
    }
    return o1 === null || o2 === null || o1 === undefined || o2 === undefined ? false : o1.id === o2.id
  }

}
