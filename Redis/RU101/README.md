# Curso RU101: Introduction to edis Data Structures

## Week 1

### What are Redis Data Structures?



### Keys



### Strings

Hoy vamos a explorar la cadena, el tipo de fecha de Redis más básico y común. Veremos cuán poderoso puede ser este pequeño.

Las cadenas Redis son secuencias binarias seguras de bytes. Y se parecen mucho a las cadenas que usa en su lenguaje de programación favorito. Puede almacenar casi cualquier cosa que pueda imaginar en una cadena de Redis.
Enteros, valores binarios, valores separados por comas, JSON serializado. Y dado que son binarios seguros, incluso puede almacenar objetos más grandes, como imágenes, videos, documentos y sonido.
Entonces, ¿cuáles son algunos usos prácticos de las cadenas Redis?
El uso más común es para almacenamiento en caché: respuestas de API, almacenamiento de sesiones, páginas HTML. Las oportunidades son enormes.
Las cadenas de Redis también son excelentes para implementar contadores, ya que cuentan con compatibilidad integrada para incrementar y disminuir valores enteros y de punto flotante.
Hoy, vamos a repasar un par de ejemplos usando la cadena Redis. Primero, cubriremos cómo almacenar y recuperar una cadena.
En segundo lugar, examinaremos un caso de uso de almacenamiento de un objeto JSON como una cadena y cómo establecer un tiempo de caducidad hasta que se elimine.
También discutiremos las implicaciones de almacenar JSON como una cadena y un par de alternativas dentro de Redis. Por último, aprenderemos cómo incrementar y disminuir un valor entero dentro de una cadena de Redis. Para crear una cadena en Redis, utilizará el comando SET.
Después de la palabra clave SET, especifica la clave, seguida del valor que desea asociar con ella. Por ejemplo, creemos una entrada de zona horaria para un usuario de una aplicación que estamos creando. Usaré user:101:time-zone como clave y UTC 8 como valor:

```
SET user:101:time-zone UTC-8
```

Redis devuelve OK, lo que significa que la cadena de zona horaria se almacenó correctamente en usuario clave: 101: zona horaria.
Para recuperar una cadena de Redis, utilice el comando GET, seguido de la clave que desea recuperar.
Ahora obtengamos la zona horaria del usuario. Redis devuelve el valor de la clave como una cadena. Consideremos un ejemplo de uso de cadenas. Imagine que desea proporcionar a su usuario datos de uso del sitio.
Normalmente, enviaría la solicitud a un almacén de datos, lo que podría tardar varios segundos en completarse.
Pero al usar una cadena, puede almacenar en caché esta respuesta JSON después de obtenerla inicialmente. Como estas respuestas no cambian a menudo.
Aquí tenemos una respuesta JSON de muestra que contiene la solicitud de uso reciente del sitio de un usuario.
En lugar de acceder a nuestro almacén de datos para obtener esta información en solicitudes posteriores, podemos almacenar en caché esta respuesta como una cadena dentro de Redis.
Asignemos esta información al uso de la clave:63. Al almacenar datos en caché, es común establecer un tiempo de caducidad.
Aquí lo haremos agregando la opción EX a nuestro comando SET, seguido de una cantidad de segundos.
EX especifica un tiempo en segundos, después del cual Redis caducará y eliminará la clave y su valor de cadena asociado.
Entonces, esta cadena de Redis ahora expirará en 7200 segundos o dos horas.
Al usar Redis como caché, las respuestas posteriores que podrían haber tardado varios segundos en obtenerse del almacén de datos,
en cambio, se servirá al instante.
Podemos verificar el tiempo de vida restante de una clave usando el comando TTL.
TTL devuelve el número de segundos que quedan antes de que caduque la clave.
Ahora, la caducidad es un tema lo suficientemente complejo como para justificar su propio segmento de video.
Vuelve pronto para ver un video dedicado.
Por último, veamos las habilidades de la cadena Redis con respecto a la manipulación de enteros.
Con los comandos INCR e INCRBY, puede incrementar el valor de una clave en uno o en un número específico.
También puede usar un número negativo, lo que disminuirá el valor.
Si no hay ninguna clave ya presente.
Los comandos INCR e INCRBY crearán una nueva cadena e incrementarán su valor de manera adecuada.
Para ver cómo funciona eso?
Ejecutemos el comando INCR con una clave que aún no existe.
Dado que el usuario clave: 23: recuento de visitas aún no existe, el comando INCR simplemente crea una nueva clave y cadena con un valor de 1.
Esta es la forma de Redis.
Si no existe una estructura de datos, se creará en el momento en que la escriba.
Ahora, echemos un vistazo rápido al comando INCRBY.
INCRBY incrementa el valor de una clave dada por un número específico que proporcionamos en la línea de comando.
Digamos que tenemos un usuario clave: 23: saldo de crédito con un valor de 40.
Aumentemos el valor a 70 con comando:

