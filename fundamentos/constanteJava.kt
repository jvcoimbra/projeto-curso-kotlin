package fundamentos
/*
 * A partir de um código em Kotlin é possível acessar as funcionalidades do Java (ex.: Math.PI) com a mesma grafia,
 * como se fosse um código híbrido. E vice-cersa, a partir de um código em Java é possível acessar as funcionalidades
 * do Kotlin sem mudar a grafia.
 */
fun main() {
    val raio = 4.5
    print(raio * raio * Math.PI)
}