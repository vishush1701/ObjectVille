package org.objectville;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class GuitarSpec {

    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private Integer numberOfString;

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public Integer getNumberOfString() {
        return numberOfString;
    }

    public void setNumberOfString(Integer numberOfString) {
        this.numberOfString = numberOfString;
    }

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Integer numberOfString) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numberOfString = numberOfString;
    }

    public List<Guitar> search(List<Guitar> guitars){
        List<Guitar> matchingGuitars = new LinkedList<>();
        Iterator<Guitar> iterator = guitars.iterator();
        while (iterator.hasNext()){
            Guitar matchingGuitar = iterator.next();
//            if(Objects.nonNull(searchGuitar.getSerialNumber()) && !guitar.getSerialNumber().equalsIgnoreCase(searchGuitar.getSerialNumber()))
//                continue;
            if(Objects.nonNull(this.getBuilder()) && matchingGuitar.getGuitarSpec().getBuilder() != this.getBuilder())
                continue;
            if(Objects.nonNull(this.getBackWood()) && matchingGuitar.getGuitarSpec().getBackWood() != this.getBackWood())
                continue;
            if(Objects.nonNull(this.getModel()) && matchingGuitar.getGuitarSpec().getModel() != this.getModel())
                continue;
            if(Objects.nonNull(this.getTopWood()) && matchingGuitar.getGuitarSpec().getTopWood() != this.getTopWood())
                continue;
            if(Objects.nonNull(this.getType()) && matchingGuitar.getGuitarSpec().getType() != this.getType())
                continue;
            matchingGuitars.add(matchingGuitar);
        }
        return matchingGuitars;
    }
}
