package com.max.idea;

import java.util.Scanner;

public class Data1 {
    public static void main(String[] args) {
        System.out.println("Введите 2 неравных числа:");
        Scanner input = new Scanner(System.in);
        String a = input.next();
        int b = input.nextInt();
        int a1 = Integer.parseInt(a);

        if (a1 > b){
            System.out.println("Большее число:" + a1);
            double b2 = b;
            System.out.println("Меньшее число:" + b2);
        } else if (a1 == b){
            System.out.println("Не соответсвует условию");
        }else{
            System.out.println("Большее число:" + b);
            double a2 = a1;
            System.out.println("Меньшее число:" + a2);
        }
    }
}
