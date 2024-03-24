public class ArithmeticService {
    public void addition(int a, int b) {
        int sum  = a + b;
        System.out.println("Сумма = " + sum);
    }
    public void subtraction (int a, int b) {
        int diff = a - b;
        System.out.println("Разность = " + diff);
    }
    public void multiplication (int a, int b) {
        int mult = a * b;
        System.out.println("Произведение = " + mult);
    }
    public void division (double a, double b) {
        try {
            if (b == 0){
                throw new ArithmeticException("Делить на ноль нельзя!");
            }
        double div = a / b;
        System.out.println("Частное = " + div);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
