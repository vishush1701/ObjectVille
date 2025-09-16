package org.objectville;

public enum Builder {
    FENDER("fender"),
    MARTIN("martin"),
    GIBSON("gibson"),
    COLLINGS("collings"),
    OLSON("olson"),
    RYAN("ryan"),
    PRS("prs"),
    ANY("any");

    private String name;

    Builder(String name){
        this.name = name;
    }
}
