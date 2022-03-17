package com.max.idea;

import java.util.Scanner;

public class Cycle2 {
    public static void main(String[] args) {
        System.out.println("Введите любое положительное число:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        if (n > 0){
            for (int i = 0; i <=n; i++)
                sum += i;
        }
        else System.out.println("Число не положительное");

        if (sum != 0) {
            System.out.println("Сумма чисел включая введенное число:" + sum);
        }
        }
    }

