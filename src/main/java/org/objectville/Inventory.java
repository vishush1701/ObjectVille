package org.objectville;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Inventory {
    private List<Instrument> instruments;

    public Inventory (){
        this.instruments = new LinkedList<>();
    }
    public void addGuitart(InstrumentSpec instrumentSpec){
        GuitarSpec guitarSpec = new GuitarSpec(instrumentSpec.builder,instrumentSpec.getModel(),instrumentSpec.getType(),instrumentSpec.getBackWood(),instrumentSpec.getTopWood(),instrumentSpec.getNumberOfString(),instrumentSpec.getPrice(),instrumentSpec.getSerialNumber());
        Guitar guitar = new Guitar(guitarSpec);
        guitar.setInstrumentSpec(guitarSpec);
        this.instruments.add(guitar);
    }

    public void addMandolin(Style style,InstrumentSpec instrumentSpec){
        MandolinSpec mandolinSpec = new MandolinSpec(instrumentSpec.builder,instrumentSpec.getModel(),instrumentSpec.getType(),instrumentSpec.getBackWood(),instrumentSpec.getTopWood(),instrumentSpec.getNumberOfString(),instrumentSpec.getPrice(),instrumentSpec.getSerialNumber(),style);
        Mandolin mandolin = new Mandolin(style, mandolinSpec);
        mandolin.setInstrumentSpec(mandolinSpec);
        this.instruments.add(mandolin);
    }

    public Instrument getInstrument(String serialNumber){
//        Iterator<Instrument> iterator = this.instruments.iterator();
//        while (iterator.hasNext()){
//            Instrument instrument = iterator.next();
//            if(instrument.getSerialNumber().equalsIgnoreCase(serialNumber)){
//                break;
//            }
//        }
//        return guitar;
        return null;
    }

    public List<Instrument> search(InstrumentSpec instrumentSpec) {
            return instrumentSpec.search(this.instruments);
    }
}
