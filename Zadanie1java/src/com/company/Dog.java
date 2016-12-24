package com.company;

public class Dog {

    private static String says1 = ("Ruff!");
    private static String says2 = ("Wurf!");
    private static String name1 = ("Spot");
    private static String name2 =("Scruffy");


    public static void main(String[]args){
        String result1 = name1 + says1;
        String result2 = name2 + says2;
        System.out.println(name1+" "+says1);
        System.out.println(name2+" "+says2);
    }
}