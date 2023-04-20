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
  
  Cuanto el sistema aprovecha esos recursos en su contexto, sea la RAM, el SO, ETC. el objetivo es saber cuan bien o mal se están usando. 
  
  **Se mide:** medir cuanto ocupa el sistema del RAM o CPU y si soporta o tiene la capacidad entera de recursos para soportar.

- Capacidad
  
  Cuanto soporta el sistema en cantidad de pedidos, es decir tiene un limite en la cantidad de una cantidad máxima de usuarios usando el sistema a la vez.  
  
  **Se mide:** Cuanto esperamos que el sistema responda en ciertos casos, por ejemplo en carga, escritura o lectura y luego de saber cuanto esperamos que responda. probar cuanto responde realmente.

## Compatibilidad

Este agrupa los atributos de cuanto el sistema coexiste o interopera con otros sistemas, es decir; **Cuanto puede el sistema vivir en un contexto mas grande.**

**Interoperabilidad:** Cuan fácil es comunicarse con este sistema, cuanto define su sistema de comunicación, incluso cuanto después este sistema puede comunicarse con otros. 

**Se mide:** A través de casos puntuales, por ejemplo una plataforma de pagos. que tan fácil o difícil es que nuestro sistema se integre son dicha plataforma.

**Coexistencia:** Esta dada por cuanto el sistema soporta o no el estar en un contexto dado con otro sistema también. ¿El sistema puede coexistir dentro del mismo servidor, la misma red? ¿Eso genera fallos al sistema? 

**Se mide:** A través de la cantidad de fallos que tenemos, sin que esos fallos sean generados por nuestra aplicación. Es decir, si nuestra aplicación convive con otras y estas otras nos quita recursos o porque la aplicación le genera un fallo de segmentación en el sistema operativo. (Cualquier cosa externa).

## Confiabilidad

Se trata de cuanto el sistema nos permite utilizarlo a través del tiempo de forma normal. Para analizarlo utilizamos 4 características:

---

- **Madurez:** Cuanto falla el sistema. Para medirla, se toma el tiempo entre cada fallo que haya tenido el sistema. Cuanto más tiempo pase, más maduro es el sistema.

---

- **Disponibilidad:** Cuanto tiempo esta fuera de servicio el sistema con respecto a su ciclo de vida normal. Para medirlo, igualmente tomamos el tiempo que estuvo fuera y lo expresamos en una forma de porcentaje.

---

- **Tolerancia a fallos (Resilencia):** Como el sistema se mantiene dando el servicio a pesar de que tenga un fallo o haya un fallo con la conexión a un sistema externo. Para medirlo hay que generar los fallos y ver como se comporta.

---

- **Capacidad de recuperación:** Cuanto tiempo el sistema puede seguir estando disponible, luego de algún fallo. Para medirlo, guardamos el tiempo que el sistema vuelve a dar el servicio una vez que salió por un fallo. 

## Usabilidad

- **Reconocimiento de Idoneidad:** Cuanto nos damos cuenta que un sistema es lo que nosotros necesitamos usar para resolver nuestro objetivo. Para medirlo necesitamos saber si el dominio de nuestro problema esta asociado con el sistema. **Ejemplo:** Wordpress.

---

- **Curva de Aprendizaje:** Es que tan fácil o difícil es aprender a usar el sistema. Se mide por la cantidad de ayuda que necesitemos para poder hacer las tareas.  
  **Ejemplo:** Lenguaje de Gestos.

---

- **Operabilidad:** Que cantidad de pasos o esfuerzo hay que hacer para cumplir un objetivo. **Ejemplo:** Evitar formularios largos

---

- **Protección de Errores:** Es como el sistema le comunica al usuario de cuantas veces se equivocó (Una manera de darle feedback al usuario) . **Ejemplo:** Ser más específico con el feedback.

---

- **Estética de Interfaz:** La mejor manera de medirlo es preguntarle a los usuarios a través de encuestas subjetivas. **Ejemplo:** En caso tal sea una prima se deben considerar puestos como los de UI y UX.

---

- **Accesibilidad:** Se trata de cuan permisible es el sistema de utilizar para personas con discapacidades. Esto es muy difícil de medir, ya que se necesita experiencia por el usuario. **Ejemplo:** Utilizar Propiedades del desarrollo para tener mayor inclusión con las personas con discapacidad.

## Seguridad

Cuanto el sistema puede proteger, saber identificar y conectar a sus usuarios. y al conectar usuarios con información.

---

- **Confidencialidad:** El sistema debe saber, quienes tienen permiso a que información.

---

- **Integridad:** Cuanto el sistema toma recaudo para proteger esa información de atacantes o usuarios que no deberían tener acceso a ella.

---

- **Comprobación de Hechos:** hablamos de territorio legal, de como hacer para que el sistema garantice de que algo paso.

---

- **Traza de Responsabilidad:** Esta conectada a la comprobación de hechos, pero esta mas dada a como se conecta una acción del sistema con su responsable. Sea este el usuario o el sistema mismo.

---

