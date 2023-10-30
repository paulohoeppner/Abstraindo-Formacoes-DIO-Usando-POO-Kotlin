data class Formacao(
    var nomeFormacao: String,
    var nivel: Enum<Nivel>,
    var duracaoFormacao: String,
    var conteudos: MutableList<ConteudoEducacional> = mutableListOf()
) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
}

fun cursos(formacao: Formacao) {
    for (conteudo in formacao.conteudos) {
        println("\nNome: ${conteudo.nomeCurso}, \nNível: ${conteudo.enum} , \nCarga-horária: ${conteudo.duracao}")
    }
}

fun dadosUsuarios(formacao: Formacao){
    for(usuario in formacao.inscritos){
        println("\nNome: ${usuario.nome}, \nidade: ${usuario.idade} anos, \nemail: ${usuario.email}")
    }
}

fun imprimirFormacao(formacao: Formacao){
    println("\n\nNome do curso: ${formacao.nomeFormacao} " + "\nNível:" + formacao.nivel + "\nCarga-horária: " + formacao.duracaoFormacao + "\n")
    cursos(formacao)
    dadosUsuarios(formacao)
}

fun totalDeInscritos (formacao: Formacao){
    println("\n\nTotal de inscritos para o curso: " + formacao.inscritos.size)
}

