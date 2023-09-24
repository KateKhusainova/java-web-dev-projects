package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test out your Divide() function!
        int x;
        int y;

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the point value for this student: ");
        x = input.nextInt();
        System.out.println("Enter the total possible point value for an assignment: ");
        y = input.nextInt();
        input.close();
        Divide(x, y);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!

        for (Map.Entry<String, String> studentFile : studentFiles.entrySet()) {
            CheckFileExtension(studentFile.getValue());
            System.out.println("Student: " + studentFile.getKey() + " received " + CheckFileExtension(studentFile.getValue()) + " points.");
        }
    }


    public static void Divide(int x, int y)
    {
        // Write code here!

        if (y == 0) {
           try {
               throw new ArithmeticException("You can't divide by zero!");
           } catch (ArithmeticException e) {
               e.printStackTrace();
             }

        }
        double result = x/y;
        System.out.println(result);

    }

    public static int CheckFileExtension(String fileName) {
        // Write code here!
        int sum = 0;
        if(fileName.contains(".java")) {
            sum++;

        } else if (fileName.equals("") || fileName.equals(null)) {
            try {
                throw new FileEndException ("You need to submit a file!");
            } catch (FileEndException e) {
                e.printStackTrace();
            }
        } else {
            sum = 0;
        }
        return sum;

    }

}