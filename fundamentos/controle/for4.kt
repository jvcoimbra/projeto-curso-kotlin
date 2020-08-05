package fundamentos.controle

fun main() {
    val alunos = arrayListOf("André", "Carla", "Marcos")
    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice + 1} - $aluno") // imprime uma lista númerica com os nomes do array de acordo com seus indices
    }
}