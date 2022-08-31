package ua.com.javarush.palchevskaya.island;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        BasicItem.setIsland(BasicItem.createIsland());
        BasicItem.fillIsland();
        int animalsEaten;
        int animalsReproduced;
        for (int i = 0; i < 10; i++) {
            BasicItem.moveAll();
            animalsReproduced = BasicItem.reproduceAll();
            animalsEaten = BasicItem.eatAll();
            BasicItem.statistics(animalsEaten, animalsReproduced, i);
            Thread.sleep(1);
        }
    }
}
