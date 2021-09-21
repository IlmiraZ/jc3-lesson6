package ru.ilmira;

import java.util.Arrays;

public class App {
    public static void main(String[] args) { }

    public int[] containFour(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 4)
                num = i;
        if (arr[num] != 4)
            throw new RuntimeException("Массив должен содержать хотя бы одну четверку!");

        return Arrays.copyOfRange(arr, num + 1, arr.length);
    }

    public boolean checkNumber(int[] arr) {
         int num1 = 1;
         int num2 = 4;

        for (int number : arr) {
            if (number == num1 || number == num2) {
                return true;
            }
        }
        return false;
    }
}
