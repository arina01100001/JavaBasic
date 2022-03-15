package com.max.idea;

import java.util.Scanner;

public class Operators1 {
    public static void main(String[] args) {
        double avg = 0;
        double sum = 0;

        System.out.println("Введите три числа с клавиатуры:");
        Scanner numb = new Scanner(System.in);
        int[] num = new int[3];
        for (int i = 0; i < num.length; i++) {
            num[i] = numb.nextInt();
            sum = sum + num[i];
            if (i == (num.length-1) ){
                avg = sum/3;
                System.out.println(avg);
            }
        }
        double okr = avg/2;

        int prov = (int) Math.floor(okr);
        if (prov>3) {
            System.out.println("Программа выполнена корректно" );
        }

    }
}
