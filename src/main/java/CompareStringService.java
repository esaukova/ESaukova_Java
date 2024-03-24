import java.util.Scanner;

public class CompareStringService {

    public void compareString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String a = scanner.nextLine();

        System.out.println("Введите вторую строки: ");
        String b = scanner.nextLine();

        if (a.equals(b)){
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
