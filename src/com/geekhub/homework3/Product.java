package com.geekhub.homework3;

class Product extends Inventory {
    static double comPrice1, comPrice2, comPrice3;

    void showProducts() {
        Cheese cheese = new Cheese();
        Whiskey whiskey = new Whiskey();
        Rom rom = new Rom();
        cheese.showProduct1();
        whiskey.showProduct2();
        rom.showProduct3();
    }
    private class Cheese {
        void showProduct1() {
            int index = name.indexOf("Cheese");
            if(index>=0){
            System.out.println(name.get(index) + " " + quantity.get(index) + " " + price.get(index));
            comPrice1 = quantity.get(index)*price.get(index);
            }
        }
    }
    private class Whiskey {
        void showProduct2() {
            int index = name.indexOf("Rom");
            if(index>=0){
            System.out.println(name.get(index) + " " + quantity.get(index) + " " + price.get(index));
            comPrice2 = quantity.get(index)*price.get(index);
            }
        }
    }
    private class Rom {
        void showProduct3() {
            int index = name.indexOf("Whiskey");
            if (index>=0){
            System.out.println(name.get(index) + " " + quantity.get(index) + " " + price.get(index));
            comPrice3 = quantity.get(index)*price.get(index);
            }
        }
    }
}



