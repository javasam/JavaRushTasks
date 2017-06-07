package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int ee;
        ee = 0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());
        int d = Integer.parseInt(r.readLine());

        if (a > b)
                ee = a;
        else
                ee = b;
        if (ee < c)
                ee = c;
        if (ee < d)
                ee = d;
        System.out.println(ee);






    }
}