package Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    private Calculating calc = new Calculating();
    double mistake = 0.001;

    @Test
    public void sumTest() throws Exception {
        assertEquals(15, calc.plus(7,8), mistake);
    }

    @Test
    public void minusTest() throws Exception {
        assertEquals(0.3, calc.minus(7.3, 7), mistake);
    }

    @Test
    public void multiplTest() throws Exception {
        assertEquals(12.3, calc.multipl(3, 4.1), mistake);
    }

    @Test
    public void divisionTest() throws Exception {
        assertEquals(-0.25, calc.division(0.5,-2), mistake);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithExTest() {
        calc.division(1, 0);
    }

    @Test
    public void degreeTest() throws Exception {
        assertEquals(8, calc.degree(2,3), mistake);
    }

    @Test
    public void rootTest() throws Exception {
        assertEquals(7, calc.root(49,2), mistake);
    }

    @Test
    public void factTest() throws Exception {
        assertEquals(24, calc.fact(4), mistake);
    }

    @Test
    public void expTest() throws Exception {
        assertEquals(1, calc.exponent(0), mistake);
    }

    @Test
    public void absTest() throws Exception {
        assertEquals(1, calc.abs(-1), mistake);
    }

    @Test
    public void lnTest() throws Exception {
        assertEquals(0, calc.ln(1), mistake);
    }
}
