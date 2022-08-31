package ua.com.javarush.palchevskaya.island.herbivores;


import ua.com.javarush.palchevskaya.island.Animal;

public class Boar extends Animal {
    public Boar() {
        weight = 400;
        maxAmount = 50;
        movementSpeed = 2;
        maxSaturation = 50;
        currentSaturation = maxSaturation;
    }

    public int getNum() {
        return 2;
    }
}
