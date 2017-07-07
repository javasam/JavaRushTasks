package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList <String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String s = br.readLine();
            list.add(s);
        }
        for (int i = 1; i < list.size(); i++){
            String s1 = list.get(i);
            String s2 = list.get(i - 1);
                if (s1.length() < s2.length()) {
                    System.out.println(i);
                    break;
                } //else System.out.println(s1);

        }

    }
}

