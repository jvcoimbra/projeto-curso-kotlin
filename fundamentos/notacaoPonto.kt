package fundamentos

fun main() {
    val a: Int = 33.dec() //função de decremento
    var b: String = a.toString() // função para transformar, nesse caso, um literal em string

    println("Int: $a")
    println("Primeiro char da string b é ${b.first()}") // função para chamar o primeiro char da string
}