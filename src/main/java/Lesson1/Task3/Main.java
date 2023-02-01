package Lesson1.Task3;

public class Main {
    public static void main(String[] args) {
        Computers computers = new Computers();
        for(int i =0;i<computers.computers.length;i++){
            computers.computers[i]=new Computer();
        }
    }
}
