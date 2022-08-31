package ua.com.javarush.palchevskaya.island.predators;

import ua.com.javarush.palchevskaya.island.Animal;

public class Bear extends Animal {
    public Bear() {
        weight = 500;
        maxAmount = 5;
        movementSpeed = 2;
        maxSaturation = 80;
        currentSaturation = maxSaturation;
    }


    public int getNum() {
        return 0;
    }

}
