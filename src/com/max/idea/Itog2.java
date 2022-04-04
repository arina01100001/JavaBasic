package com.max.idea;

import java.util.Scanner;

public class Itog2 {
    public static void main(String[] args) {
        String string;
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        int x = 0;
        System.out.println("Введите уравнение: ");
        Scanner input = new Scanner(System.in);
        string = input.nextLine();

        String a = string.substring(0,1);
        String b = string.substring(2,3);
        String c = string.substring(4);
        String op = string.substring(1,2);

        if (a.equals("x")){
            c1 = Integer.parseInt(c);
            b1 = Integer.parseInt(b);
            switch (op){
                case ("+"):{
                    x = c1 - b1;
                break;
                }
                case ("-"):{
                    x = c1 + b1;
                break;
                }
        }
        }

        if (b.equals("x")){
            c1 = Integer.parseInt(c);
            a1 = Integer.parseInt(a);
            switch (op){
                case ("+"):{
                    x = c1 - a1;
                    break;
                }
                case ("-"):{
                    x = a1 - c1;
                    break;
                }
            }
        }

        if (c.equals("x")){
            a1 = Integer.parseInt(a);
            b1 = Integer.parseInt(b);
            switch (op){
                case ("+"):{
                    x = a1 + b1;
                    break;
                }
                case ("-"):{
                    x = a1 - b1;
                    break;
                }
            }
        }

        System.out.println("X = " + x);
    }
}
