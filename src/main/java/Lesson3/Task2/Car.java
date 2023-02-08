package Lesson3.Task2;

class Car extends Vehicle {
    String color;
    Car( int year, int speed, int cost,String coordinates,String color) {
        this.year = year;
        this.speed = speed;
        this.cost = cost;
        this.color = color;
        this.coordinates = coordinates;
    }

    public void print() {
        System.out.println(year+" "+speed+" "+cost+" "+coordinates+" "+color);
    }
}
