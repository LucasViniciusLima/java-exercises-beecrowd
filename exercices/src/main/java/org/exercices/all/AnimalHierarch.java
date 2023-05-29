package org.exercices.all;
import java.util.Scanner;

/**
 * AnimalHierarch responsável por
 *
 * @author lucas
 * @since 2023-05-29
 */
public class AnimalHierarch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String primary = sc.next();
        String secondary = sc.next();
        String finalType = sc.next();

        Animal entryAnimal = new Animal(primary, secondary, finalType, "undefined");

        Animal[] animalsList = {
                new Animal("vertebrado", "ave", "carnivoro", "aguia"),
                new Animal("vertebrado", "ave", "onivoro", "pomba"),
                new Animal("vertebrado", "mamifero", "onivoro", "homem"),
                new Animal("vertebrado", "mamifero", "herbivoro", "vaca"),
                new Animal("invertebrado", "inseto", "hematofago", "pulga"),
                new Animal("invertebrado", "inseto", "herbivoro", "lagarta"),
                new Animal("invertebrado", "anelideo", "hematofago", "sanguessuga"),
                new Animal("invertebrado", "anelideo", "onivoro", "minhoca")
        };

        for(Animal animal: animalsList){
            if(animal.equals(entryAnimal)){
                System.out.println(animal.animalName);
            }
        }

    }
}

class Animal{
    String primary;
    String secondary;
    String finalType;
    String animalName;

    public Animal(String primary, String secondary, String finalType, String animalName){
        this.primary = primary;
        this.secondary = secondary;
        this.finalType = finalType;
        this.animalName = animalName;
    }

    @Override
    public boolean equals(Object animalEntry){
        Animal animal = (Animal) animalEntry;
        return primary.equals(animal.primary) && secondary.equals(animal.secondary) && finalType.equals(animal.finalType);
    }
}
