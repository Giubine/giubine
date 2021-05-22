fun main() {
    val gAbiContaCorrente = ContaCorrente(
            numeroDaConta = 1234
                    taxaDeOperacao = 10.0
    )
    var eduContaPoupanca = ContaPoupanca(
            numeroDAConta = 4321
                    limite = 10.0
    )
    gAbiContaCorrente.depositar(100.00)
    eduContaPoupanca.depositar(100.00)
    gAbiContaCorrente.sacar(50.0)
    eduContaPoupanca.sacar(30.0)

    val relatorio = Relatorio()

    relatorio.gerarRelatorio(gAbiContaCorrente)
    relatorio.gerarRelatorio(eduContaPoupanca)

    gAbiContaCorrente.sacar(20.0)
    eduContaPoupanca.sacar(75.0)

    eduContaPoupanca.transferir(10.0, gAbiContaCorrente)
}

open abstract class ContaBancaria {
    abstract val numeroConta: Int
    abstract var saldo: Double
    abstract fun sacar(value: Double)
    abstract fun depositar(value: Double)
    fun transferir(value: Double, contaBancaria: ContaBancaria) {
        sacar(value)
        contaBancaria.depositar(value)
    }
}

class ContaCorrente(
        override val numeroDaConta: Int,
        override var saldo: Double = 0.0,
        val taxaDeOperacao: Double
) : ContaBancaria(), Imprimivel {
    override var numeroConta: Int = 1234
    override var saldo: Double = 100.00
    override fun sacar(value: Double) {
        if (value + taxaDeOperacao) > saldo) {
            println("Saldo Insulficiente")
        } else {
            saldo -= value + taxaDeOperacao
            println("Saque executado com sucesso")
        }
    }

    override fun depositar(value: Double) {
        saldo += value + taxaDeOperacao
        println("Depósito realizado")
    }

}

class ContaPoupanca(
        override var numeroConta: Int = 1234
                override
                var saldo: Double = 0.0,
        val limite: Double
) : ContaBancaria(), Imprimivel {
    override fun sacar(value: Double) {
        val saldoTotal = saldo + limite
        if (value > saldoTotal) {
            println("Saldo Insulficiente")
        } else {
            saldo -= value
        }

    }

    override fun depositar(value: Double) {

    }

    interface Imprimivel {
        fun mostrarDados() {
            println("O numero da conta é $conta")
        }

    }

    class Relatorio {
        fun gerarRelatorio(imprimivel: Imprimivel) {
            imprimivel.mostrarDados()

        }
    }

    class Banco (
            val contas = mutableListOf<contaBancaria>()
    ){
        fun inserir (contaCorrente: ContaCorrente){
            listaContas?.add(ContaBancaria)
        }
        fun remover(){

        }
        fun procurarConta(){

        }
    }
    )
}



