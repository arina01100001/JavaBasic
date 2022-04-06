package com.max.idea;

import java.util.Scanner;
import java.lang.String;

public class Itog3 {
    public static void main(String[] args) {
        int n = 0;

        System.out.println("Введите количество строк: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        String [] array = new String[n];
        StringBuilder [] counter = new StringBuilder[n];


        System.out.println("Введите строки");
        for (int i=0; i<n; i++){
            array[i] = input.next();
            counter[i]  = new StringBuilder();
        }

        for (int i=0; i<n; i++){
            for (int j=0; j < array[i].length(); j++){
                String charStr = String.valueOf(array[i].charAt(j));
                    if(counter[i].indexOf(charStr) == -1) {
                        counter[i].append(charStr);
                    }
            }
        }

        int max = 0;
        for(int i = 1; i < n; i++)
        {
              if( counter[max].length() < counter[i].length() ) max = i;

        }
        System.out.println("Cтрока с максимальным количеством различных символов:" + array[max]);
    }
}
