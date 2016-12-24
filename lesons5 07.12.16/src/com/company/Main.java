package com.company;

import  java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {

    }
    private static int[][] someDo(int[] array) {
        int[][] result = new int[array.length][2];
        Arrays.sort(array);
        for (int i = 1, j = 0, animal = array[0], counter = 1; i < array.length; i++) {
            if (animal != array[i]) {
                result[j][0] = animal;
                result[j][1] = procent(counter, array.length);
                j++;
                animal = array[i];
                counter = 1;
            } else {
                counter++;
            }
        }
        return result;
    }