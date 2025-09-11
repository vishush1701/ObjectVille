package org.objectville;

import java.util.List;

public class FindGuitarTester {
    public static void main(String [] args){
        //initialize inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar guitar = new Guitar(null,"fender",null,null,null,null,120.00);
        List<Guitar> matching = inventory.search(guitar);
        System.out.printf("found %d matching guitar in inventory",matching.size());

    }

    public static void initializeInventory(Inventory inventory){
        inventory.addGuitart("vc393939","fender","stratocaster","electric","alder","alder",1200.00);
    }
}
