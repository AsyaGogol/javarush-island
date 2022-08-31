package ua.com.javarush.palchevskaya.island.predators;

import ua.com.javarush.palchevskaya.island.Animal;

public class Wolf extends Animal {
    public Wolf() {
        weight = 50;
        maxAmount = 30;
        movementSpeed = 3;
        maxSaturation = 8;
        currentSaturation = maxSaturation;
    }

    public int getNum() {
        return 15;
    }
}
