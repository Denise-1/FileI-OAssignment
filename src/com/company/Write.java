/*
Denise Chen
IS247-01
I/O files and Exceptions
write and create a text file and catch a file error
 */

package com.company;
import java.io.*;
import java.util.*;

public class Write {        // write to a text file
    public static void main(String[] args) {

        ArrayList<Toppings> topArray = new ArrayList<>(3);     // Toppings class arraylist
        // adds Toppings class objects to arraylist
            topArray.add(new Toppings(5001, "Boba", 100, 200, 3.99,
                    "sweet", true));
            topArray.add(new Toppings(5003, "Lychee Jelly",190,200, 3.00,
                    "sweet", true));
            topArray.add(new Toppings(5004, "Pudding",200,200, 2.00,
                    "sweet", true));

        try {
            PrintWriter array1 = new PrintWriter    // prints to file text
                    ("C:\\Users\\denis\\OneDrive\\Documents\\School\\File IO text\\WriteToppings.txt");
            array1.println(topArray.get(2));        // gets Toppings object in index 2 from arraylist
            array1.close();
        }
        catch (FileNotFoundException e){            // file error exception
//            e.printStackTrace();
            System.out.println("File not found");
        }
    }
}