package ua.com.javarush.palchevskaya.island.herbivores;

import ua.com.javarush.palchevskaya.island.Animal;

public class Sheep extends Animal {
    public Sheep() {
        weight = 70;
        maxAmount = 140;
        movementSpeed = 3;
        maxSaturation = 15;
        currentSaturation = maxSaturation;
    }

    public int getNum() {
        return 14;
    }
}

