import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа \n" );
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean found = false;

        if (a % 5 == 0) {
            System.out.println("a=" + a);
            found = true;
        }
        if (b % 5 == 0) {
            System.out.println("b=" + b);
            found = true;
        }
        if (c % 5 == 0) {
            System.out.println("c=" + c);
            found = true;
        }

        if (!found) {
            System.out.println("нет значений, кратных 5");
        }

        int result1 = a / b;
        System.out.println("Результат целочисленного деления a на b: " + result1);

        double result2 = (double) a / b;
        System.out.println("Результат деления на a и b: " + result2);

        int result3 = (int)Math.ceil(result2);
        System.out.println("Результат деления на a и b с округлением в большую сторону: " + result3);

        int result4 = (int)Math.floor(result2);
        System.out.println("Результат деления на a и b с округлением в меньшую сторону: " + result4);

        long result5 = Math.floorDiv(Math.round(result2), 1L);
        System.out.println("Результат деления на a и b с математическим округлением: " + result5);

        int result6 = b % c;
        System.out.println("Остаток от деления b на c: " + result6);

        int result7 = Math.min (a, b);
        System.out.println("Наименьшее значение из a и b: " + result7);

        int result8 = Math.max (b, c);
        System.out.println("Наибольшее значение из b и c: " + result8);


    }


}