package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        Integer[] array = new Integer[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        Arrays.sort(array, Collections.reverseOrder());
        for (int i = 0; i < 3; i++) System.out.print(array[i] + " ");//напишите тут ваш код
    }
}
