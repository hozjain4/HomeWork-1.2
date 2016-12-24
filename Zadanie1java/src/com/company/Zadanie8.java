/*Создать класс, который будет хранить в одной целочисленной переменной несколько

        значений меньшей длины. Например, возраст, вес, рост и год рождения. Добавить методы

        получения и добавления параметров отдельно.*/
package com.company;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш день рождения: ");
        int a = scanner.nextInt();
        System.out.print("Введите ваш месяц рождения: ");
        int b = scanner.nextInt();
        System.out.print("Введите ваш год рождения: ");
        int c = scanner.nextInt();
        System.out.println(a + "." + b + "." + c);

    }
}
