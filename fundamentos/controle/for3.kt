package fundamentos.controle

fun main() {
    for (i in 0..100 step 5) { //step varia o tamanho do incremento no i
        println(i)
    }

    for (i in 100 downTo 0 step 5) { // step varia o tamanho do decremento no i
        println(i)
    }
}