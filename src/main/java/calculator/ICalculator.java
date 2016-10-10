package calculator;

/**
 * Created by Dmytro_Druppov on 10/10/2016.
 */
public interface ICalculator <T extends Number> {

    public T addTwoNumbers(T num1, T num2);

    public T substractNumbers(T num1, T num2);

}
