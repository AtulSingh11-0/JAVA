package overloadingExamples;

import java.util.Scanner;

public class Area {
  double PI = 3.14159265359;
  public int area(int side){
    return side * side;
  }
  public int area(int length, int breadth) {
    return length * breadth;
  }
  public double area(double radius) {
    return PI * radius * radius;
  }
}

class Formula {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("1. Calculate Area of Square");
    System.out.println("2. Calculate Area of Rectangle");
    System.out.println("3. Calculate Area of Circle");
    System.out.print("Enter your option >> ");
    int option = sc.nextInt();

    switch (option){
      case 1:
        System.out.print("\nInput side of the Square > ");
        int side = sc.nextInt();
        Area square = new Area();
        System.out.println("Area of Square is >> " + square.area(side));
        break;
      case 2:
        System.out.print("\nInput length of the Rectangle > ");
        int length = sc.nextInt();
        System.out.print("Input breadth of the Rectangle > ");
        int breadth = sc.nextInt();
        Area rectangle = new Area();
        System.out.println("Area of Rectangle is >> " + rectangle.area(length, breadth));
        break;
      case 3:
        System.out.print("\nInput radius of the Circle > ");
        double radius = sc.nextInt();
        Area circle = new Area();
        System.out.println("Area of Circle is >> " + circle.area(radius));
        break;
      default:
        System.out.println("Invalid Choice");
    }
  }
}