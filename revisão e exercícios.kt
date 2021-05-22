//
//class Trabalhador(val idade: Int, val sexo: Char, val anos: Int) {
//    fun verificarContribuicao() {
//        if (anos < 30) {
//            println(false)
//        } else if (sexo == 'F' && idade > 59) {
//            println(true)
//        } else if (sexo == 'M' && idade > 64) {
//            println(true)
//        } else {
//            println(false)
//        }
//
//    }
//}//
//
//val number1 = numbers(listOf(1, 2, 3))
//val number2 = numbers(listOf(1, 4, 8))
//val number3 = numbers(listOf(5, 4, 8))
//val number4 = numbers(listOf())
//
//class numbers(val listnumbers: List<Int>) {
//    fun multiplyAllItems() {
//        var total = 1
//        for (x in listnumbers) {
//            total *= x
//        }
//        println(total)
////    }
////}
//    val Gabriela = Cliente ("Gabriela", "Giubine"
//    )
//
//class Cliente (
//        val nome: String,
//        val sobrenome: String)
//
//class Conta (
//        val numeroDaConta: Int,
//        var saldo: Double,
//        val titular: Cliente
//        ) {
//    fun deposito(valorAReceber: Double) {
//        saldo += valorAReceber
//    }
//    fun saque(quantia: Double) {
//        if (quantia > saldo)
//
//   println("Saldo Insulficiente")
//  }
//   abstract class Ingresso(
//           var valor: Double
//            )
//    abstract class Vip(
//            var valorAdicional: Double
//    ): Ingresso() {
//    }
//    abstract class Normal: Ingresso()
//           abstract fun ingressoNormal(){
//                println( "Ingresso Normal")
//            }
//    )
//}

open abstract class BancariaConta {
    abstract var nmrCnt: Int
    abstract var sald: Double
    abstract fun scar(value: Double) {

    }

    abstract fun dpostr(value: Double) {

    }

    class CorrenCont(

            var operaTaxa: Double
    ) : BancariaConta(), Print {
        override fun scar(value: Double) {
            if(value > (sald + operaTaxa)) {
                println("Saldo Insulficiente")
        }

        override fun dpostr(value: Double) {
            operaTaxa
        }

        override fun mostraDados() {
            println("O número da Conta é $nmrCnt"
                    "O meu saldo é $sald"
                    "A taxa de operação é $operaTaxa")
        }

        class PoupCont(
                var limt: Double = 100.0
        ) : BancariaConta(), Print {
            override fun scar(value: Double) {
                if (limt >= 100.00) {
                    if (sald <= 0) {
                        sald + limt
                    }
                }
                override fun mostraDados() {
                    println("O número da Conta é $nmrCnt"
                            "O meu saldo é $sald"
                            "A taxa de operação é $operaTaxa")
                }
            }

            interface Print {
                fun mostaDados() {

                }


                class Relat() {
                    fun gerRela(print: Print) {
                        print.mostradados()
                    }

                }

        }
    }



}}

}











