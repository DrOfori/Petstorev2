package PetStore;

import java.util.Scanner;

public class PetStore {
    public static void main(String[] args) {

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
        System.out.println("Enter the name pet " + (i + 1) + ": ");
        String name = scanner.nextLine();
        pets[i] = new Pet[name];

    }
    }
}
