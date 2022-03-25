package com.max.idea;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Itog1 {
    public static void main(String[] args) {
        double course = 0;
        double rub = 0;
        double doll = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите текущий курс валют: ");
        course = input.nextDouble();

        System.out.println("Введите количество рублей, необходимых перевести в доллары: ");
        rub = input.nextDouble();

        doll = rub/course;
        DecimalFormat decFormat = new DecimalFormat("#.##");
        String itog = decFormat.format(doll);

        System.out.println("Итого:" + itog);
    }
}
