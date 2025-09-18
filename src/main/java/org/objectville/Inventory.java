package org.objectville;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Inventory {
    private List<Guitar> guitars;
    private GuitarSpec guitarSpec;

    public Inventory (){
        this.guitars = new LinkedList<>();
    }
    public void addGuitart(String serialNumber,Double price,GuitarSpec guitarSpec){
        Guitar guitar = new Guitar(serialNumber,price, guitarSpec);
        this.guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        Iterator<Guitar> iterator = this.guitars.iterator();
        Guitar guitar = null;
        while (iterator.hasNext()){
            guitar = iterator.next();
            if(guitar.getSerialNumber().equalsIgnoreCase(serialNumber)){
                break;
            }
        }
        return guitar;
    }

    public List<Guitar> search(GuitarSpec guitarSpec) {
            return guitarSpec.search(guitars);
    }
}
