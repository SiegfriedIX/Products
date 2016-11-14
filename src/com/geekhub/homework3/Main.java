package com.geekhub.homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    static final List<String> type = new ArrayList<>();
    static final List<String> name = new ArrayList<>();
    static final List<Integer> quantity = new ArrayList<>();
    static final List<Double> price = new ArrayList<>();

    public static void main(String[] args) {
            inputCommand();
    }
    static void inputCommand() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 'p' for addition new item of product or 'd' for deleting existing item.");
        String command = s.nextLine();
        if (command.equals("p")) {
            inputName();
        }
        if(command.equals("d")) {
            Inventory.deleteData();
        }
        else{
            inputCommand();
        }
    }
    private static void inputName() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the type of product, 'Cheese', 'Rom' or 'Whiskey':");
        String type1 = s.nextLine();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the name of product:");
        String name1 = s1.nextLine();
        Pattern p = Pattern.compile("Cheese \\D*||Rom \\D*||Whiskey \\D*");
        Matcher m = p.matcher(type1+" "+name1);
        if (m.matches()){
            type.add(type1);
            name.add(name1);
            System.out.println(type+""+name);
            inputQuantity();
        }
        else{
            System.out.println("Wrong name!");
            inputCommand();
        }
    }
    private static void inputQuantity() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the quantity of this product");
        int quantity1 = s1.nextInt();
        quantity.add(quantity1);
        inputPrice();
    }
    private static void inputPrice(){
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the price");
        double price1 = s2.nextDouble();
        price.add(price1);
        Product products = new Product();
        products.showProducts();
        Inventory.sumOfPrices();
        inputCommand();
    }
    }

