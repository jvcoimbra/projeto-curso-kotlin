package fundamentos.controle

fun main() {
    val num1: Int = 2
    val num2: Int = 3

    val maiorValor = if (num1 > num2) { //if pode ser usado para definir uma variável
        println("processando...")
        num1 //última linha da estrutura deve sempre ser o valor a ser atribuido à variável
    } else {
        println("processando...")
        num2
    }

    println("O maior valor é $maiorValor.")
}