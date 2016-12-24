package com.company;
import java.util.Scanner;
public class  Zadanie3 {

    public static void main(String[] args) {
        long n;

        System.out.println("Введите число: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n == 0) {
            System.out.println(n + " не являеться ни четным ни нечетным");
        }
        else if (n % 2 == 0) {
            System.out.println("Число " + n + " четное");
        }
        else{
            System.out.println("Число " + n + " нечетное");
        }

    }
}