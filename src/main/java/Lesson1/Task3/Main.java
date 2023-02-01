package Lesson1.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Computer[] computers = new Computer[5];
        for(int i =0;i< computers.length;i++){
            System.out.println("Enter RAM");
            int RAM = scan.nextInt();
            System.out.println("Enter VideoAdapter");
            String VideoAdapter = scan.next();
            computers [i] = new Computer(RAM,VideoAdapter);
        }
        for(Computer temp: computers){
            temp.Show();
        }
    }
}
