package org.objectville;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public abstract class InstrumentSpec {
    String serialNumber;
    Builder builder;
    String model;
    Type type;
    Wood backWood;
    Wood topWood;
    Integer numberOfString;

    Double price;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public abstract  List<Instrument> search(List<Instrument> instruments);

}
