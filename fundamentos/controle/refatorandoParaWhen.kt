package fundamentos.controle

fun main() {
    val nota = 6

    when (nota) {
        10, 9 -> println("Honor Roll")
        8, 7 -> println("Aprovado")
        4, 5, 6 -> println("Tem como recuperar")
        in 0..3 -> println("Reprovado. Te vejo no próximo semestre")
        else -> println("Nota inválida")
    }
}