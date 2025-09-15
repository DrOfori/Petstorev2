package PetStore;

class Dog extends Pet {
    public Dog(String name, String species){
        super(name, species);


    }

    @Override
    public void sound(){
        System.out.println("Woof!");
    }
    @Override
    public String toString(){
        return ("Your pets name and species:\n" + name + " " + species);
    }
}
