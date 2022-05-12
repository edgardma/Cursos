import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html'
})
export class ClientesComponent implements OnInit {

  clientes: Cliente[] = [
    {id: 1, nombre: 'Andres', apellido: 'Guzman', email: 'profesor1@correo.com', createAt: '2022-12-11'},
    {id: 2, nombre: 'Pedro', apellido: 'Perez', email: 'profesor2@correo.com', createAt: '2022-12-11'},
    {id: 3, nombre: 'Juan', apellido: 'Garcia', email: 'profesor3@correo.com', createAt: '2022-12-11'},
    {id: 4, nombre: 'Luis', apellido: 'Luna', email: 'profesor4@correo.com', createAt: '2022-12-11'},
    {id: 5, nombre: 'Jaime', apellido: 'Castillo', email: 'profesor5@correo.com', createAt: '2022-12-11'},
    {id: 6, nombre: 'Enrique', apellido: 'Mendoza', email: 'profesor6@correo.com', createAt: '2022-12-11'},
    {id: 7, nombre: 'Pablo', apellido: 'Mamani', email: 'profesor7@correo.com', createAt: '2022-12-11'},
    {id: 8, nombre: 'Manuel', apellido: 'Quispe', email: 'profesor8@correo.com', createAt: '2022-12-11'}
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
