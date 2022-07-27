package pro.sky.skyprospringhomework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorServiceImplTest {
    private CalculatorServiceImpl calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorServiceImpl();
    }

    @Test
    public void testPlus()  {
        assertEquals(5, calculatorService.addition(2, 3));
        assertEquals(-9, calculatorService.addition(-7, -2));
    }

    @Test
    public void testMinus()  {
        assertEquals(1, calculatorService.subtraction(4, 3));
        assertEquals(-3, calculatorService.subtraction(4, 7));
    }

    @Test
    public void testMultiply()  {
        assertEquals(12, calculatorService.multiplication(4, 3));
        assertEquals(-300, calculatorService.multiplication(50, -6));
    }

    @Test
    public void testDivide() throws IllegalArgumentException {
        assertEquals(3, calculatorService.division(9, 3));
        assertEquals(1.5, calculatorService.division(3, 2));
    }

    @Test
    public void divisionByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.division(2,0), "Division by zero exception was expected");
    }
}
