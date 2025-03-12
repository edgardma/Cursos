## Pruebas con Postman:

### Casos de prueba para Productos:

get:

* `http://localhost:9191/api/v1/products?p=1&limit=5`

* `http://localhost:9191/api/v1/products`

* `http://localhost:9191/api/v1/products/5`

post:

* `http://localhost:9191/api/v1/products`
  
  ```json
  {
      "name":"Smartphone 6.1",
      "price":600.99,
      "categoryId":1
  }
  ```

put:

* `localhost:9191/api/v1/products/11`
  
  ```json
  {
      "name":"Smartphone 6.1",
      "price":500.99,
      "categoryId":1
  }
  ```

* `http://localhost:9191/api/v1/products/11/disabled`



### Casos de prueba para Categorías:

get:

* `http://localhost:9191/api/v1/categories`

* `http://localhost:9191/api/v1/categories?p=1&limit=2`

* `http://localhost:9191/api/v1/categories/1`

post:

* `http://localhost:9191/api/v1/categories`
  
  ```json
  {
      "name":"Nueva categoria"
  }
  ```

put:

* `http://localhost:9191/api/v1/categories/5`
  
  ```json
  {
      "name":"Nueva categoria actualizada"
  }
  ```

* `http://localhost:9191/api/v1/categories/5/disabled`
