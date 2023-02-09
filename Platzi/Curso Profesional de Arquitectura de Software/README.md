# Curso Profesional de Arquitectura de Software

## Atributos de Calidad

Los **Atributos de Calidad** son las expectativas de *usuario*, en general implícitas, de cuán bien funciona un producto.

Estas **expectativas que hay que cumplir** que no tienen que ver con lo funcional, sino, con lo **no funcional**. Cuán bien se comporta nuestro sistema en *cierto contexto* a ciertos *estímulos*.

## Idoneidad funcional

Es lo que conecta lo que el usuario quiere hacer (objetivos que tiene que resolver con el sistema) y como están implementadas funcionalmente en el sistema:

- Completitud Funcional: 
  
  Cuan completa esta la implementación con respecto a lo que se espera que haga el sistema. (Comparación: Requerimientos Funcionales vs Funcionalidades implementadas)
  
  **Se mide**, comparando los requerimientos funcionales que nos pidieron vs los que ya implementamos.

- Exactitud Funcional
  
  Cuan preciso es el sistema, para implementar lo que se este implementando. (Comparación: resultado esperado y resultado obtenido)
  **Se mide**, comparando el resultado esperado con el resultado obtenido.

- Pertinencia Funcional
  
  Cuan alineado esta lo que se implemento con lo que se necesita. (Comparación: objetivos cumplidos y objetivos esperados)
  
  **Se mide**, comparando cuantos objetivos se cumplieron y cuantos objetivos estábamos esperando que se pudieran cumplir.

## Eficiencia de ejecución

Cuan bueno es eficiente es el sistema a la hora de responder a lo que el usuario lo necesita y a su vez teniendo los recursos que el sistema necesita cuan bueno con esos recursos cuanto los aprovecha o desaprovecha.

- Tiempo a Comportamiento
  
  Este nos dice cuan bueno es el sistema respondiendo al usuario; específicamente, cuanto tarda el sistema y cuanto esperamos que ese sistema tarde. (Comparación: Tiempo transcurrido entre pedido y respuesta y tiempo esperado o tiempo máximo tolerado)
  
  **Se mide:** a través de la medición de la respuesta, dado un estimulo y luego compararlo con el tiempo que esperamos que tarde el sistema.

- Uso de Recursos

- Capacidad

## Tipos de Arquitectura

### Comparte-nada: Componente Proceso de reportes

- Distribuido.

- Buen uso de recursos.

- Capacidad de procesamiento en paralelo.

### Basada en Eventos: Componente Proceso de reportes

- Distribuido.

- Buen uso de recursos.

- Capacidad de procesamiento en paralelo.

### Microservicios

- Arquitectura Completa

- Distribuida

- Mayor disponibilidad

- Modularidad

## Patrones de Arquitectura Gran Escala

### Provisión de Eventos

- Componente de Servicio de Reportes

- Monolítico

- Permite construir consultas históricas con facilidad

### Separación de Consultas y comandos

- Componente servicio prestadores:

- Monolítico

- Mejora la modularidad y se integra bien con la provisión de eventos.

## Diseño de una Arquitectura

### Pasos

#### Pararse en hombros de gigantes

Aprovechar el conocimiento existente para nuestra solución.

- Productos "de la estantería"

- Frameworks

- Arquitecturas específicas del dominio

- Patrones de arquitectura

### Las herramientas

- Requerimientos

- Restricciones

- Atributos de Calidad

- Estilos

- Escenarios y Tácticas

- Patrones de Arquitectura

Todos estos ayudan a diseñar una Arquitectura

## Partes de una Arquitectura

### Componentes

Implementan las funcionalidades del negocio

### Conectores

La forma de comunicación entre componentes

#### Tipo de conectores

- Llamado a procedimiento

- Enlace

- Evento

- Adaptador

- Acceso a datos

- Flujo

- Arbitraje

- Distribuidor

- Llamado asincrónico

- Llamado sincrónico

## Escenarios y Tácticas

Estímulo -> Tácticas para controlar la respuesta -> Respuesta

### Escenario: Disponibilidad

Falla -> Táctica para controlar la Disponibilidad -> Falla oculta o sistema reparado

Tácticas:

- Detección:
  
  - Ping / Eco
  
  - Latido
  
  - Excepciones

- Recuperación: Preparar / Reparar
  
  - Votación
  
  - Redundancia activa
  
  - Redundancia pasiva
  
  - Repuesto

- Recuperación: Re-introducción
  
  - Moda sombra
  
  - Sincronización de Estado
  
  - Punto de control / Retroceso

