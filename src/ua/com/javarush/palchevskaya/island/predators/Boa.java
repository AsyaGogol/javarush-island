package ua.com.javarush.palchevskaya.island.predators;


import ua.com.javarush.palchevskaya.island.Animal;

public class Boa extends Animal {
    public Boa() {

        weight = 15;
        maxAmount = 30;
        movementSpeed = 1;
        maxSaturation = 3;
        currentSaturation = maxSaturation;
    }

    public int getNum() {
        return 1;
    }
}
