package fundamentos

import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.subtracao
import fundamentos.pacoteA.simplesFuncao as funcaoSimples

fun main() {
    kotlin.io.println(funcaoSimples("Ok")) // todas funções de kotlin.io já são importadas por padrão

    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(CARA)

    println("${soma(2, 3)} ${subtracao(4, 6)}")
}