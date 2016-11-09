package com.geekhub.homework3;

import java.util.Scanner;

import static com.geekhub.homework3.Product.comPrice1;
import static com.geekhub.homework3.Product.comPrice2;
import static com.geekhub.homework3.Product.comPrice3;

class Inventory extends InputProducts {

    static void sumOfPrices() {
        System.out.println("Sum of prices - "+(comPrice1 + comPrice2 + comPrice3));
        }
    static void deleteData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the item for deleting");
        String name1 = s.nextLine();
        name.remove(name1);
        Product product = new Product();
        product.showProducts();
    }
}
