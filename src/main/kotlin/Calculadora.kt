import kotlin.math.pow
import kotlin.math.sqrt


class Calculadora {
    companion object{
        fun soma(x1:Int, x2:Int) = x1 + x2

        fun sub(x1:Int, x2:Int)= x1 - x2

        fun divisão (x1:Int, x2:Int) = x1 / x2

        fun mult (x1:Int,x2:Int) = x1 * x2

        fun potencia(x1:Double,x2:Double)=x1.pow(x2)

        fun raiz(num:Double):Double = sqrt(num)


    }
}




