import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest{

    @Test
    fun soma(){
        assertEquals(4,Calculadora.soma(2,8))
    }
    @Test
    fun sub(){
        assertEquals(1,Calculadora.sub(2,1))

    }
    @Test
    fun divisao(){
        assertEquals(1,Calculadora.divisão(1,1))
    }
    @Test
    fun mult(){
        assertEquals(10,Calculadora.mult(10,1))
    }
    @Test
    fun raiz(){
        assertEquals(5.0,Calculadora.raiz(25.0))
    }
    @Test
    fun potencia(){
        assertEquals(16.0,Calculadora.potencia(4.0,2.0))
    }
}
