package fundamentos
/*
 * val é a palavra reservada que corresponde a declaração de uma constante
 */
fun main() {
    val a: Int = 1
    val b = 2 // Tipo inferido

    //a = a + b; Não é possível mudar o valor de uma constante
    print(a)
}