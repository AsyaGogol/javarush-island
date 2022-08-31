package ua.com.javarush.palchevskaya.island;

import ua.com.javarush.palchevskaya.island.herbivores.*;
import ua.com.javarush.palchevskaya.island.plant.Herb;
import ua.com.javarush.palchevskaya.island.predators.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class BasicItem implements Cloneable {

    protected double weight;
    protected int maxAmount;
    protected int movementSpeed;
    protected double maxSaturation;
    protected double currentSaturation;

    static final Random random = new Random();
    static int[][] eatenProbability = {{0, 80, 50, 20, 0, 80, 10, 0, 0, 70, 0, 40, 90, 0, 70, 0},
            {0, 0, 0, 0, 0, 0, 10, 0, 15, 0, 0, 0, 40, 20, 0, 0},
            {0, 0, 0, 0, 90, 0, 0, 0, 0, 0, 100, 0, 50, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 90, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 80, 0, 10, 0, 0, 0, 90, 90, 0, 0},
            {0, 0, 0, 0, 40, 0, 60, 0, 0, 0, 0, 0, 90, 70, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 90, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0},
            {0, 0, 15, 10, 0, 15, 40, 0, 0, 60, 0, 10, 80, 60, 70, 0}};


    protected static final int width = 10;
    protected static final int height = 20;

    protected static ArrayList<BasicItem>[][] island;

    static ArrayList[][] createIsland() {
        ArrayList<BasicItem>[][] island = new ArrayList[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                island[i][j] = new ArrayList<>();
            }
        }
        return island;
    }

    static void setIsland(ArrayList<BasicItem>[][] island) {
        BasicItem.island = island;
    }

    static void fillIsland() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Bear bear = new Bear();
                for (int k = 0; k < random.nextInt(bear.maxAmount); k++) {
                    island[i][j].add(new Bear());
                }
                Boa boa = new Boa();
                for (int k = 0; k < random.nextInt(boa.maxAmount); k++) {
                    island[i][j].add(new Boa());
                }
                Boar boar = new Boar();
                for (int k = 0; k < random.nextInt(boar.maxAmount); k++) {
                    island[i][j].add(new Boar());
                }
                Buffalo buffalo = new Buffalo();
                for (int k = 0; k < random.nextInt(buffalo.maxAmount); k++) {
                    island[i][j].add(new Buffalo());
                }
                Caterpillar caterpillar = new Caterpillar();
                for (int k = 0; k < random.nextInt(caterpillar.maxAmount); k++) {
                    island[i][j].add(new Caterpillar());
                }
                Deer deer = new Deer();
                for (int k = 0; k < random.nextInt(deer.maxAmount); k++) {
                    island[i][j].add(new Deer());
                }
                Duck duck = new Duck();
                for (int k = 0; k < random.nextInt(duck.maxAmount); k++) {
                    island[i][j].add(new Duck());
                }
                Eagle eagle = new Eagle();
                for (int k = 0; k < random.nextInt(eagle.maxAmount); k++) {
                    island[i][j].add(new Eagle());
                }
                Fox fox = new Fox();
                for (int k = 0; k < random.nextInt(fox.maxAmount); k++) {
                    island[i][j].add(new Fox());
                }
                Goat goat = new Goat();
                for (int k = 0; k < random.nextInt(goat.maxAmount); k++) {
                    island[i][j].add(new Goat());
                }
                Herb herb = new Herb();
                for (int k = 0; k < random.nextInt(herb.maxAmount); k++) {
                    island[i][j].add(new Herb());
                }
                Horse horse = new Horse();
                for (int k = 0; k < random.nextInt(horse.maxAmount); k++) {
                    island[i][j].add(new Horse());
                }
                Mouse mouse = new Mouse();
                for (int k = 0; k < random.nextInt(mouse.maxAmount); k++) {
                    island[i][j].add(new Mouse());
                }
                Rabbit rabbit = new Rabbit();
                for (int k = 0; k < random.nextInt(rabbit.maxAmount); k++) {
                    island[i][j].add(new Rabbit());
                }
                Sheep sheep = new Sheep();
                for (int k = 0; k < random.nextInt(sheep.maxAmount); k++) {
                    island[i][j].add(new Sheep());
                }
                Wolf wolf = new Wolf();
                for (int k = 0; k < random.nextInt(wolf.maxAmount); k++) {
                    island[i][j].add(new Wolf());
                }
            }
        }
    }

    static void statistics(int animalsEaten, int animalsReproduced, int days) {
        int animalsCount = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                animalsCount += island[i][j].size();
            }
        }
        System.out.print("\n\n Current status of the island after " + days + " days:\n");
        System.out.print("\n Animals count: " + animalsCount);
        System.out.print("\n Animals eaten: " + animalsEaten);
        System.out.print("\n Animals reproduced: " + animalsReproduced);
    }


    static void moveAll() throws InterruptedException {
        ArrayList<BasicItem>[][] newIsland = createIsland();
        Thread[][] threads = new Thread[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                ChooseDirection chooseDirection = new ChooseDirection(island, newIsland, height, width, i, j);
                chooseDirection.move();
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                island[i][j] = newIsland[i][j];
            }
        }
    }

    protected int direction;
    protected int move;

    static class ChooseDirection {
        public volatile ArrayList<BasicItem>[][] island;
        public volatile ArrayList<BasicItem>[][] newIsland;
        public int height;
        public int width;
        public int i;
        public int j;

        public ChooseDirection(ArrayList<BasicItem>[][] island, ArrayList<BasicItem>[][] newIsland, int height, int width, int i, int j) {
            this.island = island;
            this.newIsland = newIsland;
            this.height = height;
            this.width = width;
            this.i = i;
            this.j = j;
        }

        public void move() {
            int direction;
            int move;
            for (int k = 0; k < island[i][j].size(); k++) {
                BasicItem animal = island[i][j].get(k);
                animal.chooseDirection();
                direction = animal.direction;
                move = animal.move;
                if (direction == 0 && j + move < width) { // right
                    newIsland[i][j + move].add(animal);
                } else if (direction == 1 && i + move < height) { // down
                    newIsland[i + move][j].add(animal);
                } else if (direction == 2 && j - move >= 0) { // left
                    newIsland[i][j - move].add(animal);
                } else if (direction == 3 && i - move >= 0) { // up
                    newIsland[i - move][j].add(animal);
                } else {
                    newIsland[i][j].add(animal);
                }
            }

        }
    }

    public void chooseDirection() {
        currentSaturation -= maxSaturation * 0.67;
        direction = ThreadLocalRandom.current().nextInt(4);
        if (movementSpeed > 0)
            move = ThreadLocalRandom.current().nextInt(movementSpeed);
        else {
            move = 0;
        }
    }

    static int reproduceAll() throws InterruptedException {
        int animalsReproduced = 0;
        Thread[][] threads = new Thread[height][width];
        int[][] size = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                size[i][j] = island[i][j].size();
                Reproduce reproduce = new Reproduce(island[i][j]);
                Thread thread = new Thread(reproduce);
                threads[i][j] = thread;
                thread.start();
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                threads[i][j].join();
                animalsReproduced += island[i][j].size() - size[i][j];
            }
        }
        return animalsReproduced;
    }

    static class Reproduce implements Runnable {
        private ArrayList<BasicItem> list;

        public Reproduce(ArrayList<BasicItem> list) {
            this.list = list;
        }

        private static boolean can(ArrayList<BasicItem> list, BasicItem item) {
            int count = 0;
            for (BasicItem basicItem : list) {
                if (basicItem.getClass() == item.getClass())
                    count++;
            }
            return count < item.maxAmount;
        }

        public void run() {
            int size = list.size();
            for (int k = 0; k < size; k++) {
                BasicItem item = list.get(k);
                try {
                    item.reproduce(item, list, k + 1, size);
                } catch (CloneNotSupportedException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    protected void reproduce(BasicItem item1, ArrayList<BasicItem> list, int k, int size)
            throws CloneNotSupportedException, InterruptedException {
        for (int p = k; p < size; p++) {
            BasicItem item2 = list.get(p);
            if (item1.getClass() == item2.getClass() && Reproduce.can(list, item2)) {
                BasicItem newItem;
                try {
                    newItem = (BasicItem) item2.clone();
                } catch (CloneNotSupportedException e) {
                    throw new RuntimeException(e);
                }
                newItem.currentSaturation = maxSaturation;
                list.add(newItem);
                return;
            }
        }
    }

    static int eatAll() throws InterruptedException {
        int animalsEaten = 0;
        Thread[][] threads = new Thread[height][width];
        int[][] size = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                size[i][j] = island[i][j].size();
                Eat eat = new Eat(island[i][j]);
                Thread thread = new Thread(eat);
                threads[i][j] = thread;
                thread.start();
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                threads[i][j].join();
                animalsEaten += size[i][j] - island[i][j].size();
            }
        }
        return animalsEaten;
    }

    static class Eat implements Runnable {
        private ArrayList<BasicItem> list;

        public Eat(ArrayList<BasicItem> list) {
            this.list = list;
        }

        public void run() {
            int eaten;
            int size = list.size();
            for (int k = 0; k < size; k++) {
                BasicItem item = list.get(k);
                if (item.currentSaturation < 0) {
                    list.remove(k);
                    k--;
                    size--;
                    continue;
                }
                try {
                    eaten = item.eat(list);
                    if (eaten >= 0) {
                        if (eaten <= k) {
                            k--;
                        }
                        size--;
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    protected int eat(ArrayList<BasicItem> list) throws InterruptedException {
        double addSaturation;
        int prob;
        for (int p = 0; p < list.size(); p++) {
            BasicItem item = list.get(p);
            prob = eatenProbability[this.getNum()][item.getNum()];
            if (prob > 0) {
                if (ThreadLocalRandom.current().nextInt(100) < prob) {
                    addSaturation = item.weight;
                    if (this.currentSaturation + addSaturation > this.maxSaturation) {
                        addSaturation = this.maxSaturation - this.currentSaturation;
                    }
                    this.currentSaturation += addSaturation;
                    list.remove(p);
                    return p;
                }
                return -1;
            }
        }
        return -1;
    }

    public int getNum() {
        return 0;
    }
}
