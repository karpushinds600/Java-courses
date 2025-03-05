import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String censoredText = input.replaceAll("\\bкака\\b|\\bбяка\\b", "вырезано цензурой");

        System.out.println(censoredText);
    }
}