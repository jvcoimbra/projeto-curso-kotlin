package fundamentos.controle

fun main() {
    for (i in 1..10) {
        if (i == 5) {
            break   // o break faz o código sair do bloco de repetição, neste caso o for
        }
        println("Atual: $i")
    }
}