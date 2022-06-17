package pro.sky.skyprospringhomework;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorServiceImpl calculatorServiceImpl;

    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl){
        this.calculatorServiceImpl = calculatorServiceImpl;
    }
    @GetMapping
    public String welcome() {
        return calculatorServiceImpl.welcome();
    }

    @GetMapping(path = "/plus")
    public String addition(@RequestParam ("num1") int num1, @RequestParam ("num2") int num2) {
        return num1 + " + " + num2 + " = " + calculatorServiceImpl.addition(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam ("num1") int num1, @RequestParam ("num2") int num2) {
        return num1 + " - " + num2 + " = " + calculatorServiceImpl.subtraction(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplication (@RequestParam ("num1") int num1, @RequestParam ("num2") int num2) {
        return num1 + " * " + num2 + " = " + calculatorServiceImpl.multiplication(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam ("num1") int num1, @RequestParam ("num2") int num2) {
        if (num2 == 0) {
            return "на 0 делить нельзя!";
        }
        return num1 + " / " + num2 + " = " + calculatorServiceImpl.division(num1, num2);
    }
}
