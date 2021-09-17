package org.launchcode.java.studios.restaurantmenu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date date, ArrayList<MenuItem> items) {
        this.lastUpdated = date;
        this.items = items;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public ArrayList<MenuItem> addItem(MenuItem item){
        this.items.add(item);
        Date date= Calendar.getInstance().getTime();
        this.setLastUpdated(date);
        return this.items;
    }

    public ArrayList<MenuItem> removeItem(MenuItem removeItem){
        int indexOfRemoved=-1;
        for (int i=0; i<this.items.size(); i++) {
            if (items.get(i).equals(removeItem)){
                indexOfRemoved=i;
            }
        }
        this.items.remove(indexOfRemoved);
        return this.items;
    }

    public String menuLastUpdated(){
        return ("The menu was last updated on" + this.lastUpdated);
    }

    public void printItem(MenuItem item){
        System.out.println(item.getDescription());
    }

    public void printMenu(){
        String menuBuild = "";
        for (MenuItem item : items){
//            System.out.println(item.getDescription());
            menuBuild+= "Name: "+item.getDescription()+ "\n" +
                        "Price: "+item.getPrice()+ "\n" +
                        "Category: "+item.getCategory()+ "\n"+
                         item.isItemNew()+"\n";

        }
        System.out.println(menuBuild);
    }

}
