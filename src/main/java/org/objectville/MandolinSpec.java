package org.objectville;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MandolinSpec extends InstrumentSpec{

    private Style style;

    public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Integer numberOfString,Double price, String serialNumber ,Style style) {
        this.setBuilder(builder);
        this.setModel(model);
        this.setType(type);
        this.setBackWood(backWood);
        this.setTopWood(topWood);
        this.setNumberOfString(numberOfString);
        this.setSerialNumber(serialNumber);
        this.setPrice(price);
        this.style = style;
    }


    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public List<Instrument> search(List<Instrument> instruments) {
        List<Instrument> matchingMandolins = new LinkedList<>();
        Iterator<Instrument> iterator = instruments.iterator();
        while (iterator.hasNext()){
            Mandolin matchingMandolin = (Mandolin) iterator.next();
            if(Objects.nonNull(this.getStyle()) && !matchingMandolin.getStyle().equals(this.getStyle()))
                continue;
            if(Objects.nonNull(this.getBuilder()) && matchingMandolin.getInstrumentSpec().getBuilder() != this.getBuilder())
                continue;
            if(Objects.nonNull(this.getBackWood()) && matchingMandolin.getInstrumentSpec().getBackWood() != this.getBackWood())
                continue;
            if(Objects.nonNull(this.getModel()) && matchingMandolin.getInstrumentSpec().getModel() != this.getModel())
                continue;
            if(Objects.nonNull(this.getTopWood()) && matchingMandolin.getInstrumentSpec().getTopWood() != this.getTopWood())
                continue;
            if(Objects.nonNull(this.getType()) && matchingMandolin.getInstrumentSpec().getType() != this.getType())
                continue;
            matchingMandolins.add(matchingMandolin);
        }
        return matchingMandolins;
    }
}
