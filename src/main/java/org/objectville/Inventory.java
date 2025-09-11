package org.objectville;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory (){
        this.guitars = new LinkedList<>();
    }
    public void addGuitart(String serialNumber, String builder, String model, String type, String backWood, String topWood, Double price){
        Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
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

    public List<Guitar> search(Guitar searchGuitar) {
        List<Guitar> matchingGuitars = new LinkedList<>();
        Iterator<Guitar> iterator = this.guitars.iterator();
        while (iterator.hasNext()){
            Guitar guitar = iterator.next();
            if(Objects.nonNull(searchGuitar.getSerialNumber()) && !guitar.getSerialNumber().equalsIgnoreCase(searchGuitar.getSerialNumber()))
                continue;
            if(Objects.nonNull(searchGuitar.getBuilder()) && !guitar.getBuilder().equalsIgnoreCase(searchGuitar.getBuilder()))
                continue;
            if(Objects.nonNull(searchGuitar.getBackWood()) && !guitar.getBackWood().equalsIgnoreCase(searchGuitar.getBackWood()))
                continue;
            if(Objects.nonNull(searchGuitar.getModel()) && !guitar.getModel().equalsIgnoreCase(searchGuitar.getModel()))
                continue;
            if(Objects.nonNull(searchGuitar.getTopWood()) && !guitar.getTopWood().equalsIgnoreCase(searchGuitar.getTopWood()))
                continue;
            if (Objects.nonNull(searchGuitar.getType()) && !guitar.getType().equalsIgnoreCase(searchGuitar.getType()))
                continue;
            matchingGuitars.add(guitar);
        }
        return  matchingGuitars;
    }
}
