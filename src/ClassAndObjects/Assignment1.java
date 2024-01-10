package ClassAndObjects;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length and breadth of a rectangle");
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        Rectangle rectangle = new Rectangle();
        rectangle.setDimension(length, breadth);
        System.out.println("area of rectangle " + rectangle.getArea());
    }
}

class Rectangle {
    int length;
    int breadth;
    void setDimension(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    int getArea() {
        return length * breadth;
    }
}