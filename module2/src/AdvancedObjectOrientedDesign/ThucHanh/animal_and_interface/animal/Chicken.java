package AdvancedObjectOrientedDesign.ThucHanh.animal_and_interface.animal;

import AdvancedObjectOrientedDesign.ThucHanh.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken : cluck-cluck!";
    }

    @Override
    public String howToEat(){
        return "could be fried";
    }
}
