package selfstudy.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ������ �����: ");
        double d1 = sc.nextDouble();
        System.out.println("������� ������ �����: ");
        double d2 = sc.nextDouble();

        System.out.println("����� ���� ����� �����: " + (d1 + d2));
        System.out.println("�������� ���� ����� �����: " + (d1 - d2));
        System.out.println("������������ ���� ����� �����: " + (d1 * d2));
        System.out.println("������� ���� ����� �����: " + (d1 / d2));
        System.out.println("������� �����: " + (d1 % d2));
        sc.close();
    }
}
