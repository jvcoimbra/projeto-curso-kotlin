package fundamentos.controle

fun main() {
    val nota: Double = 8.3

    //Usando o operador range

    if (nota in 9..10) {
        println("Honor Roll")
    } else if (nota in 7..8) { //como range está com inteiros, o valor Double é truncado, "transformado" para inteiro
        println("Aprovado")
    } else if (nota in 4..6) {
        println("Tem como recuperar")
    } else if (nota in 0..3) {
        println("Reprovado. Te vejo no próximo semestre")
    } else {
        println("Nota inválida")
    }
}