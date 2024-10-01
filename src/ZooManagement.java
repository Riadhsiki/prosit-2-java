public class ZooManagement {
    public static void main(String[] args) {

        Animal lion = new Animal("Felidae", "Lion", 1, true);

        Animal dog = new Animal("Dogs", "dog A", 2, false);

        Zoo myZOO = new Zoo(" Park K", "SWIZERLAND", 25);


        myZOO.displayZOO();

        myZOO.addAnimal(dog);
        myZOO.addAnimal(lion);
        myZOO.displayAnimals();



        Animal animal = new Animal();
        animal.name = "cat1";

        int index = myZOO.searchAnimal(animal);
        if (index != -1) {
            System.out.println("Animal trouvé à la cage numéro " + (index + 1));
        } else {
            System.out.println("Animal non trouvé dans le zoo.");
        }


    }
}
