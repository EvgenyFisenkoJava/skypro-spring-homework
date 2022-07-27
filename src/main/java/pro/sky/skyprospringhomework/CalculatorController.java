package pro.sky.skyprospringhomework;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorServiceImpl calculatorServiceImpl;

    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping
    public String greeting() {
        return calculatorServiceImpl.welcome();
    }

    @GetMapping(path = "/plus")
    public String addition(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null) {
            return "Ошибка! Введите первое число.";
        } else if (num2 == null) {
            return "Ошибка! Введите второе число.";
        } else {
            return num1 + " + " + num2 + " = " + calculatorServiceImpl.addition(num1, num2);
        }
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam(value = "num1", required = false) Integer num1,
                              @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null) {
            return "Ошибка! Введите первое число.";
        } else if (num2 == null) {
            return "Ошибка! Введите второе число.";
        } else {
            return num1 + " - " + num2 + " = " + calculatorServiceImpl.subtraction(num1, num2);
        }
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam(value = "num1", required = false) Integer num1,
                                 @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null) {
            return "Ошибка! Введите первое число.";
        } else if (num2 == null) {
            return "Ошибка! Введите второе число.";
        } else {
            return num1 + " * " + num2 + " = " + calculatorServiceImpl.multiplication(num1, num2);
        }
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null) {
            return "Ошибка! Введите первое число.";
        } else if (num2 == null) {
            return "Ошибка! Введите второе число.";
        }
         else {
            return num1 + " / " + num2 + " = " + calculatorServiceImpl.division(num1, num2);
        }
    }
}
