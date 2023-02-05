package Lesson3.Task2;

class Ship extends Vehicle {
    String port;
    int passPlaces;
    int year;

    Ship(String port, int passPlaces, int year) {
        this.port = port;
        this.passPlaces = passPlaces;
        this.year = year;
    }

    public void print() {
        System.out.println("Ship port:" + port + " Ship passenger places:" + passPlaces + " Ship year:" + year);
    }
}
