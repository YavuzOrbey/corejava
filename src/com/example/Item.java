package com.example;

public class Item{
    //most of this class is a standard POJO
    private String itemName, itemDesc;
    private Double itemPrice;
    private Integer quantity, availableQuantity;

    public Item() {
        this.quantity = 1;
    }

    public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuantity) {
        /* I was originally just going to use the setters to set the instance variables (i.e. setItemName(itemName)
        but I read on StackOverflow that best practice would have that the instance is fully formed before using
        setters */
        this();
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemPrice = itemPrice;
        this.availableQuantity = availableQuantity;
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemDesc='" + itemDesc + '\'' +
                ", itemPrice=" + itemPrice +
                ", quantity=" + quantity +
                ", availableQuantity=" + availableQuantity +
                '}';
    }
}
