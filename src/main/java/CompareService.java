import java.util.InputMismatchException;

public class CompareService {
    public void compareIntegers(int a, int b) {

        try {
            if (a > b) {
                System.out.println(a + " больше, чем " + b);
            } else if (a < b) {
                System.out.println(a + " меньше, чем " + b);
            } else {
                System.out.println("Числа равны");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введите целое число.");
        }
    }
}
