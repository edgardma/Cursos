package pe.com.dyd.example.androidmaster

fun main() {
    ifBasico()
    ifAnidado()
}

fun ifMultipleOR() {
    var pet = "dog"
    var isHappy = true

    if (pet == "dog" || (pet == "cat" && isHappy)) {
        println("Es un gato o un perro")
    }
}

fun ifMultiple() {
    var age = 18
    var parentPermission = false
    var imHappy = true

    if (age >= 18 && parentPermission && parentPermission) {
        println("Puedo beber cerveza")
    }
}

fun ifInt() {
    var age = 29

    if (age >= 18) {
        println("Beber cerveza")
    } else {
        println("Beber jugo")
    }
}

fun ifBoolean() {
    var soyFeliz: Boolean = false

    if (!soyFeliz) {
        println("La negacion de la variable")
    }
}

fun ifAnidado() {
    val animal = "dog"

    if (animal == "dog") {
        println("Es un perro")
    } else if (animal == "cat") {
        println("Es un gato")
    } else if (animal == "bird") {
        println("Es un pajarito")
    } else {
        println("No es uno de los animales esperados")
    }
}

fun ifBasico() {
    val name = "Pepe"

    if(name == "Edgard") {
        println("Eres Edgard")
    } else {
        println("No eres Edgard")
    }
}