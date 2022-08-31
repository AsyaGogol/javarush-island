package ua.com.javarush.palchevskaya.island.predators;

import ua.com.javarush.palchevskaya.island.Animal;

public class Fox extends Animal {
    public Fox() {
        weight = 8;
        maxAmount = 30;
        movementSpeed = 2;
        maxSaturation = 2;
        currentSaturation = maxSaturation;
    }

    public int getNum() {
        return 8;
    }
}

