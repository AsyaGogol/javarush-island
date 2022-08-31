package ua.com.javarush.palchevskaya.island.plant;

import ua.com.javarush.palchevskaya.island.Plant;

public class Herb extends Plant {
    public Herb() {
        weight = 1;
        maxAmount = 200;
        movementSpeed = 0;
        maxSaturation = 0;
        currentSaturation = maxSaturation;
    }


    public int getNum() {
        return 10;
    }
}
