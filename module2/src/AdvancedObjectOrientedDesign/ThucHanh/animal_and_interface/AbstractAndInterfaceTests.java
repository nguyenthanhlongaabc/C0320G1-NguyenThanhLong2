package AdvancedObjectOrientedDesign.ThucHanh.animal_and_interface;

import AdvancedObjectOrientedDesign.ThucHanh.animal_and_interface.animal.Animal;
import AdvancedObjectOrientedDesign.ThucHanh.animal_and_interface.animal.Chicken;
import AdvancedObjectOrientedDesign.ThucHanh.animal_and_interface.animal.Tiger;
import AdvancedObjectOrientedDesign.ThucHanh.animal_and_interface.Edible.*;
import AdvancedObjectOrientedDesign.ThucHanh.animal_and_interface.Fruit.Apple;
import AdvancedObjectOrientedDesign.ThucHanh.animal_and_interface.Fruit.Fruit;
import AdvancedObjectOrientedDesign.ThucHanh.animal_and_interface.Fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Chicken chicken = (Chicken) animal;
                System.out.println(chicken.howToEat());
            }

        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit fruit1: fruit) {
            System.out.println(fruit1.howToEat());
        }
    }
}
