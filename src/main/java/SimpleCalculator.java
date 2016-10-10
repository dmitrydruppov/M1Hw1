import calculator.ICalculator;

/**
 * Created by Dmytro_Druppov on 10/10/2016.
 */
public class SimpleCalculator implements ICalculator<Integer>{

    public Integer addTwoIntegers(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer substractNumbers(Integer num1, Integer num2) {
        return null;
    }

    public Integer substractTwoIntegers(Integer num1, Integer num2) {
        return num1 - num2;
    }

}
