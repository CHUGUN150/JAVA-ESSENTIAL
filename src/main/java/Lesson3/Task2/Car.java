package Lesson3.Task2;

class Car extends Vehicle {
    int passPlaces;
    int year;
    int speed;
    int cost;

    Car(int passPlaces, int year, int speed, int cost) {
        this.passPlaces = passPlaces;
        this.year = year;
        this.speed = speed;
        this.cost = cost;
    }

    public void print() {
        System.out.println("Car passenger places:" + passPlaces + " Car year:" + year + " Car speed" + speed + " Car cost:" + cost);
    }
}
