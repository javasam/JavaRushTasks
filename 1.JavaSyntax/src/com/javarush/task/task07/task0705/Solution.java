package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        int[] num1 = new int[10];
        int[] num2 = new int[10];

        for (int i = 0; i < list.length; i++)
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < list.length / 2; i++)
        {
            num1[i] = list[i];
            num2[i] = list[i + 10];
            System.out.println(num2[i]);
        }
    }
}
