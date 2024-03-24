import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целый числа: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        CompareService compareService = new CompareService();
        compareService.compareIntegers(a, b); //сравнение целых чисел

        ArithmeticService arithmeticService = new ArithmeticService();
        arithmeticService.addition(a, b); // сложение
        arithmeticService.division(a, b); // деление
        arithmeticService.multiplication(a, b); // умножение
        arithmeticService.subtraction(a, b); // вычитание


        CompareStringService compareStringService = new CompareStringService();
        compareStringService.compareString(); //сравнение строк

        ArrayService arrayService = new ArrayService();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            arrayService.EvenNumbers(numbers); //вывод чётных чисел
        } catch (NotAllIntException e) {
            System.out.println(e.getMessage());
        }
    }
}

