// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, var idade: Int)

 data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

 data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    var usuario1 = Usuario("Roberta", 24)
    var usuario2 = Usuario("Sergio", 18)
    var conteudo1: ConteudoEducacional = ConteudoEducacional("Criando variaveis em Kotlin", 120)
    var conteudo2: ConteudoEducacional = ConteudoEducacional("Criando funções em Kotlin", 120)
    var disciplinas: List<ConteudoEducacional> = listOf(conteudo1, conteudo2)
    var formacao: Formacao = Formacao("Fundamentos de Kotlin", disciplinas)
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    
}