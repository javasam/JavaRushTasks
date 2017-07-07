package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;


public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> set = new HashSet<>();
        String[] words = {"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};

        for (String a : words) {
            set.add(a);
        }
        for (String s : set) {
            System.out.println(s);
        }


    }
}
