package pro.sky.skyprospringhomework;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

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
    public double division (Integer num1, Integer num2) throws IllegalArgumentException {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return num1.doubleValue()/num2.doubleValue();
    }
    @Override
    public int multiplication (Integer num1, Integer num2) {
        return num1*num2;
    }
}
