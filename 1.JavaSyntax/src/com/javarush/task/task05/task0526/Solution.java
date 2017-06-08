package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Oleg", 23, "Luna");
        Man man1 = new Man("Senya", 15, "Earth");
        Woman woman = new Woman("Latya", 35, "QWER");
        Woman woman1 = new Woman("Kristina", 23, "Luna");
        System.out.println(man);
        System.out.println(man1);
        System.out.println(woman);
        System.out.println(woman1);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String toString() {
            return (name + " " + age + " " + address);
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String toString() {
            return (name + " " + age + " " + address);
        }
    }
}
