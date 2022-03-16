package com.max.idea;

import java.util.Scanner;

public class Operator3 {
    public static void main(String[] args) {
        System.out.println("Выберите величину: 1 - масса, 2 - расстояние");
        Scanner input = new Scanner(System.in);
        char vel =  input.next().charAt(0);

        char izmeren;
        double chislo;
        switch (vel) {
            case '1':
                System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - тонна");
                izmeren = input.next().charAt(0);
                System.out.println("Введите число");
                chislo = input.nextInt();

                switch (izmeren) {
                    case '1':
                        System.out.println("Результат: \n Граммы: " + chislo + "\n Килограммы: " + chislo / 1000 + "\n Тонна: " + chislo / 1000000);
                        break;
                    case '2':
                        System.out.println("Результат: \n Граммы: " + chislo * 1000 + "\n Килограммы: " + chislo + "\n Тонна: " + chislo / 1000);
                        break;
                    case '3':
                        System.out.println("Результат: \n Граммы: " + chislo * 1000000 + "\n Килограммы: " + chislo * 1000 + "\n Тонна: " + chislo);
                        break;
                    default:
                        System.out.println("Неизвестное число");
                        break;
                }

                break;
            case '2':
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                izmeren = input.next().charAt(0);
                System.out.println("Введите число");
                chislo = input.nextInt();

                switch (izmeren) {
                    case '1':
                        System.out.println("Результат: \n Метры: " + chislo + "\n Мили: " + chislo / 1609.344 + "\n Ярды: " + chislo / 1.094 + "\n Футы: " + chislo / 3.281);
                        break;
                    case '2':
                        System.out.println("Результат: \n Метры: " + chislo * 1609.344 + "\n Мили: " + chislo + "\n Ярды: " + chislo / 1760 + "\n Футы: " + chislo / 5289);
                        break;
                    case '3':
                        System.out.println("Результат: \n Метры: " + chislo * 1.094 + "\n Мили: " + chislo * 1760 + "\n Ярды: " + chislo + "\n Футы: " + chislo * 3);
                        break;
                    case '4':
                        System.out.println("Результат: \n Метры: " + chislo * 3.281 + "\n Мили: " + chislo * 5289 + "\n Ярды: " + chislo / 3 + "\n Футы: " + chislo);
                        break;
                    default:
                        System.out.println("Неизвестное число");
                        break;
                }
                break;

            default:
                System.out.println("Неизвестное число");
                break;
        }
    }
}
