package org.objectville;

public abstract class Instrument {
    InstrumentSpec instrumentSpec;

    public InstrumentSpec getInstrumentSpec() {
        return instrumentSpec;
    }

    public void setInstrumentSpec(InstrumentSpec instrumentSpec) {
        this.instrumentSpec = instrumentSpec;
    }
}
