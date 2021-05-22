package exercicio9

class Estoque(
        var nome: String,
        var quantidadeAtual: Int = 1,
        var quantidadeMinima: Int = 1
) {
    init {
        if (quantidadeAtual == 0) {
            quantidadeAtual = 1

        }
        mudarQtdMinima(quantidadeMinima)
    }

    fun mudarNome(novoNome: String) {
        nome = novoNome
    }

    fun mudarQtdMinima(novaQuantidadeMinima: Int) {
        if (quantidadeMinima == 0) {
            quantidadeMinima = 1
        } else if (novaQuantidadeMinima >= 1) {
            quantidadeMinima = novaQuantidadeMinima
        }

    }

    fun repor(quantidade: Int) {
        quantidadeAtual = +quantidade
    }

    fun darBaixa(quantidade: Int) {
        if (quantidadeMinima >= 1)
            quantidadeAtual -= quantidade
    }

    fun mostra() {
        println(" A quantidade mínima é $quantidadeMinima, a quantidade Atual é $quantidadeAtual, o nome é $nome")
    }

    fun precisaRepor() {
        if (quantidadeAtual <= quantidadeMinima) {
            println(true)
        } else {
            println(false)
        }
    }
}


