package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            if (y == 0) {
                System.out.println("Деление на 0");
                i++;
                continue;
            }
            double z = x / y;
            System.out.println(z);
            i++;

        }
    }
}
