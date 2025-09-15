package PetStore;

public class Lizard {
    private String sound;

    public Lizard(String name, String sound);{
        this.sound = "Hiss";


    }

    @Override
    public String toString(){return "Cat: " + sound;

    }


}
