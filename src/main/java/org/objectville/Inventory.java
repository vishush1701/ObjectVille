package org.objectville;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory (){
        this.guitars = new LinkedList<>();
    }
    public void addGuitart(String serialNumber, String builder, String model, String type, String backWood, String topWood, Double price){
        Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
        guitars.add(guitar);
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

    public Guitar search(Guitar searchGuitar) {
        Iterator<Guitar> iterator = this.guitars.iterator();
        while (iterator.hasNext()){
            Guitar guitar = iterator.next();
            if(!guitar.getSerialNumber().equalsIgnoreCase(searchGuitar.getSerialNumber()))
                continue;
            if(!guitar.getBuilder().equalsIgnoreCase(searchGuitar.getBuilder()))
                continue;
            if(!guitar.getBackWood().equalsIgnoreCase(searchGuitar.getBackWood()))
                continue;
            if(!guitar.getModel().equalsIgnoreCase(searchGuitar.getModel()))
                continue;
            if(!guitar.getTopWood().equalsIgnoreCase(searchGuitar.getTopWood()))
                continue;
            if (!guitar.getType().equalsIgnoreCase(searchGuitar.getType()))
                continue;
        }
        return  null;
    }
}
