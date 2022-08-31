package ua.com.javarush.palchevskaya.island.predators;

import ua.com.javarush.palchevskaya.island.Animal;

public class Eagle extends Animal {
    public Eagle() {
        weight = 6;
        maxAmount = 20;
        movementSpeed = 3;
        maxSaturation = 1;
        currentSaturation = maxSaturation;
    }

    public int getNum() {
        return 7;
    }
}
