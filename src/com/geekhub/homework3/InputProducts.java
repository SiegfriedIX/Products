package com.geekhub.homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InputProducts {
    static final List<String> name = new ArrayList<>();
    static final List<Integer> quantity = new ArrayList<>();
    static final List<Double> price = new ArrayList<>();

    public static void main(String[] args) {
            inputCommand();
    }
    private static void inputCommand() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 'p' for addition new item of product or 'd' for deleting existing item.");
        String command = s.nextLine();
        if (command.equals("p")) {
            inputName();
        }
        if(command.equals("d")) {
            Inventory.deleteData();
        }
    }
    private static void inputName() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of product, 'Cheese', 'Rom' or 'Whiskey'");
        String name1 = s.nextLine();
        switch (name1) {
            case "Cheese":
                name.add(name1);
                inputQuantity();
                break;
        }
        switch (name1) {
            case "Rom":
                name.add(name1);
                inputQuantity();
                break;
        }
        switch (name1) {
            case "Whiskey":
                name.add(name1);
                inputQuantity();
                break;
            default:
                System.out.println("Wrong name, enter correct one!");
                inputCommand();
                break;
        }
    }
    private static void inputQuantity() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the quantity of these product");
        int quantity1 = s1.nextInt();
        if (quantity1 > 0) {
            quantity.add(quantity1);
            inputPrice();
        } else {
            inputParamAlert();
            inputQuantity();
        }
    }
    private static void inputPrice(){
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the price");
        double price1 = s2.nextDouble();
        if (price1 > 0){
        price.add(price1);}
        else{
            inputParamAlert();
            inputPrice();
        }
        Product products = new Product();
        products.showProducts();
        Inventory.sumOfPrices();
        inputCommand();
    }
    private static void inputParamAlert(){
        System.out.println("Enter correct parameters!");
    }
    }

