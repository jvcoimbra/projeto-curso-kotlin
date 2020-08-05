package fundamentos.controle

fun main() {
    for (i in 1..10) {
        if (i == 5) {
            continue    // faz com que, quando i=5, o código interrompe a iteração e parte para a seguinte
            // nesse caso, vai pular a impressão do i = 5
        }
        println("Atual: $i")
    }
}