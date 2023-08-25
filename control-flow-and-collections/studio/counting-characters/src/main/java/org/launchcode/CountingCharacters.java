package org.launchcode;
import java.util.HashMap;
//import java.util.Map;
public class CountingCharacters {
    public static void main(String[] args) {
       String myString = "If the product of two terms is zero then common sense says at least one of the " +
               "two terms has to be zero to start with. So if you move all the terms over to one side, " +
               "you can put the quadratics into a form that can be factored allowing that side of " +
               "the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

// HASH MAP
       HashMap<Character, Integer> charCount = new HashMap<>();
           for(int i=myString.length()-1; i>=0; i--) {
           if(charCount.containsKey(myString.charAt(i))) {
               int count = charCount.get(myString.charAt(i));
               charCount.put(myString.charAt(i), ++count);
           }
           else {
               charCount.put(myString.charAt(i), 1);
           }
       }
           System.out.println(charCount);

//HASH MAP 2
      // char[] charactersInString = myString.toCharArray();
      // HashMap<Character, Integer> countForCharacter = new HashMap<>();
      // int sum = 0;
      // for (char character : charactersInString) {
        //   System.out.println(character);
        //for (int i=0; i<countForCharacter.length; i++) {
       //     if (charactersInString.containsKey(character))
        //}
           //countForCharacter.put();
      // }



    }
}

