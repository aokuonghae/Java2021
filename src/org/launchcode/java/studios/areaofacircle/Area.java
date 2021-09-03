package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

class Check {
    public static boolean isNumeric(String string) {
        int intValue;

        if(string == null || string.isEmpty()) {
            return false;
        }

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
        String value = in.nextLine();
        if (Check.isNumeric(value)) {
            double radius = Double.parseDouble(value);
            while (radius < 0) {
                System.out.println("I only work in normal space. Provide a positive radius.");
                radius = in.nextDouble();
            }
            //Note that once you are in the while loop, the user could throw in a string and it wouldn't
            //catch it. If you've got the time, you can challenge yourself to try to catch that.
            Double areaOfCircle = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);
        } else {
            System.out.println("I asked for a number. Bye!");
        }
    }

}
