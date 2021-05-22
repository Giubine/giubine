package exercicio9

class Fatura(
        var list: List<Item>
) {
    fun getTotalFatura() {
        var total = 0.0
        list.forEach { total += it.quantidadeDeItem * it.precoDeItem }
        println("o total da sua compra é $total")
    }

}

fun main() {
    var sabonete = Item(45, "Avon", 2, 3.50)
    var hidratante = Item(41,"Natura",5, 5.45)
    var pedido1 = Fatura(listOf(sabonete,hidratante))
pedido1.getTotalFatura()
}
