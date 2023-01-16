# Curso Profesional de Arquitectura de Software

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

Disponibilidad:

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

Mantenibilidad:

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

Eficiencia de ejecución:

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
