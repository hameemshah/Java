package AbstractClasses;

import java.util.ArrayList;

public class Main {
    static ArrayList<ProductForSale> pfs = new ArrayList<>();
    public static void main(String[] args) {
        pfs.add(new SmartPhone("Android Phone", 30000, "16GB RAM, 5G, 995Sanpdragon, 108MP", "Mi K2"));
        pfs.add(new Laptop("HP Windows11", 30000, "64GB RAM, 2TB SSD, core i9, 8GB GPU", "Mi K2"));

        listProducts();
    }

    public static void listProducts() {
        for(var item : pfs) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
}