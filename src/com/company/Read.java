/*
Denise Chen
IS247-01
I/O files and Exceptions
make text file in computer files, read it, add into arraylist, and print it out
 */
package com.company;

import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Read {     //read a text file
    public static void main(String[] args){

        ArrayList < Tea > teaArray = new ArrayList <> (); //Tea class arraylist

        int id; // 7 attributes from Tea class
        String type;
        int countItem;
        int supplyLevel;
        double price;
        String caffeinated;
        String leaves;

        try {
            File textFile = new File("C:\\Users\\denis\\OneDrive\\Docu*ments\\School\\File IO text\\ReadTea.txt");
            Scanner read = new Scanner(textFile);

            while (read.hasNext()) { //reads each attribute of Tea class in every line from text file
                id = read.nextInt();
                type = read.next();
                countItem = read.nextInt();
                supplyLevel = read.nextInt();
                price = read.nextDouble();
                caffeinated = read.next();
                leaves = read.next();
                teaArray.add(new Tea(id, type, countItem, supplyLevel, price, caffeinated, leaves)); // adds each attribute into the array
            }
            read.close();
        }
        catch (FileNotFoundException e){            // file error exception
            System.out.println("File not found");
        }
        System.out.println(teaArray.toString().replace("[", "").replace("]", ""));
    }
}