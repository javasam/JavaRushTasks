package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int i;
        int j;
        for (i = 0; i < a; i++){
            for ( j = 0; j < b; j++){
                System.out.print("8");
            }
            System.out.println("");
            j = 0;
        }//напишите тут ваш код

    }
}
