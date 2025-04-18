import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class MiniCalculatriceTest {

    MiniCalculatrice calc = new MiniCalculatrice();

    @Test
    public void testAddition() {
        assertEquals(15.0, calc.addition(10, 5), 0.001);
    }

    @Test
    public void testSoustraction() {
        assertEquals(5.0, calc.soustraction(10, 5), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(50.0, calc.multiplication(10, 5), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calc.division(10, 5), 0.001);
    }

    @Test
    public void testDivisionParZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.division(10, 0);
        });

        assertEquals("Division par zéro !", exception.getMessage());
    }
}
