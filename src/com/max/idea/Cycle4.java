package com.max.idea;

import java.util.Scanner;

public class Cycle4 {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы a*b:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int[][] array = new int[a][b];
        System.out.println("Заполните матрицу:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Введите элемент массива [" + i + "] [" + j + "]:");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Первая строка матрицы умноженная на 3:");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println(array[i][j]*3);
            }
        }
    }
}
