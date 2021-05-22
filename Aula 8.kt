fun main () {

    val bichano = Bichano()
  bichano.come()
    bichano.cor
    bichano.minhaRaca()
    println(bichano.sexo)

    val gato = Gato()
    gato.minhaRaca()
    println(gato.sexo)

}

class Cachorro: Animal(
        sexo = "M"
) {

}

class Bichano: Gato (

        ) {
    override val sexo: String = "M"

    init {
        raca = "Gato"

    }

    override fun come() {
        super.come()
        println("Come do jeito bichano de ser")

    }
}
open class Gato: Animal(
        sexo = "F",
        cor ="Preto"
) {

}

class Leao: Animal() {

}

open class Animal(
        open val sexo: String = "0"
  )  {

  var cor = ""
    protected var raca = "Nenhuma"

  constructor (sexo: String, cor: String): this(sexo) {
    this.cor = cor
  }
 open fun come() {
   println("Come do jeito defalt")
 }
    fun minhaRaca(){
        raca = "Gato"
        println("Minha raça é $raca")
    }
 }

