package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

//You can totally have classes within this main file. Or make a seperate class e.g Circle
class Check {
    //creating a function to test strings
    public static boolean isNumeric(String string) {
        int intValue;

        if(string == null || string.isEmpty()) {
            return false;
        }

        /*This is a try catch block. Try to conver string to an integer and
        if it works, return true thus ending the function.
        Else, it will catch the error and print out.
         */
        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }
}

public class Area {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        //save the input as a string
        String value = in.nextLine();
        //check the string
        if (Check.isNumeric(value)) {
            //now the string is converted to a Double
            double radius = Double.parseDouble(value);
            while (radius < 0) {
                System.out.println("I only work in normal space. Provide a positive radius.");
                radius = in.nextDouble();
            }
            //Note that once you are in the while loop, the user could throw in a string and it wouldn't
            //catch it. If you've got the time, you can challenge yourself to try to counter that.
            Double areaOfCircle = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);
        } else {
            System.out.println("I asked for a number. Bye!");
        }
    }

}
