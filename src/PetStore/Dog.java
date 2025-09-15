package PetStore;

class Dog extends Pet {
    public Dog(String name, String species){
        super(name, species);
    }

    @Override
    public void sound(){
        System.out.println("Woof!");
    }

}
