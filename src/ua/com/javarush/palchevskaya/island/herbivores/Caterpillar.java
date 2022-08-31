package ua.com.javarush.palchevskaya.island.herbivores;


import ua.com.javarush.palchevskaya.island.Animal;

public class Caterpillar extends Animal {
    public Caterpillar() {
        weight = 0.01;
        maxAmount = 1000;
        movementSpeed = 0;
        maxSaturation = 0;
        currentSaturation = maxSaturation;
    }


    public int getNum() {
        return 4;
    }
}
