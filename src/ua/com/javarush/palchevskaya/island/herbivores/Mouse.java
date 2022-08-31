package ua.com.javarush.palchevskaya.island.herbivores;

import ua.com.javarush.palchevskaya.island.Animal;

public class Mouse extends Animal {
    public Mouse() {
        weight = 0.05;
        maxAmount = 500;
        movementSpeed = 1;
        maxSaturation = 0.01;
        currentSaturation = maxSaturation;
    }

    public int getNum() {
        return 12;
    }
}

