package ua.com.javarush.palchevskaya.island.herbivores;

import ua.com.javarush.palchevskaya.island.Animal;

public class Rabbit extends Animal {
    public Rabbit() {
        weight = 2;
        maxAmount = 150;
        movementSpeed = 2;
        maxSaturation = 0.45;
        currentSaturation = maxSaturation;
    }

    public int getNum() {
        return 13;
    }
}


