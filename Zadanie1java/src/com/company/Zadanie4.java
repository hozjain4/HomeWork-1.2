package com.company;
//Работает и на 3х значное число
import java.util.Scanner;

public class Zadanie4 {


    public static void main(String[] args) {


        System.out.println("Введите число: ");

        Scanner scanner = new Scanner(System.in);
        int result = 0;
        for (char character : Integer.toString(scanner.nextInt()).toCharArray()) {
            result += Integer.valueOf(Character.toString(character));
        }
        System.out.println(result);
    }
}