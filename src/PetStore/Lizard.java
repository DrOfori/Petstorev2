package PetStore;

class Lizard extends Pet{
    private String sound;

    public Lizard(String name, String sound);{
        super(name, sound);
        this.sound = "Hiss";


    }

    @Override
    public String toString(){return "Cat: " + sound;

    }


}
