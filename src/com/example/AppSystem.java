package com.example;

import java.util.Arrays;

public class AppSystem extends TheSystem {
    AppSystem() {
    }

    @Override
    public void display() {

        System.out.println("AppSystem Inventory:");
        System.out.printf("%1$-20s %2$-20s %3$-10s %4$-10s\n", "Name", "Description", "Price", "Available Quantity");

        getItemCollection().forEach( (itemName, item)-> {
            System.out.printf("%1$-20s %2$-20s %3$-10.2f %4$-10d\n",
                    item.getItemName(), item.getItemDesc(), item.getItemPrice(), item.getAvailableQuantity());
        });
    }

    @Override      // this overwrites the parents class add method
    public Boolean add(Item item) {
        if(item ==null)
            return false;
        if(getItemCollection().containsValue(item)){
            System.out.printf("%s is already in the App System", item.getItemName());
            return false;
        }else{
            getItemCollection().put(item.getItemName(), item);
            return true;
        }
    }

    public Item reduceAvailableQuantity(String item_name) {
        /*
        One thing the description didn't call for is removing the item from the app in case the available quantity goes to 0. However
        the unit test asked for this
        */
        if(getItemCollection().containsKey(item_name)){
            Item theItem = getItemCollection().get(item_name);
            theItem.setAvailableQuantity(theItem.getAvailableQuantity()-1);
            if(theItem.getAvailableQuantity() > 0)
                return theItem;
            else{
                remove(item_name);
            }
        }
        return null;
    }
}
