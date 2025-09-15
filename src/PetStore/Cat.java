package PetStore;

public class Cat {
    private String sound;

    public Cat(String name, String sound);{
        this.sound = "Meow";


    }

    @Override
    public String toString(){return "Cat: " + sound;

    }

}
