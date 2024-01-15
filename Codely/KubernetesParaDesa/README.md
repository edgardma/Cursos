Pasos:

* Crear un `pod` por línea  de comandos:
  
  ```bash
  kubectl run hello-world --image=fiunchinho/codely-docker:latest --port=80
  ```

* Ejecutar ese `pod` localmente:
  
  ```bash
  # Listar los pods
  kubectl get pods
  
  # Obtener el nombre del pod con el resutlado de la anterior sentencia
  # Ejecutar el pod localmente en el puerto 8000
  kubectl port-forward deployment/hello-world 8000:80
  ```

* Ejecutar la siguiente sentencia para el `docker` consulte `minikube`:
  
  ```bash
  (minikube docker-env)
  ```

* Para crear la estructura lógica de un `pod`:
  
  ```bash
  kubectl run hello-world --image=fiunchinho/codely-docker:latest --restart=Never --port=80 --dry-run -o yaml
  ```

* Para llevar la estructura anterior a un archivo `.yaml`:
  
  ```docker
  kubectl run hello-world --image=fiunchinho/codely-docker:latest --restart=Never --port=80 --dry-run -o yaml > pod.yaml
  ```

* Ejecutar el archivo `.yaml`
  
  ```bash
  kubectl create -f pod.yaml
  ```

* Listar los `pods`:
  
  ```bash
  kubectl get pods
  ```

* Eliminar un `pod`:
  
  ```bash
  kubectl delete pod NOMBRE_POD
  ```

* Describir un `pod`:
  
  ```bash
  kubectl describe pod NOMBRE_PDO
  ```

* A


