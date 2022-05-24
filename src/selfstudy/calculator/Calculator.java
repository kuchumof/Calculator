package selfstudy.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double d1 = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double d2 = sc.nextDouble();

        System.out.println("Сумма двух чисел равна: " + (d1 + d2));
        System.out.println("Разность двух чисел равна: " + (d1 - d2));
        System.out.println("Произведение двух чисел равно: " + (d1 * d2));
        System.out.println("Частное двух чисел равно: " + (d1 / d2));
        System.out.println("Остаток равен: " + (d1 % d2));
        sc.close();
    }
}
