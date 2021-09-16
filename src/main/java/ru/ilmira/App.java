package ru.ilmira;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        System.out.println("Задание №2");

        System.out.println(checkNumber(new int[]{1, 4, 3, 5, 5, 7, 8, 4, 1}));
        System.out.println(checkNumber(new int[]{3, 5, 5, 7, 8}));
        System.out.println();

        System.out.println("Задание №1");

        System.out.println(Arrays.toString(containFour(new int[]{1, 4, 5, 8, 7, 6, 9})));
        System.out.println(Arrays.toString(containFour(new int[]{1, 2, 5, 8, 4, 6, 9})));
        System.out.println(Arrays.toString(containFour(new int[]{1, 4, 5, 8, 4, 6, 9})));
        System.out.println(Arrays.toString(containFour(new int[]{1, 5, 8, 7, 6, 9})));
    }

    public static int[] containFour(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 4)
                num = i;
        if (arr[num] != 4)
            throw new RuntimeException("Массив должен содержать хотя бы одну четверку!");

        return Arrays.copyOfRange(arr, num + 1, arr.length);
    }

    public static boolean checkNumber(int[] arr) {
        final int num1 = 1;
        final int num2 = 4;

        for (int number : arr) {
            if (number == num1 || number == num2) {
                return true;
            }
        }
        return false;
    }
}
