package ua.com.javarush.palchevskaya.island.herbivores;


import ua.com.javarush.palchevskaya.island.Animal;

public class Buffalo extends Animal {
    public Buffalo() {
        weight = 700;
        maxAmount = 10;
        movementSpeed = 3;
        maxSaturation = 100;
        currentSaturation = maxSaturation;
    }


    public int getNum() {
        return 3;
    }
}

