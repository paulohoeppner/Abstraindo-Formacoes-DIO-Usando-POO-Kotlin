data class ConteudoEducacional (
    var nomeCurso: String,
    var enum: Enum<Nivel>,
    var duracao: String
)

// Criando a formação e definindo seus conteúdos

val conteudoEducacional = mutableListOf(
    ConteudoEducacional("Curso Conhecendo o Kotlin e Sua Documentação Oficial", Nivel.BASICO, "1 hora"),
    ConteudoEducacional("Curso Introdução Prática à Linguagem de Programação Kotlin", Nivel.BASICO, "2 horas"),
    ConteudoEducacional("Curso Estruturas de Controle de Fluxo e Coleções em Kotlin", Nivel.INTERMEDIARIO, "2 horas"),
    ConteudoEducacional("Curso Orientação a Objetos e Tipos de Classes na Prática com Kotlin", Nivel.INTERMEDIARIO, "2 horas"),
    ConteudoEducacional("Curso O Poder das Funções em Kotlin", Nivel.DIFICIL, "2 horas"),
    ConteudoEducacional("Curso Tratamento de Exceções em Kotlin", Nivel.DIFICIL, "2 horas \n")
)
