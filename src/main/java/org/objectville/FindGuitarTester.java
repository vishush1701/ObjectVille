package org.objectville;

import java.util.Arrays;
import java.util.List;

public class FindGuitarTester {
    public static void main(String [] args){
        //initialize inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec guitarSpec = new GuitarSpec(Builder.FENDER,null,null,null,null,6,null,null
        );
        List<Instrument> matching = inventory.search(guitarSpec);
        System.out.printf("found %d matching guitar in inventory.%n",matching.size());


        InstrumentSpec guitarSpec1 = new GuitarSpec(null,null,null,null,null,6,null,null);
        matching = inventory.search(guitarSpec1);
        System.out.printf("found %d matching guitar in inventory.%n",matching.size());
    }

    public static void initializeInventory(Inventory inventory){

        inventory.addGuitart(new GuitarSpec(Builder.FENDER,"stratocaster",Type.ELECTRICT,Wood.INDIAN_ROSEWOOD,Wood.INDIAN_ROSEWOOD,6,300.00,"vc393940"));
        inventory.addGuitart(new GuitarSpec(Builder.GIBSON,"stratocaster",Type.ELECTRICT,Wood.INDIAN_ROSEWOOD,Wood.INDIAN_ROSEWOOD,6,450.00,"vc393939"));

    }
}
