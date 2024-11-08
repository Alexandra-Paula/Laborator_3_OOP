package Polimorfism_Static;

import java.util.List;

public class Main {
    public static void main(String[] args){
        ForestAnimal fox = new ForestAnimal("Fox", "Swift Wanderer");
        ForestAnimal bear = new ForestAnimal("Bear", "Guardian of the Forest");
        ForestAnimal owl = new ForestAnimal("Owl", "Wise Observer");

        List<ForestAnimal> animals = List.of(fox, bear, owl);

        for (ForestAnimal animal : animals) {
            System.out.println(animal);
        }
        System.out.println();

        fox.performAction("sneak");
        fox.performAction("sneak", 5);

        bear.performAction("forage");
        bear.performAction("forage", 10, "berries");

        owl.performAction("observe", "night");
        owl.performAction("observe", "night", true);
    }
}