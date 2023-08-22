package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gas;
        double milesPerGallon;

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        miles = input.nextDouble();
        System.out.println("How many gallons of gas have you consumed?");
        gas = input.nextDouble();
        milesPerGallon = miles/gas;
        System.out.println("There are " + milesPerGallon + " miles per gallon of gas");
    }
}
