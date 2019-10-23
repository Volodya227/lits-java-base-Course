package com.Homework7aboutZoo;

public class Zoo {
    Human[] humans = {new Human("Ivan", 30),
            new Human("Petro", 31),
            new Human("Jack", 29)};

    void open(Animals animal, String humanName) throws ZooException {
        int i = findHuman(humanName);
        if (i >= 0) {
            humans[i].setAnimal(animal);
        } else {
            throw new ZooException("unknown worker");
        }

    }

    void dinner(String name, Food food) throws ZooException {
        int i = findHuman(name);
        if (i >= 0) {
            humans[i].feed_animal(food, name);
        } else {
            throw new ZooException("unknown worker");
        }
    }

    private int findHuman(String name) {
        for (var i = 0; i < humans.length; i++) {
            if (humans[i].name == name) {
                return i;
            }
        }
        return -1;
    }
}
