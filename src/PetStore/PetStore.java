package PetStore;

import java.util.Scanner;

public class PetStore {
    public static void main(String[] args) {
    welcomeMessage();
    registerPet();
    }

    private static void welcomeMessage() {
        System.out.println("Welcome to the Pet Store");
        System.out.println("Let's register some animals!");
        System.out.println("How many pets do you want to register?");
    }

    private static void registerPet(){
    Scanner scanner = new Scanner(System.in);
    int numberOfPets = scanner.nextInt();
    scanner.nextLine();

    Pet[] pets = new Pet[numberOfPets];

    for (int i = 0; i < numberOfPets; i++) {
        System.out.println("Enter the name of pet #" + (i + 1) + ": ");
        String name = scanner.nextLine();
        System.out.println("Enter the species of pet #" + (i + 1) + ": ");
        String species = scanner.nextLine();
        if(species == "Dog") {
            pets[i] = new Dog(name, species);
        } else if (species == "Lizard") {
            pets[i] = new Lizard(name, species);
        } else if (species == "Cat") {
            pets[i] = new Cat(name, species);
        }
    }
    System.out.println("--- Pets Registered ---");
        if (pets instanceof Dog[]) {
            Dog.toString();
            Dog.sound();
        } else if (pets instanceof Lizard[]) {
            Lizard.toString();
            Lizard.sound();
        } else if (pets instanceof Cat[]) {
            Cat.toString();
            Cat.sound();
    }
}}
