package com.max.idea;

import java.util.Scanner;

public class Cycle3 {
    public static void main(String[] args) {
        double sum = 0;
        double avg = 0;
        int size = 0;
       // double[] array = new double[size];
        double[] array2 = new double[size];

        System.out.println("Введите размер массива");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        System.out.println("Введите значения массива");
        double[] array = new double[size];

        for (int i=0; i < array.length; i++) {
            array[i] = input.nextDouble();
            sum += array[i];
        }
        avg = sum / size;
        for (int i=0; i < array.length; i++) {
            System.out.println(array[i]*avg);
        }
    }
}
