package pe.com.dyd.example.androidmaster

val age:Int = 30

fun main() {
    /*
    Cuando se declara con "val" es un valor, el cual no puede asignar un valor posteriormente
    Cuando se delcara con "var" es una variables, el cual si se puede asignar un valor posteriormente
     */
    /*
    print -> pinta en pantalla un texto
    println -> igual que el print pero le adiciona al final un salto de linea
    */
    showMyName("Edgard")
    showMyAge(29)
    add(25, 76)
    val mySubtract = subtract(10, 5)
    println(mySubtract)
}

fun showMyName(name:String) {
    println("Me llamo $name")
}

fun showMyAge(currentAge:Int = 30) {
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

fun subtractCool(firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber


fun variableNumericas() {
    /*
    Variable Numéricas
    */
    // Int -2,147,483,647 a 2,147,483,647
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
}

fun variableBoolean() {
    /*
    Variables Booleanas
    */
    // Boolean
    val booleanExample1:Boolean = true
    val booleanExample2:Boolean = false
    val booleanExample3 = false

    print(booleanExample3)
}

fun variableAlfaNumericas() {
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
    val example123:String = age.toString()

    var stringConcatenada:String = "Hola"
    stringConcatenada = "Hola me llamo $stringExample2 y tengo $age años"
    println(stringConcatenada)
}