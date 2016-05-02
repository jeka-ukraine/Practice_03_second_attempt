package com.test;

/**
 * Created by admin on 09.04.2016.
 */
public class Program {
    public static int MAX_DEALS = 1;
    public static int MAX_PRODUCTS =1;
    Deal[] deals = new Deal[MAX_DEALS];
    Product[] products = new Product[MAX_PRODUCTS];
    Party seller;
    Party buyer;

    public void actions(){
        input();
        output();
    }

    public void input() { //нужно ли тут возвращать Deal?
        for (int j = 0; j < MAX_DEALS; j++) {
            int currentDeal = j+1;
            System.out.println("Enter data for deal #" + currentDeal + " from " + MAX_DEALS + " deal(s): ");
            seller = inputParty("Seller");
            buyer = inputParty("Buyer");

            for (int i = 0; i < MAX_PRODUCTS; i++) {
                int currentProduct = i + 1;
                System.out.println("     Enter data of product #" + currentProduct + " from " + MAX_PRODUCTS + " product(s)" + ": ");


                Product product = inputProduct();
                products[i] = product;
            }

            Deal someDeal = new Deal(seller, buyer, products);
            deals[j] = someDeal;

        }
        //??? ?????? ??????
    }

    public void output(){
        for (int j=0; j<MAX_DEALS; j++){
            System.out.println("=======================================");
            System.out.println("");
            System.out.println("");
            /*System.out.println("Date of deal is: " + deals[j].getDate());
            System.out.println("Seller: " + deals[j].getSeller().getName());
            System.out.println("Buyer: " + deals[j].getBuyer().getName());
            for (int i=0; i<MAX_PRODUCTS; i++){
                System.out.println("Product name is: " + products[i].getTitle());
                System.out.println("Product price is: " + products[i].getPrice());
                System.out.println("Product quantity is: " + products[i].getQuantity());
                System.out.println("Product cost is: " + products[i].getCost());

            }*/
            System.out.println("Deal " + deals[j].getDate() + ":");
            System.out.println(deals[j].getSeller().getName() + " buys at " + deals[j].getBuyer().getName() + ":");
            for (int i=0; i<MAX_PRODUCTS; i++){
                System.out.println("     " + products[i].getTitle() + " " + products[i].getPrice()  + "$ x " + products[i].getQuantity() + " = " + (products[i].getPrice() * products[i].getQuantity()) + "$ ;");
            }

        }

    }

    public Party inputParty(String pty) {
        String Name = Keyboard.keyboardString(pty);
        Party party = new Party();
        party.setName(Name);
        return party;
    }

    private Product inputProduct() {
        String title = Keyboard.keyboardString("Product title");
        Double priceStr = Keyboard.keyboardDouble("Product price");
        int quantityStr = Keyboard.keyboardInteger("Quantity of products");
        Product pr = new Product();
        pr.setTitle(title);
        pr.setPrice(priceStr);
        pr.setQuantity(quantityStr);
        return pr;
    }

    ;
/*
    public String keyboard(String message) {
        System.out.print("     Please Enter " + message + ": ");
        Scanner scan = new Scanner(System.in);
        String rez = scan.next();
        return rez;
    }*/
    ////

    /*
    void output(){
        for (Deal d:deals) {
            System.out.println(d.getDate());
        }
        Deal 25-05-2016
        * <Buyer> buy at <Seller>:
        * <product1> <quantity>x<price>=sum
        * Sum
        *
        *
    }; */
}
