package teste

import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {

    companion object {
        fun soma(n1: Double, n2: Double):Double{
            return n1 + n2
        }
        fun sub(n1: Double, n2: Double):Double{
            return n1 - n2
        }
        fun mult(n1: Double, n2: Double):Double{
            return n1 * n2
        }
        fun divi(n1: Double, n2: Double):Double{
            return n1 / n2
        }
        fun raiz(n1: Double):Double{
            return sqrt(n1)
        }
        fun pot(n1: Double, n2: Double):Double{
            return n1.pow(n2)
        }
    }
}