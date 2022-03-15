package com.max.idea;

public class Array {
    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5};
        int a = myArray[myArray.length-1];
        int b = myArray[0];
        myArray[0] = a;
        myArray[4] = b;
        int avr =  myArray.length/2;
        System.out.println("Сумма первого и среднего элементов: " + (myArray[0] + avr));
    }
}
