package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side1:");
        double side1 = scan.nextDouble();
        System.out.println("Enter side2:");
        double side2 = scan.nextDouble();
        Rectangle rectangle = new Rectangle(side1,side2);
        System.out.println(rectangle.areaCalculator(side1,side2));
        System.out.println(rectangle.perimeterCalculator(side1,side2));
    }

}
