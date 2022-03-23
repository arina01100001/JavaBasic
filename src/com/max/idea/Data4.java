package com.max.idea;

import java.util.Random;

public class Data4 {
    public static void main(String[] args) {
        int n = 15;
        int max = -20;
        int min = 20;
        int[] array = new int[n];

        for (int i=0; i<n; i++){
            array[i] = ((int)(Math.random() * 41) - 15);
            System.out.println(array[i]);

          if (min > array[i]) {
              min = array[i];
          }
          if (max < array[i]){
              max = array[i];
          }
        }
        System.out.println("Максимальное значение:" + max + "\nМинимальное значение: " + min);

        if ((Math.abs(max)) > (Math.abs(min))){
            System.out.println("Наибольшее число по модулю: " + max );
        } else
            System.out.println("Наибольшее значение по модулю: " + min);
    }
}
