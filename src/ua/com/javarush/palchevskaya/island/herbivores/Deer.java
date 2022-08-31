package ua.com.javarush.palchevskaya.island.herbivores;

import ua.com.javarush.palchevskaya.island.Animal;

public class Deer extends Animal {
    public Deer() {
        weight = 300;
        maxAmount = 20;
        movementSpeed = 4;
        maxSaturation = 50;
        currentSaturation = maxSaturation;
    }

    public int getNum() {
        return 5;
    }
}
