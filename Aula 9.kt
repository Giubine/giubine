fun main(){
    val professsor = Professor ( " Cesar","123")
    val materiaKotlin = Materia ("Aula de Kotlin")
    val aulaKotlin= Aula ("19:30","21:30",materiaKotlin)
}

class Materia(var nomeDaMateria: String)

open class Pessoa()

open class Aula(
       var horarioDeInicio: String,
      var horarioDeTermino: String,
        var materia: Materia)
class Aluno(
        var registroAcademico: String,
       var nomeDoAluno: String,
        var sobrenomeDoAluno: String

) fun fazerLicao() {

} fun assistirAula(){
}
class Professor (nome:String, registroDocente: String)

class Curso (
        var nomeDoCurso: String,
        var listaDeAlunos: List<Aluno>,
        var listaDeAulas: List<Aula>,
        professsor: Professor
)

