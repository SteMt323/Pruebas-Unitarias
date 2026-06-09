import ni.edu.uam.pruebaunitaria.model.Calculadora
import org.junit.Assert.assertEquals
import org.junit.Test

class CalculadoraTest {

    @Test
    fun verificarSuma() {

        val calculadora = Calculadora()

        val resultado = calculadora.sumar(5, 3)

        assertEquals(8, resultado)
    }

    @Test
    fun verificarResta() {
        val calculadora = Calculadora()
        val resultado = calculadora.restar(5, 3)
        assertEquals(2, resultado)
    }

    @Test
    fun verificarMultiplicacion() {
        val calculadora = Calculadora()
        val resultado = calculadora.multiplicar(5, 3)
        assertEquals(15, resultado)
    }

    @Test
    fun verificarDivision() {
        val calculadora = Calculadora()
        val resultado = calculadora.dividir(6, 3)
        assertEquals(2, resultado)
    }

    @Test
    fun testFalla(){
        val calculadora = Calculadora()
        val resultado = calculadora.sumar(6, 3)
        assertEquals(2, resultado)
    }

}