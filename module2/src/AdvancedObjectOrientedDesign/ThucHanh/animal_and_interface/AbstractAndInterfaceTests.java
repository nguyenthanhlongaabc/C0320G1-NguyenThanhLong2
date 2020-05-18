package AdvancedObjectOrientedDesign.ThucHanh;

import AdvancedObjectOrientedDesign.ThucHanh.Animal.Animal;
import AdvancedObjectOrientedDesign.ThucHanh.Animal.Chicken;
import AdvancedObjectOrientedDesign.ThucHanh.Animal.Tiger;
import AdvancedObjectOrientedDesign.ThucHanh.Edible.Edible;
import AdvancedObjectOrientedDesign.ThucHanh.Fruit.Apple;
import AdvancedObjectOrientedDesign.ThucHanh.Fruit.Fruit;
import AdvancedObjectOrientedDesign.ThucHanh.Fruit.Orange;

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
