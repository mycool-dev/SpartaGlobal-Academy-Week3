package com.sparta.me.concurrency;

public class Deadlock {
    private static class Fox {
        private final String name;

        public Fox(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public synchronized void drinkAtLake(Fox fox) {
            System.out.print(name + ": " + fox.getName() + " is drinking at the lake" + "\n");
            fox.eatInForest(this);
        }

        public synchronized void eatInForest(Fox fox) {
            System.out.print(name + ": " + fox.getName() + " is eating in the forest" + "\n");
        }
    }

    public static void main(String[] args) {
        final Fox foxy = new Fox("Foxy");
        final Fox foxtrot = new Fox("Foxtrot");
        new Thread(() -> foxy.drinkAtLake(foxtrot)).start();
        new Thread(() -> foxtrot.drinkAtLake(foxy)).start();
    }
}
