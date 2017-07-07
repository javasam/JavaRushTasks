package com.javarush.task.task07.task0708;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by bobrovitskiy_a on 01.07.2017.
 */
class GoodDog {

    private int size;
    public int getSize(){
        return size;
    }
    public void setSize(int s){
        size = s;
    }
void bark(){

        if (size > 60){
            System.out.println("Gav Gav!");
        } else if (size > 14){
            System.out.println("Wow Wow!");
        } else {
            System.out.println("Taf Taf!");
        }
    }

}

public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(55);
        GoodDog two = new GoodDog();
        two.setSize(80);
        System.out.println("Певая собака: " + one.getSize());
        one.bark();
        System.out.println("Вторая собака: " + two.getSize());
        two.bark();
    }
}
