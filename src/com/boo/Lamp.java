package com.boo;

public class Lamp {
    private String style;
    private boolean hasBattery;
    private int globRating;

    public Lamp(String style, boolean hasBattery, int globRating) {
        this.style = style;
        this.hasBattery = hasBattery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
