package Lesson5.Task1;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        for(int i=0;i<8;i++){
            zoo.zooList.add(i,new Zoo());
        }
        System.out.println(zoo.zooList.toString());
    }
}
