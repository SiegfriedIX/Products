package com.geekhub.homework3;

class Product extends Inventory {
    static double comPrice1;

    void showProducts() {
        Cheese cheese = new Cheese();
        Whiskey whiskey = new Whiskey();
        Rom rom = new Rom();
        cheese.showProduct1();
        rom.showProduct2();
        whiskey.showProduct3();
    }
    private class Cheese {
        void showProduct1() {
            int index = type.indexOf("Cheese");
            int index1 = type.lastIndexOf("Cheese");
            showProduct(index,index1);
        }
    }
    private class Rom {
        void showProduct2() {
            int index = type.indexOf("Rom");
            int index1 = type.lastIndexOf("Rom");
            showProduct(index, index1);
        }
    }
    private class Whiskey {
        void showProduct3() {
            int index = type.indexOf("Whiskey");
            int index1 = type.lastIndexOf("Whiskey");
            showProduct(index, index1);
        }
    }
    private void showProduct(int index, int index1) {
            if (index>=0){
                System.out.println(type.get(index) + " " + name.get(index) + " " + quantity.get(index) + " " + price.get(index));
                double comPrice = quantity.get(index) * price.get(index);
                if (index1!=-1&&index1!=index) {
                    System.out.println(type.get(index1) + " " + name.get(index1) + " " + quantity.get(index1) + " " + price.get(index1));
                    comPrice1 = quantity.get(index1) * price.get(index1)+comPrice;
                }
                else{comPrice1=comPrice;}
            }
        }
    }




