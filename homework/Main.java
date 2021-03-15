package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dog shpits_yapani = new Dog("toy");
        Cat perssian = new Cat("mitsi");

        Animal[] animals = new Animal[2];
        animals[0] = new Dog("shpits_yapani");
        animals[1] = new Cat("perssian");
        for (int index = 0; index < animals.length; index++) {
            System.out.println(index);
        }



    }

    public void makeSound(Animal animal) {
        if (animal instanceof Dog) {
            Dog Shpits_yapani = (Dog) animal;
        } else if (animal instanceof Cat) {
            Cat perssian = (Cat) animal;
        } else {
            throw new ClassCastException("unknown class");
        }
    }
}
