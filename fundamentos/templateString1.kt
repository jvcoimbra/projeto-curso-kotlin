package fundamentos

fun main() {
    val aprovados = listOf("João", "Maria", "Pedro")
    println("O primeiro colocado foi ${aprovados[0]}.") // sifrão para chamar o array dentro da string [template string]
    print("O primeiro colocado foi " + aprovados[0] + ".") // concatenação "padrão"
}