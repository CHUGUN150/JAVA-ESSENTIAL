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

    public void print() {
        System.out.println(height+" "+passPlaces+" "+year+" "+cost+" "+speed+" "+coordinates);
    }
}