- Prevención
  
  - Quitar de servicio
  
  - Transacciones
  
  - Monitoreo de procesos

### Escenario: Mantenibilidad

Pedido de Cambio -> Tácticas para controlar la mantenibilidad -> Cambio hecho, probado y desplegado.

Tácticas:

- Confinar modificaciones
  
  - Coherencia semántica
    
    - Abstraer servicios comunes
  
  - Generalizar
  
  - Limitar opciones
  
  - Anticipar cambios

- Prevenir efectos dominó
  
  - Ocultar información
  
  - Mantener la interfaz
  
  - Restringir comunicación
  
  - Intermediarios

- Definir enlace
  
  - Registro en ejecución
  
  - Archivos de configuración
  
  - Polimorfismo
  
  - Reemplazo de componentes
  
  - Adherir a protocolos

### Escenario: Eficiencia de ejecución

Eventos -> Tácticas para controlar la eficiencia -> Respuesta dentro del tiempo esperado

Tácticas:

- Demanda de recursos
  
  - Mejorar la eficiencia computacional
  
  - Reducir sobrecarga
  
  - Manejar tasa de eventos
  
  - Frecuencia de muestreo

- Gestión de recursos
  
  - Concurrencia
  
  - Réplicas
  
  - Aumentar recursos

- Arbitraje de recursos
  
  - Políticas de planificación de tareas

### Escenario: Seguridad

Ataque -> Tácticas para controlar la seguridad -> Detección resistencia o recuperación

Tácticas:

- Detectar ataques
  
  - Detectores de intrusos

- Recuperación de ataques
  
  - Restauración -> Disponibilidad
  
  - Identificación { Traza de auditoría

- Resistencia al ataque
  
  - Autenticación
  
  - Autorización
  
  - Confidencialidad de datos
  
  - Integridad
  
  - Limitar exposición
  
  - Limitar acceso

### Escenario: Capacidad de Prueba

Funcionalidad -> Tácticas para controlar la capacidad de prueba -> Fallas detectadas

Tácticas:

- Entradas y salidas
  
  - Captura y reproducción
  
  - Separar interfaz de implementación
  
  - Acceso exclusivo para pruebas

- Monitoreo interno
  
  - Monitoreo incorporado

### Escenario: Usabilidad

Pedido de un usuario -> Tácticas para controlar la usabilidad -> Información y asistencia adecuada al usuario

Tácticas:

- Separar la interfaz de usuario
  
  - Mantenibilidad: Coherencia semántica

- Iniciativas del usuario
  
  - Cancelar -> Dependerá del tiempo del proceso
  
  - Deshacer -> A una acción el usuario podría deshacer lo realizado
  
  - Agregación 
  
  - Múltiples vistas

- Iniciativas del sistema
  
  - Modelo del usuario
  
  - Modelo del sistema
  
  - Modelo de la tarea

## Validar las decisiones

ATAM

Métricas -> Pruebas automatizadas -> Umbrales -> Métricas ->

### Arquitectura en evolución

## Diseño de una arquitectura Start-up

## Cómo comunicar la arquitectura: Vista y puntos de vista

"Esencialmente, todo modelo es incorrecto. Pero algunos son útiles" Empiral Model-Building and Responce Surfaces (George Box, 1987)

### Tipos:

- Arquitectura restrictiva: Restringe las decisiones a tomar.

- Arquitectura descriptiva: Documenta la decisiones tomadas.

### Comunicación:

- Arquitecto y Analista -> Negociación de requerimientos

- Arquitecto y Operaciones -> Cálculo de recursos

- Equipo de Desarrollo -> Restricciones y libertades

- Diseñadores de Productos dependientes -> Definición de interoperabilidad

- Gestores de proyectos -> Gestión de equipos y recursos

- Equipo de Calidad -> Métricas y conformidad

## Documentación vs Implementación

- Modelo de arquitectura:
  
  - Módulos
  
  - Componentes
  
  - Conectores
  
  - Restricciones
  
  - Estilo
  
  - Patrones
  
  - Atributos de calidad

- Código fuente:
  
  - Paquetes
  
  - clases
  
  - interfaces
  
  - Métodos
  
  - Funciones
  
  - Parámetros
  
  - Tipos

La fuente de la verdad es el Código Fuente

Estrategias:

- Ignorar divergencia

- Modelado ad-hoc

- Solo modelo de alto nivel

- Sincronización en hitos del ciclo de vida

- Sincronización en crisis

- Sincronización constante
