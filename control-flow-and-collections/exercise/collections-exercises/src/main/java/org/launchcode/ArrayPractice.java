package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] firstArray = {1, 1, 2, 3, 5, 8};
        for(int i : firstArray) {
            if(i % 2==0) {
                System.out.println(i);
            }
        }

        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        //Split - words
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        //Split - sentences
        String[] sentences = str.split("\\.");
        System.out.println(Arrays.toString(sentences));


    }
}
