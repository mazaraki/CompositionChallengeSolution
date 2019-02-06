package com.boo;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(3,12);

        Bed bed = new Bed("Romantic", 4, 40, 2, 1);

        Lamp lamp = new Lamp("Louis XIV", false, 75);

        Bedroom bedroom = new Bedroom("My room", wall1, wall2, wall3, wall4,ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
