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

    public String print() {
        String str = String.format(
                "Ship information" + " Port: %1$s, PassPlaces : %2$s, Year : %3$s, Cost : %4$s , Speed : %5$s , Coordinates : %6$s",
                port, passPlaces,year, cost,speed,coordinates);
        return str;
    }
}
