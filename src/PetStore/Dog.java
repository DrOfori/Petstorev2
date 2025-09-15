package PetStore;

public class Dog {
    private String sound;

    public Dog(String name, String sound);{
        this.sound = "Vuf";


    }

    @Override
    public String toString(){return "Dog: " + sound;

    }

}
}
