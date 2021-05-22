//}


//fun main () {
//
//    var A: Int = 10
//    var B: Int = 9
//    var X: Int = A + B
//
//println("X = $X")
//}
//
//
//fun main () {
//    var n: Double = 3.14159
//    var R: Double = 2.00
//    var raizQuadrada: Double =  R * R
//    var x: Double = n * raizQuadrada
//    println("A = $x")
//
//}
//fun main (){
//    var A: Int = 30
//    var B: Int = 10
//    var SOMA: Int = A + B
//    println ("SOMA = $SOMA")
//}
//fun main(){
//    var A: Int = 3
//    var B: Int = 9
//    var PROD: Int = A * B
//    println("PROD = $PROD")
//fun main (){
//    var Nota1: Float = 5.0F
//    var Nota2 = 7.1f
//    var soma = Nota1 + Nota2
//    var Media: Double = soma / 2.00
//
//    println("MEDIA = $Media")
//
//}

fun main() {
//    var primeiroPeixe: Int= 1
//    var segundoPeixe: Int = 1
//    var reproducao1: Int = 73
//    var repodução2: Int = 233
//
//    val quantidadeFinal: Int = (1+1+73+233-13/30+1)
//
//
//    var rainbowColor = "red"
//    rainbowColor = "blue"
//    val blackColor = "black"
//
//var greenColor = null
////    var bllueColor: Int? = null
//
//
////    listOf(null,null)
////    [null, null]
////    var list: List<Int?> = listOf(null, null)
////    var list2:List<Int>? = null
//
//var nullTest: Int? = null

    val peixe: String = "Peixe"
    val Planta: String= "Planta"
    println(peixe==Planta)
    println(peixe==peixe)
    println(peixe!=Planta)
val numeroDePeixe = 50
    val numeroDePlanta= 23
    if (numeroDePeixe > numeroDePlanta)
        println("Bom rateio")
    else
        println("doente Rateio")

    when(numeroDePeixe){
        0 -> println("Empty Tank")
        50 -> println("Full Tank")
        else -> println("Perfeito!")
    }
}
val trout = "trout"
var haddock = "haddock"
var snapper = "snapper"

//var fishName: Int = 8
//when(fishName.length){
//    0 -> println("Fish name cannot be empty")
//    in 3..12 -> println("Good fish name")
//    else -> "OK fish name"
//}

// initalize array here
//val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
//        "terabyte", "petabyte", "exabyte")
//for percorrendo((i, value) in array.withIndex()) {
//    println("1 ${sizes[$i]} = ${value.toLong()} bytes")
//}

//var list3 : MutableList<Int> = mutableListOf()
//for (i in 0..100 step 7) list3.add(i)
//print(list3)