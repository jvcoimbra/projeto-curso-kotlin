package fundamentos

fun main() {
    var a: Int? = null
    println(a?.inc()) // função incremento

    println("Momento do erro")
    println(a!!.inc()) // burlando o null safe
}