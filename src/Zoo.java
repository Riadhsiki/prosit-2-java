public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int currentCageIndex;
    int nbrAnimal;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.currentCageIndex = 0;
        this.animals = new Animal[nbrCages];
    }


    public void displayZOO() {
        System.out.println("Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages);
    }
    boolean addAnimal(Animal animal) {
        if (currentCageIndex < nbrCages) {
            animals[currentCageIndex] = animal;
            nbrAnimal++;
            currentCageIndex++;
            return true;
        } else {
            System.out.println("No more cages available!");
            return false;
        }
    }


    void displayAnimals() {
        System.out.println("Animals in the zoo:");
        for (int i = 0; i < currentCageIndex; i++) {
            System.out.println(animals[i].name + " (Family: " + animals[i].family + ", Age: " + animals[i].age + ", Mammal: " + animals[i].isMammal + ")");
        }
    }
    int searchAnimal(Animal animal) {

        for (int i = 0; i < currentCageIndex; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
}
