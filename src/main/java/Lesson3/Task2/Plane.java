package Lesson3.Task2;

class Plane extends Vehicle {
    int height;
    int passPlaces;
    int year;

    Plane(int height, int passPlaces, int year) {
        this.height = height;
        this.passPlaces = passPlaces;
        this.year = year;
    }

    public void print() {
        System.out.println("Plane height:" + height + " Plane passenger places:" + passPlaces + " Plane year:" + year);
    }
}
