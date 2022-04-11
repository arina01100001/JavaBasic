package com.max.idea;

import java.util.Locale;
import java.util.Scanner;

public class Itog4 {
    public static void main(String[] args) {
        System.out.println("Отгадай загадку: \nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает \n\nУ тебя есть три попытки, при первой попытке ты можешь использовать подсказку\nЧтобы использовать подсказку, напиши Подсказка");

        String rightAnswer = "заархивированный вирус";
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        switch (answer.toLowerCase(Locale.ROOT)){
            case ("заархивированный вирус"):
              System.out.println("Правильно!");
               break;
            case ("подсказка"):{
                System.out.println("WinRar");
                String answer2 = input.nextLine();
                if (rightAnswer.equals(answer.toLowerCase(Locale.ROOT))){
                    System.out.println("Правильно!");
                } else System.out.println("Обидно, приходи в другой раз");
                }
                return;
            default:

                for(int i=1; i<=2; i++){

                System.out.println("Подумай еще");
                    String answer2 = input.nextLine();
                    switch (answer2.toLowerCase(Locale.ROOT)) {
                        case ("заархивированный вирус"):
                            System.out.println("Правильно!");
                            break;
                        case ("подсказка"):
                            System.out.println("Ты больше не можешь использовать подсказку");
                            break;
                        default:
                           if (i==2){
                               System.out.println("Обидно, приходи в другой раз");
                           } else break;
                    }
                 }
        }
    }
}

