package org.launchcode.java.studios.restaurantmenu;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class CreateMenu {

    public static ArrayList<MenuItem> addItems(MenuItem...menuItems){
        ArrayList<MenuItem> myMenu= new ArrayList<MenuItem>();
        for (MenuItem menuItem : menuItems){
            myMenu.add(menuItem);
        }
        return myMenu;
    }

    public static void main(String[] args) {
        MenuItem mixedCheese = new MenuItem("Mixed Cheese", 7.00 , "It's a pizza, what else do you need?", "Pizza", false);
        MenuItem pepperoni = new MenuItem("Full Of pepperoni", 10.00 , "Mozarella, Pepperoni", "Pizza", false);
        MenuItem bbqChicken = new MenuItem("BBQ Chicken", 10.00 , "House BBQ, Mozarella, Caramelized Onion, Cilantro", "Pizza", true);

        MenuItem grilledChickenCaesar = new MenuItem("Grilled Chicken Caesar", 11.00 , "Romaine Lettuce, Parmesan Shavings, Grape Tomatoes, Caesar Dressing, Served with Croutons", "Salad", false);
        MenuItem haasAvocadoToast = new MenuItem("hass Avocado toast", 10.00 , "Toasted Sourdough, Avocado, Arugula/Lettuce Mix, hard Boiled Egg, Pickled Onion", "Pizza", false);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date= Calendar.getInstance().getTime();
        ArrayList<MenuItem> myItems= new ArrayList<MenuItem>();
        myItems = addItems(mixedCheese,pepperoni,bbqChicken,grilledChickenCaesar,haasAvocadoToast);

        Menu myMenu= new Menu(date, myItems);

    }

}
