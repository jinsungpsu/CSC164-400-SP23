public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Caninus Maximus");
        Dog someDog = new Dog(true);

        System.out.println(animal);

        System.out.println(someDog);

        Animal someAnimal = new Dog(true);
        someAnimal = animal;
        someAnimal = someDog;

        Object someObject;
        someObject = animal;
        someObject = someAnimal;
        someObject = someDog;

        Object[] stuff;

        Animal[] zoo = {animal,someDog,someAnimal};

        for (Animal each: zoo) {
            System.out.println("Animal speaking is: " + each);
            each.speak();
            if (each instanceof Dog) {
                if (((Dog)each).isWagging()) {

                }
            }
        }


    }

}

class Animal {
    String species;

    public void speak() {
        System.out.println("hi!");
    }

    public Animal(String species) {
        this.species = species;
    }

    public String toString() {
        return "this animal's species is: " + species + " object info: " + super.toString();
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}

class Dog extends Animal {
    boolean wagging;

    public void speak() {
        System.out.println("woof");
    }

    public boolean isWagging() {
        return wagging;
    }

    public void setWagging(boolean wagging) {
        this.wagging = wagging;
    }

    public Dog(boolean wagging) {
        super("default species name");
        this.wagging = wagging;
    }

    public String toString() {
        return super.toString()
                + " and this dog's tail is wagging: " + wagging ;
    }
}
