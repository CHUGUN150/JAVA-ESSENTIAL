package Lesson3.Task2;

class Ship extends Vehicle {
String port;
int passPlaces;
    Ship(String port, int passPlaces, int year,int cost,int speed,String coordinates) {
        this.port = port;
        this.passPlaces = passPlaces;
        this.year = year;
        this.cost = cost;
        this.speed = speed;
        this.coordinates = coordinates;
    }

    public void print() {
        System.out.println(port+" "+passPlaces+" "+year+" "+cost+" "+speed+" "+coordinates);
    }
}
