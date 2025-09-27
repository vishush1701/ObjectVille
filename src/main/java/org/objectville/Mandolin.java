package org.objectville;

public class Mandolin extends Instrument {
    private Style style;

    private MandolinSpec mandolinSpec;

    public Mandolin(Style style,MandolinSpec mandolinSpec) {
        this.style = style;
        this.mandolinSpec = mandolinSpec;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public MandolinSpec getMandolinSpec() {
        return mandolinSpec;
    }

    public void setMandolinSpec(MandolinSpec mandolinSpec) {
        this.mandolinSpec = mandolinSpec;
    }
}
