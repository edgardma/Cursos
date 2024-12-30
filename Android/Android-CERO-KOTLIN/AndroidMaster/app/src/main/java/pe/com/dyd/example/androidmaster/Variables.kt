package pe.com.dyd.example.androidmaster

fun main() {
    /*
    Cuando se declara con "val" es un valor, el cual no puede asignar un valor posteriormente
    Cuando se delcara con "var" es una variables, el cual si se puede asignar un valor posteriormente
     */
    /*
    Variable Numéricas
     */
    // Int -2,147,483,647 a 2,147,483,647
    val age:Int = 30
    var age2:Int = 30
    println(age2)
    age2 = 32
    println(age2)
    println("Sumar")
    println(age+age2)
    println("Dividir")
    println(age2/age)
    println("Dividir - Módulo")
    println(age2%age)
    // Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val example:Long = 30
    val example2 = 30 // int
    // Float
    val floatExample:Float = 30.5f
    // Double
    val doubleExample:Double = 3241.3123123
    /*
    Variables alfanumericas
     */
    // Char
    val charExample1:Char = 'e'
    val charExample2:Char = '1'
    val charExample3:Char = '@'
    // String
    val stringExample:String = "Edgard"
    val stringExample2 = "Edgard"

    var stringConcatenada:String = "Hola"
    stringConcatenada = "Hola me llamo $stringExample2 y tengo $age años"
    println(stringConcatenada)

    /*
    Variables Booleanas
     */
    // Boolean
    val booleanExample1:Boolean = true
    val booleanExample2:Boolean = false
    val booleanExample3 = false

    print(stringExample)
}