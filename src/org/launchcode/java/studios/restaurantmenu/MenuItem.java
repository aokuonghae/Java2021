package org.launchcode.java.studios.restaurantmenu;

public class MenuItem {
    private  String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String desc, String category, boolean isNew) {
        this.name= name;
        this.price = price;
        this.description = desc;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setIsNew(boolean aNew) {
        isNew = aNew;
    }

}
