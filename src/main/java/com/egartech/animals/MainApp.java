package com.egartech.animals;


public class MainApp {

       public static void main(String[] args) {
        Flyable[] flyable = {
                new Duck(),
                new Airplane()
        };

        for (Flyable f : flyable) {
            f.fly();
        }

        Flyable somethingFlyable = new Duck();

        somethingFlyable.fly();

    }

}
