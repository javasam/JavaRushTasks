package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        double c = 0;
        while (true) {
            int b = Integer.parseInt(reader.readLine());
            if (b == -1)break;
            i++;
            c = c + b;

        }
        System.out.println(c/i);
        }
}

