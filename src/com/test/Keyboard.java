package com.test;

import java.util.Scanner;

/**
 * Created by admin on 01.05.2016.
 */
public class Keyboard {
    public static String keyboardString(String message) {
        System.out.print("     Please Enter " + message + ": ");
        Scanner scan = new Scanner(System.in);
        String rez = scan.next();
        return rez;
    }

    public static Double keyboardDouble(String message) {
        System.out.print("     Please Enter " + message + ": ");
        Scanner scan = new Scanner(System.in);
        String keyboardRez = scan.next();
        Double rez = null;
        try {
            rez = Double.parseDouble(keyboardRez);
        }
        catch (NumberFormatException e) {
            System.out.println("Type of entered value is not a Double. Please enter Double (5 or 5,12)");keyboardDouble( message);}
        return rez;
    }

    public static int keyboardInteger(String message) {
        System.out.print("     Please Enter " + message + ": ");
        Scanner scan = new Scanner(System.in);
        String keyboardRez = scan.next();
        Integer rezInt = 0;
        try {
            rezInt = Integer.parseInt(keyboardRez);
        }
        catch (NumberFormatException e) {
            System.out.println("Type of entered value is not an Integer. Please enter Integer (5, 6, 7)");keyboardInteger( message);}
        return rezInt;

    }

}
