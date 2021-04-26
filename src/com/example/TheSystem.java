package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {
    // Because I'm storing items based on their name that name is a key while the item itself is the value
    private HashMap<String, Item> itemCollection;

    TheSystem() {
        itemCollection = new HashMap<>();
        if(getClass().getSimpleName().equals("AppSystem")){

            try{
                /*This was tough because I was first using the location as just sample.txt then as resources/sample.txt then as Solution/resources/sample.txt
                but this is the only way it works you have to get the current path of the Solution folder then concat the other directory/file.
                */
                String location = "sample.txt";
                File file = new File(location);
                Scanner scan = new Scanner(file);
                String line;
                while(scan.hasNextLine()){
                    line = scan.nextLine();

                    /* So the directions say to use line.split("\s") but just one \ is an escape character so you need \\s.
                    Because it says double spaced you need to add two of them back to back

                    I also don't necessarily like adding strings and hoping they'll be there in the file. For instance what if the file was mismanaged
                    and the items were not necessarily in name, description, price, quantity order or if something was missing? Then you could get
                    an ArrayOutofBoundsException or something like that. I'm cat
                    */
                    String[] itemInfo = line.split("\\s\\s");
                    itemCollection.put(itemInfo[0], new Item(itemInfo[0], itemInfo[1], Double.parseDouble(itemInfo[2]), Integer.parseInt(itemInfo[3])));
                }
            }
            catch(FileNotFoundException e ){
                System.out.println(e);
            }
            catch(Exception e){
                System.out.println("Something went wrong");
                e.printStackTrace();
            }
        }
    }

    public HashMap<String, Item> getItemCollection(){
        return itemCollection;
    }

    public Boolean checkAvailability(Item item) {

        /*So if you go by the original description for what was required in this method you either return true or false depending on if
        the items quantity is greater than the quantity available and it actually does pass all unit tests without handling the exception
        however the hashmap get method will return null if the item is not in the hashmap.

        That null gets passed into this method and you'll get a NullPointerException if you try to run a method on it. I tried this on my
        local machine and anytime you try to add an item to your cart that isn't an item in the AppSystem it will throw the exception.

        TLDR: Handling this exception makes sense or using if(item==null) like the other methods
        */
        try{
            if (item.getQuantity() >= item.getAvailableQuantity()) {
                System.out.format("System is unable to add %s to the card. System only has %d %ss",
                        item.getItemName(), item.getAvailableQuantity(), item.getItemName());
                return false;
            }
            else{
                return true;
            }
        }catch(NullPointerException e){
            System.out.println("Invalid Item");
            return false;
        }
    }

    public Boolean add(Item item) {
        System.out.println(itemCollection.containsKey(item.getItemName()));
        if(item==null)
            return false;
        else if(itemCollection.containsKey(item.getItemName()) && checkAvailability(item)){
            System.out.println(itemCollection.get(item.getItemName()));

            item.setQuantity(item.getQuantity()+1);

            System.out.println(itemCollection.get(item.getItemName()));
            return true;
        }
        else if(!itemCollection.containsValue(item)){ //you should also be able to check this using !itemCollection.containsKey(item.getItemName()) because maps have to have unique keys
            itemCollection.put(item.getItemName(), item);
            return true;
        }
        return false;
    }

    public Item remove(String itemName) {
        if (itemCollection.containsKey(itemName))
            return itemCollection.remove(itemName); //shorthand way since the remove method returns the removed item anyway

        return null;
    }

    public abstract void display();
}
