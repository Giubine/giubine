import java.util.*

fun main(args: Array<String>) {
   var hora = "11"
   if (args[2].toInt()<12)
       println("Bom dia Kotlin")
    else
        println("Boa noite Kotlin")

}

fun diasDaSemana() {
    println("Que Dia é Hoje?")
    val Dia = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(
            when (Dia) {
                1 -> "Domingo"
                2 -> "Segunda"
                3 -> "Terça"
                4 -> "Quarta"
                5 -> "Quinta"
                6 -> "Sexta"
                7 -> "Sábado"
                else -> "Tempo que parou"
            })
}