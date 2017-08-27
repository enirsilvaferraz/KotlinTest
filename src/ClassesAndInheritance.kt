
class Person constructor(firstName: String){

}

// Se o construtor nao tiver anotacao ou modificadores de acesso a palavra constructor pode ser omitida
class Person2 (firstName: String){

    // Construtores nao pode conter codigos
    init {
        println("Customer initialized with value ${firstName}")
    }
}


fun main(args: Array<String>) {

}