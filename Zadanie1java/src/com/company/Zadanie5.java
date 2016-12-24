package com.company;
//При вводе дробного числа выдает ошибку.

import java.util.Scanner;

public class Zadanie5 {



    public static void main(String[] args) {
            Scanner sc1 = new Scanner(System.in); // создаём объект класса Scanner
            double i = 0;
            int a = 10;
            System.out.print("Введите первое число: ");
            if(sc1.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
                i = sc1.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            } else {
                System.out.println("Вы ввели не целое число");
            }
        Scanner sc2 = new Scanner(System.in);
             double q = 0;
        System.out.print("Введите второе число: ");
        if(sc2.hasNextInt()) {
            q = sc2.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
        }
        double b=Math.abs(a-i);
        double c=Math.abs(a-q);
        if (b==c){
            System.out.println("Числа "+i +" и "+q + " равноудалены от "+a);
        }
        if(b>c){
            System.out.println("Число "+q+" ближе к "+a);
        }
        if (b<c) {
            System.out.println("Число "+i+" ближе к "+a);
        }
    }

}
