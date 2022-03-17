package com.max.idea;

import java.util.Scanner;

public class Cycle1 {
    public static void main(String[] args) {

        int x = 10;
        int y = 18;
        int z = 2;
        System.out.println("Введите размер массива");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        System.out.println("Введите значения массива");
        int[] array = new int[size];
        for (int i=0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        for (int i=0; i < size; i++) {
            if ((x==array[i]) || (y == array[i]) || (z == array[i])){
                System.out.println("Данное значение имеется в константах");
                break;
            }

        }
        }

    }

