package fundamentos

fun soma(a: Int, b: Int = 1): Int { // é possível declarar um valor inicial para um dos parâmetros da função
    return a + b
}

fun main() {
    println(soma(2,3))
    println(soma(11))
}