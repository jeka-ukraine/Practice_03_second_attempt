package com.test;

import java.util.Date;

/**
 * Created by yprokopenko on 05-Apr-16.
 */
public class Deal {
    private Date date;
    private Party seller;
    private Party buyer;
    private Product[] products;




    public Deal (Party seller, Party buyer, Product[] pr){
        date = new Date();
        this.seller = seller;
        this.buyer = buyer;
        this.products = pr;
    }





    public Date getDate(){return date;}
    public Party getSeller(){return seller;}
    public Party getBuyer(){return buyer;}
    public Product[] products(){return products;}

    public double getSum(){
        double rez = 0;
        for (Product pr : products){
            rez +=pr.getCost();
            }
        return rez;

    }



}
