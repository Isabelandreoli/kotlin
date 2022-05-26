package teste

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest{
    @Test
    fun somaTest(){
        assertEquals(12.0, Calculadora.soma(10.0, 2.0))
    }
    @Test
    fun subTest(){
        assertEquals(8.0, Calculadora.sub(10.0, 2.0))
    }
    @Test
    fun multTest(){
        assertEquals(-10.0, Calculadora.mult(10.0, -1.0))
    }
    @Test
    fun diviTest(){
        assertEquals(5.0, Calculadora.divi(10.0, 2.0))
    }
    @Test
    fun raizTest(){
        assertEquals(4.0, Calculadora.raiz(16.0))
    }
    @Test
    fun potTest(){
        assertEquals(9.0, Calculadora.pot(3.0, 2.0))
    }
}