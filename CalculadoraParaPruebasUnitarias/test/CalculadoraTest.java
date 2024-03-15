import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.sumar();
        assertEquals(110.0, resultado, 0.001);
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.restar();
        assertEquals(90.0, resultado, 0.001);
    }

    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir();
        assertEquals(10.0, resultado, 0.001);
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar();
        assertEquals(1000.0, resultado, 0.001);
    }
}
