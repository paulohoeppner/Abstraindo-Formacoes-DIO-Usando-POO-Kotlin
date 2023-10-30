
fun main() {
//    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val formacao =
        Formacao("Desmitificando Kotlin para Programadores Java", Nivel.INTERMEDIARIO, "11 horas", conteudoEducacional)

    // Matriculando usuários na formação

    formacao.matricular(pessoa1)
    formacao.matricular(pessoa2)
    formacao.matricular(pessoa3)
    formacao.matricular(pessoa4)
    formacao.matricular(pessoa5)

    // Imprimindo os cursos sobre a formação

    imprimirFormacao(formacao)

    // Imprimindo o total de inscritos

    totalDeInscritos(formacao)
}



