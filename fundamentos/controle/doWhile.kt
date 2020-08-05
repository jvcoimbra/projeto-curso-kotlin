package fundamentos.controle

// o do while é usado caso seja necessário que a primeira execução seja necessária, mesmo com a variável opcao
// já esteja com o valor de parada do while
fun main() {
    var opcao: Int = -1
    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Você escolheu a opção $opcao")
    } while (opcao != -1)

    println("Até a próxima")
}