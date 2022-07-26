package pro.sky.skyprospringhomework;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServise {

    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public int addition (Integer num1, Integer num2) {
        return num1+num2;
    }
    @Override
    public int subtraction (Integer num1, Integer num2) {
        return num1-num2;
    }
    @Override
    public int division (Integer num1, Integer num2) {
        return num1/num2;
    }
    @Override
    public int multiplication (Integer num1, Integer num2) {
        return num1*num2;
    }
}
