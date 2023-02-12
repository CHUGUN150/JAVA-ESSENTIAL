package Lesson3.Task2;

class Plane extends Vehicle {
int passPlaces;
int height;

    Plane(int height, int passPlaces, int year,int cost,int speed,String coordinates) {
        this.height = height;
         this.passPlaces = passPlaces;
        this.year = year;
        this.cost = cost;
        this.speed = speed;
        this.coordinates = coordinates;
    }

    public String print() {
        String str = String.format(
                "Plane information" + " Height: %1$s, PassPlaces : %2$s, Year : %3$s,Cost : %4$s ,Speed : %5$s, Coordinates : %6$s",
                height, passPlaces, year,cost,speed,coordinates);
        return str;
    }
}
