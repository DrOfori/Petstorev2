package PetStore;

//Superklasse
class Pet {
    protected String name;
    protected String species;

    //Pet konstruktør
    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    //Getters
    public String getName(){return name;}
    public String getSpecies(){return species;}

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString(){
    return ("Your pets name and species:\n" + name + " " + species);
    }

    public void sound() {
        System.out.println("rawr");
    }
}
