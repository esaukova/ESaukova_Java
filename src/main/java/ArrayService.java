public class ArrayService {
    public void EvenNumbers(int[] numbers) throws NotAllIntException {
        System.out.println("Чётные числа: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            } else if (number != (int) number) {
                throw new NotAllIntException("Массив должен содержать только целые числа.");
            }
        }
    }
}
