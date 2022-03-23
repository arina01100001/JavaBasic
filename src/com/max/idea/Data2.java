package com.max.idea;

import java.util.Scanner;

public class Data2 {
    public static void main(String[] args) {
        System.out.println("Введите строку без кавычек: \"I like Java!!!\": ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        boolean cont = str.contains("Java");
        boolean start = str.startsWith("I like");
        boolean end = str.endsWith("!!!");
      //  System.out.println(cont + start + end);
        if ((cont) && (start) && (end)){
            String upper = str.toUpperCase();
            System.out.println("Строка, преобразованная в верхний регистр: " + upper);
            String repl = str.replace('a', 'o');
            //int i = str.indexOf('J');
            System.out.println("Строка, с замененными символами: " + repl.substring(str.indexOf('J'), str.indexOf('!')));
        }
    }
}
