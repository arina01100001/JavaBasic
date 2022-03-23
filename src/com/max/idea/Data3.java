package com.max.idea;

import java.util.Scanner;

public class Data3 {
    public static void main(String[] args) {
        System.out.println("Введите строку любую строку, разделенную пробелами: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] subStr;
        int count = 0;
        subStr = str.split(" ");
        //public boolean matches(String regex);
        for (int i = 0; i < subStr.length; i++){
           boolean match = subStr[i].matches("[a-zA-Z]+");
            if (match){
                System.out.println(subStr[i]);
                count++;
            }
        }
        System.out.println("Количество строк, состоящих только из латиницы: " + count);
    }
}
