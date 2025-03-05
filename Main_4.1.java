import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String mainString = scanner.nextLine();

        System.out.print("Введите подстроку: ");
        String substring = scanner.nextLine();

        int count = 0;
        int index = 0;
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        System.out.println("Подстрока '" + substring + "' встречается " + count + " раз(а).");
    }
}