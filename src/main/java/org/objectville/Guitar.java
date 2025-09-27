package org.objectville;

public class Guitar extends Instrument {
    private GuitarSpec guitarSpec;

    public Guitar(GuitarSpec guitarSpec) {
        this.guitarSpec = guitarSpec;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }

    public void setGuitarSpec(GuitarSpec guitarSpec) {
        this.guitarSpec = guitarSpec;
    }
}
