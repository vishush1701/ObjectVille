package org.objectville;

public enum Wood {

    INDIAN_ROSEWOOD("Indian RoseWood"),
    BRAZILIAN_ROSEWOOD("Brazilian Rosewood"),
    MAHOGANY("mahogany"),
    MAPLE("maple"),
    COCOBOLO("cocobolo"),
    CEDAR("cedar"),
    ADIRONDACK("adironddack"),
    ALDER("alder"),
    SITKA("sitka");

    private String name;

    Wood(String name){
        this.name = name;
    }
}
