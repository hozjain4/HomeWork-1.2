package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Zadanie6 {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите катит а: ");
        double a = scanner1.nextDouble();
        System.out.print("Введите катит b: ");
        double b = scanner1.nextDouble();
        double c = Math.sqrt (a* a + b* b);
        System.out.println ("c = "+ c);
        double S = Math.sqrt (0.5* a* b);
        System.out.println ("S = "+ S);
        double P = Math.sqrt (a + b + c);
        System.out.print("P = " + P);
    }
}
