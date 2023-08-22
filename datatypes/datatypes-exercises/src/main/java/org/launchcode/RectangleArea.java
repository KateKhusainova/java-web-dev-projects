package org.launchcode;
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length;
        int width;
        int area;

        System.out.println("What is the length of the rectangle:");
        length = input.nextInt();
        System.out.println("What is the width of the rectangle:");
        width = input.nextInt();
        input.close();
        area = length*width;

        System.out.println("The area of the rectangle is: " + area);
    }
}
