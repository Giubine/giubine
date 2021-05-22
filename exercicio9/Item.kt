package exercicio9

class Item(
        var numeroDeItem: Int,
        var descricaoDeItem: String,
        var quantidadeDeItem: Int,
        var precoDeItem: Double
) {

    init {
        if (quantidadeDeItem < 0) {
            quantidadeDeItem = 0
        }
        if (precoDeItem < 0) {
            precoDeItem = 0.0
        }

    }
}
