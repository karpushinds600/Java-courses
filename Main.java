import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[20];
        int[] check = new int[15];
        for (int i = 0; i < 20; ++i) {
            array[i] = (int) Math.ceil(Math.random() * 15D);
            if (i == 0)
                System.out.printf("[%d, ", array[i]);
            else if (i == 19)
                System.out.printf("%d]", array[i]);
            else
                System.out.printf("%d, ", array[i]);
            ++check[array[i] - 1];
        }
        System.out.println();
        for (int i = 0; i < 15; ++i)
            if (check[i] > 1)
                System.out.printf("Число '%d' встречается %d раза \n", i + 1, check[i]);
        in.close();
    }
}