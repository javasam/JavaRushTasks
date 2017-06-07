package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int c = 0, i = 0;
        while (i != -1) {
            String s = in.readLine();
            i = Integer.parseInt(s);
            c = c + i;
        }
        System.out.println(c);//напишите тут ваш код
    }
}
