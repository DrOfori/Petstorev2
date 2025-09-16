package PetStore;

class Cat extends Pet {
    public Cat(String name, String species){
        super(name, species);
    }

    @Override
    public void sound(){
        System.out.println("Meow!");
    }
    @Override
    public String toString(){
        return ("Your pets name and species:\n" + name + ", " + species);
    }

}