- **Autenticidad:** Verifica que el usuario que esta tratando de ingresar al sistema o realizar una acción, sea quien dice que ser.

## Mantenibilidad

Nos referimos a todas esas cosas que hacen que un sistema pueda cambiar. Pueda evolucionar y a su vez pueda ser reparado.

* **Modularidad.** Habla de la capacidad de un sistema en ser separado en partes dónde cada una de esas partes sea independiente de las otras.

* **Reusabilidad.** Es una característica que habla sobre cuánto podemos aprovechar el esfuerzo que hicimos en desarrollar un módulo o una pieza de software y reutilizarla en otro lado, es decir, volver a usarla para otro propósito diferente o para una funcionalidad ligeramente diferente.

* **Capacidad de análisis.** Conexión entre el código y los requerimientos.

* **Capacidad de modificación.** Cuán fácil o difícil es ir al código y cambiar el comportamiento.

* **Capacidad de prueba.** Habla sobre cuán fácil o difícil es crear estos test para que el sistema garantice que hace lo que se requiere que haga. Para tener una mejor capacidad de prueba tenemos que darle más importancia a nuestra estructura del código, a nuestras operaciones y cuán atómicas son y cuán independientes son unas de otras.

## Portabilidad

- **Adaptabilidad:** La podemos medir analizando cuán fuertemente depende nuestro sistema de un entorno especifico.

---

- **Capacidad de Instalación:** La podemos medir analizando cuán fuertemente necesitamos requerimientos en el el entorno de despliegue.

---

- **Capacidad de Reemplazo:** La podemos medir conociendo los nuevos requerimientos o facilidades que hay hoy y configurarlo a favor de nuestro sistema.

## Tensiones entre atributos

En la arquitectura de software, los atributos de calidad son directamente influenciados por las decisiones arquitectónicas que tomamos.

En algunos libros se le conoce como “tradeoffs” a los intercambios que existen entre estos atributos, por ejemplo:

- Una mayor usabilidad, requiere que hallan mas módulos que permitan hacer mucho mas cosas al usuario, lo cual implica que probablemente hay que aumentar código. Esto puede afectar al rendimiento de la aplicación.

La idea es optimizar todos los atributos de calidad que tomemos en cuenta, siempre en base a los requerimientos de nuestro sistema.

## Proyecto: Arquitectura y la Maquina de Tiempo

"Aplicando atributos de calidad en base a la madurez del proyecto"
Hay que priorizar los atributos y atacarlos uno a uno:

***StartUp:***

Confiabilidad: Madurez y disponibilidad 
Seguridad: Autenticidad y confidencialidad 
Compatibilidad: Interoperabilidad  

***En crecimiento:***

Eficiencia de ejecución: Uso de recursos y capacidad.

Compatibilidad: Interoperabilidad.

Seguridad: Comprobación de hechos, traza de responsabilidad, confidenciabilidad.

***Gran escala*** 

Usabilidad: Accesibilidad, reconocimiento de idoneidad, operabilidad.

Mantenibilidad: Modularidad, capacidad de prueba, capacidad de modificación.

Confiabilidad: Tolerancia a fallos, capacidad de recuperación

## Patrones de Arquitectura

- **Patrones monolíticos:** el artefacto resultante se despliega como una sola unidad.

- **Patrones distribuidos:** cada componente se puede desplegar independientemente. El resultado es una arquitectura de sistema de sistemas en donde un componente que forma parte del sistema puede cambiar sin afectar a los otros componentes. Importante: cada componente de un sistema distribuido va a ser en si mismo un componente monolítico.

- **Patrón bola de lodo:** surge cunado un equipo no considera la arquitectura como algo relevante y se empieza a componer un sistema de partes que se conocen e interactuan entre todas, no hay diferencia ni prioridades entre componentes y carecen de criterio. Este patrón surge cuando no se interpretan los criterios de arquitectura. Puede llegar a ser necesario aplicar una ingeniería inversa para poder resolverlo, descomponer el sistema en partes y llevarlo a una mejor arquitectura.

## Patrones: Modelo Vista Controlador

El Modelo Vista Controlador (Model View Controller), separa los datos de una aplicación, la interfaz de usuario, y la lógica de control en tres componentes distintos.

Es un modelo maduro y que ha demostrado su validez en todo tipo de aplicaciones y multitud de lenguajes y plataformas de desarrollo.

* **El Modelo** que contiene una representación de los datos que maneja el sistema, su lógica de negocio, y sus mecanismos de persistencia.

* **La Vista, o interfaz de usuario**, que compone la información que se envía al cliente y los mecanismos interacción con éste.  

* **El Controlador**, que actúa como intermediario entre el Modelo y la Vista, gestionando el flujo de información entre ellos y las transformaciones para adaptar los datos a las necesidades de cada uno.

## Patrones: Capas

Cada capa va hacer responsable de cierto componente global de aplicación. La comunicación siempre es de arriba hacia abajo. Nunca una capa muy inferior debería comunicarse con la del primer nivel. Se pueden utilizar en sistema distribuidos.

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
