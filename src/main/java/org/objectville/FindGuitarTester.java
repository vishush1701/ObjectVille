package org.objectville;

import java.util.Arrays;
import java.util.List;

public class FindGuitarTester {
    public static void main(String [] args){
        //initialize inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        GuitarSpec guitarSpec = new GuitarSpec(Builder.FENDER,null,null,null,null,6);
        List<Guitar> matching = inventory.search(guitarSpec);
        System.out.printf("found %d matching guitar in inventory.%n",matching.size());


        GuitarSpec guitarSpec1 = new GuitarSpec(null,null,null,null,null,6);
        matching = inventory.search(guitarSpec1);
        System.out.printf("found %d matching guitar in inventory.%n",matching.size());
    }

    public static void initializeInventory(Inventory inventory){
        inventory.addGuitart("vc393939",1200.00,new GuitarSpec(Builder.FENDER,"stratocaster",Type.ELECTRICT,Wood.INDIAN_ROSEWOOD,Wood.INDIAN_ROSEWOOD,6));
        inventory.addGuitart("vc393939",1200.00,new GuitarSpec(Builder.GIBSON,"stratocaster",Type.ELECTRICT,Wood.INDIAN_ROSEWOOD,Wood.INDIAN_ROSEWOOD,6));
    }
}
