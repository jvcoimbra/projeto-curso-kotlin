package fundamentos

fun main() {
    val opcional: String? = null
    val obrigatorio: String = opcional ?: "Valor Padrão"
    // operador Elvis, atribui um valor padrão para constantes ou variáveis que podem ter valor nulo

    println(obrigatorio)
}