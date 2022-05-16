# Angular & Spring Boot: Creando web app full stack

## Instalación:

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
  ## Ubuntu
  sudo npm install -g typescript
  ## Validar la instalación
  tsc -v
  ```

- Angular (de forma global)
  
  ```shell
  ## Ejecutar como administrador
  ## Windows
  npm install -g @angular/cli
  ## Ubuntu
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

- En el caso de que no se puede instalar un paquete, se puede ejecutar la siguiente sentencia:
  
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

``` 
CREATE src/app/clientes/cliente.service.spec.ts (362 bytes)
CREATE src/app/clientes/cliente.service.ts (136 bytes)
```
