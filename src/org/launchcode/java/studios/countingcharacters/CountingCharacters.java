package org.launchcode.java.studios.countingcharacters;


import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String testStr= "If the product of two terms is zero then common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done " +
                "that, it’s pretty straightforward from there.";
        testStr = testStr.replaceAll("\\s", "");
        HashMap<Character, Integer> charCounts = new HashMap<>();

        charCounts= (countOccurences(charCounts,testStr,0));
        for (Map.Entry<Character, Integer> oneChar : charCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }

    }

    //Let's use Recursion!
    private static HashMap<Character, Integer> countOccurences(HashMap<Character, Integer> charCounts, String someString, int index) {
        char[] charInStr = someString.toCharArray();
        char currentChar;

        if (index >= someString.length()) {
            return charCounts;
        } else {
            currentChar = charInStr[index];
        }

        if (charCounts.containsKey(currentChar)) {
            charCounts.put(currentChar, charCounts.get(currentChar) + 1);
        } else {
            charCounts.put(currentChar, 1);
        }
        return countOccurences(charCounts, someString, index+1);
    }
}
