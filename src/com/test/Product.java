package com.test;

/**
 * Created by yprokopenko on 05-Apr-16.
 */
public class Product {
    private String title;
    private Double price;
    private int quantity;

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getCost(){
        return quantity * price;
    }

    //getCost():double???

}
