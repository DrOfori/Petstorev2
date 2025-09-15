package PetStore;

 class Dog extends Pet {
    private String sound;

    public Dog(String name, String sound);{
        super(name, sound);
        this.sound = "Vuf";


    }

    @Override
    public String toString(){return "Dog: " + sound;

    }

}

