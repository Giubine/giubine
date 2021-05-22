import kotlin.test.todo

fun main() {
}
class SaoPaulo(override val icms: Double): RegraDeOuro {

    fun colherEstadoXpto(): Double {
        TODO("Not yet implemented")
    }

    override fun colherEstadXpto(): Double {
        TODO("Not yet implemented")
    }

    override fun colherEstadoXyz() {
        TODO("Not yet implemented")
    }
    override fun colherEstadoX() {
        TODO("Not yet implemented")
    }
}

interface RegraDeOuro {
val icms: Double
    fun colherEstadXpto(): Double
    fun colherEstadoXyz()
    fun colherEstadoX()
    }

abstract class RegraDePrata {
    val icms = 7.0
    abstract fun colherEstadoXpto(): Double
    abstract fun colherEstadoXyz(): Double
    abstract fun colherEstadoX()
}


