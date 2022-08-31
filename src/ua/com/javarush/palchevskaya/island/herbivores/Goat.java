package ua.com.javarush.palchevskaya.island.herbivores;


import ua.com.javarush.palchevskaya.island.Animal;

public class Goat extends Animal {
    public Goat() {
        weight = 60;
        maxAmount = 140;
        movementSpeed = 3;
        maxSaturation = 10;
        currentSaturation = maxSaturation;
    }

    public int getNum() {
        return 9;
    }
}
