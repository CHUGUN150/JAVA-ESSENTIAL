package Lesson1.Task1;

public class Rectangle {
        double side1;
        double side2;
        Rectangle(double side1,double side2){
            this.side1 = side1; this.side2=side2;
        }

        public double areaCalculator(double side1,double side2){
            return side1*side2;
        }
        public double perimeterCalculator(double side1,double side2){
            return 2*(side1+side2);
        }
}
