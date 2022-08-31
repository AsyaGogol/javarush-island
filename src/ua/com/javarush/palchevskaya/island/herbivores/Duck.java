package ua.com.javarush.palchevskaya.island.herbivores;

import ua.com.javarush.palchevskaya.island.Animal;

public class Duck extends Animal {
    public Duck() {
        weight = 1;
        maxAmount = 200;
        movementSpeed = 4;
        maxSaturation = 0.15;
        currentSaturation = maxSaturation;
    }


    public int getNum() {
        return 6;
    }
}
