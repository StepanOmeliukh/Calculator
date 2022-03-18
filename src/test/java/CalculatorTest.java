import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void sumTest() {
        assertEquals(new Double(10.0), calculator.sum(13.0, -3.0));
        assertEquals(new Double(10.0), calculator.sum(7.0, 3.0));
        assertEquals(new Double(-10.0), calculator.sum(-7.0, -3.0));
    }

    @Test
    public void subTest() {
        assertEquals(new Double(5.0), calculator.sub(12.0, 7.0));
        assertEquals(new Double(5.0), calculator.sub(3.0, -2.0));
        assertEquals(new Double(10.0), calculator.sub(-3.0, -13.0));
    }

    @Test
    public void divTest() {
        assertEquals(new Double(5.0), calculator.div(25.0, 5.0));
        assertEquals(new Double(-5.0), calculator.div(-25.0, 5.0));
        assertEquals(new Double(5.0), calculator.div(-25.0, -5.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divTestByZero() {
        calculator.div(25.0, 0.0);
    }

    @Test
    public void mulTest() {
        assertEquals(new Double(12.0), calculator.mul(3.0, 4.0));
        assertEquals(new Double(-12.0), calculator.mul(-3.0, 4.0));
        assertEquals(new Double(12.0), calculator.mul(-3.0, -4.0));
    }
}
