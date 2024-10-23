package constructors;

// Parameterized Constructors

public class Animal {

    String animal_name;
    String anima_type;

    Animal(String name, String type) {
        animal_name = name;
        anima_type = type;
        System.out.println(animal_name + " is " + anima_type);
    }

    /*public void aboutAnimal() {
        System.out.println(animal_name + " is " + anima_type);
    }*/

    public static void main(String[] args) {
        Animal animal1 = new Animal("Tiger", "Omnivores");
       // animal1.aboutAnimal();
        Animal animal2 = new Animal("Cow", "Herbivores");
        //animal2.aboutAnimal();
    }
}