```
INCRBY user:23:credit-balance 30
```

Finalmente, reflejemos el uso de los créditos disponibles para este usuario ejecutando INCRBY con un número negativo. Digamos que nuestro usuario consume 50 créditos. El comando seria:

```
INCRBY user:colon:23:credit balance-50
```

Ahora, al usuario le quedan 20 créditos.
OK.
Entonces, hagamos una revisión rápida de lo que acabamos de cubrir para las cadenas de Redis. Las cadenas son el tipo de datos fundamental de Redis y puede usarlas para almacenar cadenas antiguas, valores numéricos, JSON serializado y cualquier cosa que se pueda representar en binario.
Las cadenas, combinadas con la caducidad de la clave, son su primer acceso a la estructura de datos para el almacenamiento en caché. Finalmente, también puede usar cadenas Redis para almacenar y manipular valores numéricos.

Para obtener más información sobre las cadenas de Redis, consulte nuestro curso en línea gratuito: Introducción a las estructuras de datos de Redis. Es parte de Redis University, nuestra plataforma de aprendizaje en línea gratuita para todo lo relacionado con Redis. Gracias por acompañarme en esta inmersión rápida en las cadenas de Redis. Espero verte de nuevo, y feliz aprendizaje.





Las cadenas son el tipo de datos más simple que
se puede asociar con una clave.
Si bien son muy simples, se pueden realizar varios comandos en tipos de datos de cadena, por lo que es posible incrementar un número almacenado en una cadena, como veremos.
Si ha utilizado un caché como Memcached, la manipulación de cadenas le resultará muy familiar.
Si ha estado utilizando una base de datos relacional o un almacén de documentos, esto puede resultarle una sorpresa.
Con un tipo de datos de cadena, puede almacenar cualquier tipo de valor, texto, enteros y punto flotante, números y datos binarios.
Hay un límite de 512 megabytes para cualquier valor de cadena.
Se permiten archivos JPEG, hojas de cálculo de Excel, fragmentos de HTML, así como texto y números normales y sin formato.
Internamente, Redis almacena la codificación del valor, almacena el conocimiento de si se trata de un texto, un número o un binario.
Esto se puede verificar antes de que cualquier comando opere en el valor.
Hay varias formas de manipular cadenas, como veremos.
Primero, veamos los valores incrementales y decrecientes.
Podemos realizar estos comandos en valores que son enteros y números de coma flotante.
Tanto INCRBY como DECRBY tienen versiones abreviadas.
INCR y DECR cambian el valor en 1.
Por último, está INCRBYFLOAT para manipular el punto flotante
números.
Entonces, si Redis considera el tipo de datos como una cadena, ¿cómo puede incrementar y disminuir?
Echemos un vistazo a un ejemplo.
Primero, ajustemos el inventario a las 4 de mujeres.
por 100 metros final a 1000.
Como mencionamos en la unidad Claves, depende del equipo de desarrollo decidir la convención de nomenclatura.
En este ejemplo, usamos dos puntos entre dos elementos de nuestro nombre clave.
El inventario es el objeto de dominio.
La final femenina de 4 por 100 metros es el nombre del campo o clasificatorio.
Tenemos guiones entre las palabras aquí, pero también se podrían haber usado espacios.
Es posible que tenga otras preferencias, pero la consistencia de los nombres es fundamental.
Obviamente, si permite espacios, el nombre de la clave deberá ser una cadena entre comillas.
Cuando recuperamos el valor con el comando GET, devolvemos el valor 1000.
Pero tenga en cuenta que el valor está cotizado. Redis devuelve el valor como una cadena.
Después de que hayamos vendido un boleto, querremos disminuir el inventario
para reflejar la venta.
Entonces, disminuyamos en 1 con un comando DECRBY, primero notará que el retorno es un valor entero de 999.
Entonces, ¿qué pasó aquí?
Primero, el servidor buscó el tipo de datos de la clave.
Es un tipo de datos de cadena, por lo que el comando DECRBY es válido.
En segundo lugar, el servidor miró la codificación del valor.
Contenía un valor entero.
Dado que se realizó una operación numérica en un valor numérico,
por lo tanto, se devuelve un valor numérico.
Este es el nuevo valor almacenado en la clave.
Entonces, ¿cuál es el tipo de datos del nuevo valor?
Bueno, eso es bastante simple.
El valor resultante sigue siendo un tipo de datos de cadena.
Puede ver el nuevo valor de cadena de 999 con el comando GET.
Podemos usar el comando TYPE para averiguar el tipo de datos de la clave.
Como puede ver aquí, es una cadena.
Más adelante en este capítulo, cuando cubramos listas, conjuntos, conjuntos ordenados y hashes, verá que el comando TYPE devuelve el tipo de datos de la estructura almacenada en la clave.
También podemos comprobar la codificación del valor.
con el comando OBJETO.
Aquí puede ver que el valor dentro del tipo de datos de cadena está codificado como un número entero.
Así es como Redis sabe si puede realizar un incremento o una disminución en un valor almacenado en el tipo de datos de cadena.
El contenido de la cadena se puede cambiar entre texto, número, binario en cualquier punto.
Para Redis, siempre es un tipo de datos de cadena.
En este ejemplo, configuramos la clave para el valor de texto de "Agotado".
Esto es algo válido para hacer en Redis.
Redis admite polimorfismo.
Esa es la capacidad de representar diferentes tipos de datos a lo largo del tiempo para la misma clave.
Antes de que se ejecutara el comando, contenía el valor entero de 999.
Después de esta operación, ahora contiene un valor de texto de "Agotado".
Echando un vistazo a la codificación, muestra que el valor es un embstr, que representa un valor de texto.
Esto tiene consecuencias para los desarrolladores, ya que su código deberá tener en cuenta que el tipo de datos puede cambiar y que no existe un esquema que imponga un tipo en particular.
Si viene de una base de datos relacional, esto podría ser bastante impactante.
Pero créame, se acostumbrará rápidamente a esto y aprenderá a apreciar la flexibilidad que proporciona.
Si ya ha estado usando una base de datos NoSQL, entonces esto es algo con lo que ya está familiarizado.
Entonces, ¿qué sucede si desea disminuir el nuevo valor?
Bueno, el servidor pasa por el mismo proceso que se describió anteriormente.
Pero esta vez, la codificación del valor es texto, por lo que arroja un error.
El comando DECRBY solo opera en valores codificados como números enteros.
En el último ejemplo, hemos establecido la clave en 0, en lugar de "Agotado".
Redis se complace en almacenar, recuperar y manipular los valores según sea necesario, incluso cuando el valor cambia entre valores de texto, numéricos y binarios.
Como puede ver, una vez que comprenda que Redis almacena valores como cadenas, podrá ejecutar muchos comandos potentes.
La primera vez que hacemos esto, puede parecer muy poco natural, especialmente si ha estado acostumbrado a una base de datos con un esquema estricto.
Redis también brinda la capacidad de realizar la manipulación de bits de cadenas.
Este es un concepto poderoso para administrar estructuras compactas y de alto rendimiento. Cubriremos el uso de la manipulación de campos de bits en un capítulo posterior de este curso.
En resumen, las cadenas proporcionan el almacenamiento de datos básico en Redis.
Algunos comandos observarán el tipo de datos y la codificación para verificar si se puede aplicar el comando. Por ejemplo, los comandos de incremento y disminución requieren la presencia de un número. Las cadenas se pueden manipular y cambiar independientemente de si contienen números enteros, flotantes, textos o valores binarios.
