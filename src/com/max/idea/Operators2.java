package com.max.idea;

import java.util.Scanner;

public class Operators2 {
    public static void main(String[] args) {
        System.out.println("Введите 2 целых числа: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Введите арифметическую операцию: ");
        char operation = input.next().charAt(0);

        int result = 0;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a -b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a/b;

            default:
                System.out.println("Неизвестная операция");
       // return result;
        }
        System.out.println(result);
    }
}
