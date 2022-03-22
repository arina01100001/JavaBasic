package com.max.idea;

import java.util.Scanner;

public class Cycle2 {
    public static void main(String[] args) {
        System.out.println("Введите любое положительное число:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int nechet = 0;
        if (n > 0){
            for (int i = 0; i <=n; i++)
                if ( i % 2 != 0){
                sum += i;
        }
        System.out.println("Сумма чисел включая введенное число:" + sum);
        }
    }
}

