drop table nsrtm.clientes cascade constraints;

create table clientes (
    clave number(19,0), 
    apellido varchar2(255 char), 
    create_at date, 
    email varchar2(255 char), 
    nombre varchar2(255 char), 
    primary key (clave)
);

select * from nsrtm.clientes;