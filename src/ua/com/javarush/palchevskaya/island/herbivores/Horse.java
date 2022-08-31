package ua.com.javarush.palchevskaya.island.herbivores;

import ua.com.javarush.palchevskaya.island.Animal;

public class Horse extends Animal {
    public Horse() {
        weight = 400;
        maxAmount = 20;
        movementSpeed = 4;
        maxSaturation = 60;
        currentSaturation = maxSaturation;
    }


    public int getNum() {
        return 11;
    }
}
