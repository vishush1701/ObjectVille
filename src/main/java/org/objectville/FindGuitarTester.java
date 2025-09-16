package org.objectville;

import java.util.Arrays;
import java.util.List;

public class FindGuitarTester {
    public static void main(String [] args){
        //initialize inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar guitar = new Guitar(null,Builder.FENDER,null,null,null,null,120.00);
        List<Guitar> matching = inventory.search(guitar);
        System.out.printf("found %d matching guitar in inventory.%n",matching.size());

    }

    public static void initializeInventory(Inventory inventory){
        inventory.addGuitart("vc393939",Builder.FENDER,"stratocaster",Type.ELECTRICT,Wood.INDIAN_ROSEWOOD,Wood.INDIAN_ROSEWOOD,1200.00);
    }
}
