# Angular & Spring Boot: Creando web app full stack

## Instalación herramientas Front-end:

Para poder llevar el curso es necesario instalar lo siguiente:

- Node JS
  
  ```shell
  ## Validar la instalación
  node -v
  ```

- npm
  
  ```shell
  ## Validar la instalación
  npm -v
  ```

- TypeScript (de formal global)
  
  ```shell
  ## Ejecutar como administrador
  ## Windows
  npm install -g typescript
  ## Ubuntu / Mac
  sudo npm install -g typescript
  ## Validar la instalación
  tsc -v
  ```

- Angular (de forma global)
  
  ```shell
  ## Ejecutar como administrador
  ## Windows
  npm install -g @angular/cli
  ## Ubuntu / Mac
  sudo npm install -g @angular/cli
  ## Validar la instalación
  ng version
  ```

- Asimismo, si se usa Atom como editor de código, se recomienda instalar los siguientes paquete:
  
  - `angular-2-typescript-snippets`
  
  - `atom-typescript`
  
  - `atom-bootstrap3`
  
  - `atom-bootstrap4`
  
  - `v-bootstrap4`
  
  - `platformio-ide-terminal`, y 
  
  - `emmet`

- En el caso de que no se puede instalar un paquete, se puede ejecutar la siguiente sentencia (solo si tienes Atom):
  
  ```shell
  ## Ejecutar como administrador
  apm install angular-2-typescript-snippets
  ```

## Creando la primera aplicación

Para crear una primera aplicación sencilla, se puede crear con la siguiente sentencia:

```shell
## Ir a una carpeta en donde se creará la aplicación
## Ejecutar la siguiente sentencia para crear la aplicación
ng new cliente-app
```

Luego de crear la aplicación, abrir la carpeta creada con el nombre de la aplicación, en este caso sería `cliente-app` y ejecutar la aplicación con la siguiente sentencia:

```shell
ng serve --open
# o
mg serve -o
```

En el caso que no salga ningún error, se abrirá el navegador por defecto, tanto para Windows como para Linux, mostrando la página principal

En el caso de que tengan que ejecutar el código fuente y no se ha instalado las dependencias, se debe ejecutar la siguiente sentencia:

```shell
npm install
```

Para crear una clase `TypeScript` desde línea de comando, como por ejemplo la clase `footer.component`, ejecutar la siguiente sentencia:

```shell
ng generate class footer.component
```

Para crear un componente de Angular desde la línea de comando, como por ejemplo el componente `directiva`, ejecutar la siguiente sentencia:

```shell
ng generate component directiva
## o
ng g c directiva
```

En este caso, Angular crea y/o actualiza los siguientes archivos:

```shell
CREATE src/app/directiva/directiva.component.css (0 bytes)
CREATE src/app/directiva/directiva.component.html (24 bytes)
CREATE src/app/directiva/directiva.component.spec.ts (647 bytes)
CREATE src/app/directiva/directiva.component.ts (287 bytes)
UPDATE src/app/app.module.ts (572 bytes)
```

Para crear un servicio de Angular desde línea de comando, como por ejemplo, el servicio `cliente`, ejecutar la siguiente sentencia:

```shell
ng generate service cliente
## o
ng g service cliente
```

En este caso, Angular crea los siguientes archivos:

```bash
CREATE src/app/clientes/cliente.service.spec.ts (362 bytes)
CREATE src/app/clientes/cliente.service.ts (136 bytes)
```

Para instalar Bootstrap, JQuery y Popper desde línea de comandos, nos ubicamos en la carpeta del proyecto y ejecutar el siguiente comando (el comando `--save` es para que se registre en el archivo `package.json` la dependencia):

```shell
## La clausula 'save' es para registrar la dependencia en el archivo
## package.json del proyecto
npm install bootstrap@5.1.3 jquery popper.js --save
```

Asimismo, se debe instalar el paquete `SweetAlert2` se debe ejecutar la siguiente sentencia desde la ruta del proyecto:

```shell
## Para instalar la última versión
npm install sweetalert2 --save

## Para instalar la versión del tutorial
npm install --save sweetalert2@7.26.9
```

## Instalación de herramientas de Back-end:

Para esta parte del proyecto, se necesita la instalación de los siguientes software:

* JDK

* Eclipse + Spring Tools

* Maven

* MySQL

* Postman

Para el caso del IDE de STS, se recomienda instalar las herramientas de base de datos, para ello se debe ir al menú `Help / Install new software` y buscar `Database Development`.

## Creación de la base de datos

Para crear la base de datos en el MySQL ingresar a la consola y ejecutar la siguiente sentencia:

```shell
mysql -u root -p
```

Seguidamente, solicitará ingresar la clave del usuario `root`, luego de ingresarla, le permitirá ejecutar sentencias `SQL` y se debe ejecutar la siguiente sentencia para crear la BD:

```sql
# Crear la bd
CREATE DATABASE db_springboot_backend;

# Para validar la creación de la bd
SHOW DATABASES;
```

## Cargar datos iniciales a la BD MySQL desde el proyecto Java

Para cargar datos iniciales a la BD MySQL desde el proyecto de Java, se debe crear un archivo `import.sql` en la ruta `resources` del mismo proyecto. Las siguientes sentencias SQL son un ejemplo de dicho archivo:

```sql
INSERT INTO `db_springboot_backend`.`clientes` (`nombre`, `apellido`, `email`, `create_at`) VALUES ('Edgard', 'Marquez', 'prueba1@empresa.com', '2020-01-01');
```

## Prueba del servicio API REST

Para probar nuestra API, primero se debe ejecutar el proyecto `spring-boot-backedn-apirest` y desde el navegador ingresar la siguiente URL:

* `http://localhost:8080/api/clientes/`

* `http://localhost:8090/api/clientes/upload`

## Crear un componente formulario

Para crear un formulario, se debe ejecutar la siguiente sentencia:

```shell
ng g c clientes/form --flat
```

Con esto se creará el componente dentro de la carpeta `clientes/form` con los siguientes archivos:

```
CREATE src/app/clientes/form.component.html (19 bytes)
CREATE src/app/clientes/form.component.spec.ts (612 bytes)
CREATE src/app/clientes/form.component.ts (267 bytes)
CREATE src/app/clientes/form.component.css (0 bytes)
UPDATE src/app/app.module.ts (1213 bytes)
```

## Instalación de otros módulos para Angular:

Para el uso de un control `DatePicker`, se debe instalar lo siguiente:

```shell
ng add @angular/material

ng add @angular/material-moment-adapter

npm install --save moment
```

## Creación de llaves públicas y privadas:

Para este proyecto se ha usado OpenSSL, específicamente la versión 1.1 ya que con la versión mas actual no funciona, para la generación de las llaves públicas y privadas:

```shell
## Crear la llave
openssl genrsa -out jwt.pem

## Mostrar en pantalla la llave privada
openssl rsa -in jwt.pem

## Mostrar en pantalla la llave publica
openssl rsa -in jwt.pem -pubout
```
