package Lesson3.Task2;

public class Main {
    public static void main(String[] args) {
        Plane vehicle1 = new Plane(5000,50,2003,50000,400,"W34.4635");
        Ship vehicle2 = new Ship("Los Angeles",100,1997,4500,130,"N55.6343");
        Car vehicle3 = new Car(4,2007,160,"S23.5436","Red");
        vehicle1.print();
        vehicle2.print();
        vehicle3.print();
    }
}
