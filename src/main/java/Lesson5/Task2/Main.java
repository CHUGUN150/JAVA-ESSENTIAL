package Lesson5.Task2;

import Lesson5.Task1.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        for(int i=0;i<8;i++){
            zoo.zooList.add(i,new Zoo());
        }
        zoo.zooList.remove(7);
        zoo.zooList.remove(5);
        zoo.zooList.remove(3);
        System.out.println(zoo.zooList.size());
        System.out.println(zoo.zooList.toString());
    }
}
