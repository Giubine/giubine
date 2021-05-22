import java.util.*

fun main() {
    println("Digite 1 paraIngreso Normal e 2 para VIP")
    val scanner = Scanner(System.`in`)
    val ingressoUm = scanner.nextInt()
    if (ingressoUm == 1) {
        println("Você escolheu o ingresso normal")
    } else {
        println("Que legal, agora escolha o tipo do VIP: 1 para camarote superior e 2 para camarote Inferior")
        val tipoVip = scanner.nextInt()
        if (tipoVip == 1) {
            val superior = CamaroteSuperior(100.0, 50.0)
            println("Tudo ok, o valor do ingresso no camarote superior é ${superior.valorIngresso()} reais")
        } else {
            val inferior = CamaroteInferior(100.0, 2)
            println("Tudo ok, o valor do ingresso no camarote Inferior é ${inferior.valorIngresso()} reais")
        }
    }
}

 abstract class Ingresso(
        val valorReais: Double
) {
    fun imprimeValor() {
        println("O valor do ingresso é $valorReais")

    }
}

open class Vip(
        valorReais: Double,
        val valorAdicional: Double = 0.0
) : Ingresso(valorReais) {

    fun valorIngresso(): Double {
        return valorReais + valorAdicional
    }

}

class Normal(
        valorReais: Double
) : Ingresso(valorReais) {
    fun imprimeIngresso() {
        println("Ingresso Normal")
    }
}

class CamaroteInferior(
        valorReais: Double,
        val localizacao: Int
) : Vip(valorReais) {
    fun localizacaoDoIngresso() {
        println("A localização do Ingresso é $localizacao")
    }
}

class CamaroteSuperior(
        valorReais: Double,
        valorAdicional: Double,
) : Vip(valorReais, valorAdicional)

