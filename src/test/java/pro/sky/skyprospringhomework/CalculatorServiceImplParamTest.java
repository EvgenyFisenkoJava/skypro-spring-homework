package pro.sky.skyprospringhomework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceImplParamTest {
    private CalculatorServiceImpl calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorServiceImpl();
    }

    public static Stream<Arguments> paramsForTest() {
        return Stream.of(
                Arguments.of(3, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    void addition(int num1, int num2) {
        int result = calculatorService.addition(num1, num2);
        assertEquals(5, result);
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    void subtraction(int num1, int num2) {
        int result = calculatorService.subtraction(num1, num2);
        assertEquals(1, result);
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    void division(int num1, int num2) {
        double result = calculatorService.division(num1, num2);
        assertEquals(1.5, result);
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    void multiply(int num1, int num2) {
        int result = calculatorService.multiplication(num1, num2);
        assertEquals(6, result);
    }
}