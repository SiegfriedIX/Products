package com.geekhub.homework3;

import java.util.Scanner;

import static com.geekhub.homework3.Product.comPrice1;

class Inventory extends Main {

    static void sumOfPrices() {
        System.out.println("Sum of prices: "+ Math.round(comPrice1));
        }
    static void deleteData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the item for deleting");
        String name1 = s.nextLine();
        int index = name.indexOf(name1);
        type.remove(index);
        name.remove(name1);
        quantity.remove(index);
        price.remove(index);
        Product product = new Product();
        product.showProducts();
        Main.inputCommand();
    }
}
