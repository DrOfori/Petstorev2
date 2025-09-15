package PetStore;

class Lizard extends Pet {
    public Lizard(String name, String species){
        super(name, species);
    }

    @Override
    public void sound(){
        System.out.println("Hiss!");
    }

}
