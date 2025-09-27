package org.objectville;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class GuitarSpec extends InstrumentSpec{

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Integer numberOfString,Double price,String serialNumber) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numberOfString = numberOfString;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public List<Instrument> search(List<Instrument> instruments){
        List<Instrument> matchingGuitars = new LinkedList<>();
        Iterator<Instrument> iterator = instruments.iterator();
        while (iterator.hasNext()){
            Guitar matchingGuitar = (Guitar) iterator.next();
//            if(Objects.nonNull(searchGuitar.getSerialNumber()) && !guitar.getSerialNumber().equalsIgnoreCase(searchGuitar.getSerialNumber()))
//                continue;
            if(Objects.nonNull(this.getBuilder()) && matchingGuitar.getInstrumentSpec().getBuilder() != this.getBuilder())
                continue;
            if(Objects.nonNull(this.getBackWood()) && matchingGuitar.getInstrumentSpec().getBackWood() != this.getBackWood())
                continue;
            if(Objects.nonNull(this.getModel()) && matchingGuitar.getInstrumentSpec().getModel() != this.getModel())
                continue;
            if(Objects.nonNull(this.getTopWood()) && matchingGuitar.getInstrumentSpec().getTopWood() != this.getTopWood())
                continue;
            if(Objects.nonNull(this.getType()) && matchingGuitar.getInstrumentSpec().getType() != this.getType())
                continue;
            matchingGuitars.add(matchingGuitar);
        }
        return matchingGuitars;
    }
}
