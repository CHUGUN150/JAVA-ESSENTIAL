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

    public String print() {
        String str = String.format(
                "Car information" + " Year: %1$s, Speed : %2$s, Cost : %3$s,Color : %4$s , Coordinates : %3$s",
                year, speed, cost,color,coordinates);
        return str;
    }
}
