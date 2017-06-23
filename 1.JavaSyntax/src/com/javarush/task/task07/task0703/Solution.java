package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];

        for (int i = 0; i < 10; i++)
        {
            list[i] = reader.readLine();
        }

        int[] numbers = new int[10];

        for (int j = 0; j < 10; j++)
        {
            numbers[j] = list[j].length();
            System.out.println(numbers[j]);
        }
    }
}
