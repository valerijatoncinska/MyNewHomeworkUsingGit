package MyNewHomeworkUsingGit.l17.animal;

public class Dog extends Animal {
    String favouriteToy;
    int destroyedCouchesCount;
    int stolenFoodCount;

    public Dog(String name, int age, String breed, String favouriteToy, int destroyedCouchesCount, int stolenFoodCount) {
        super(name, age, breed);
        this.favouriteToy = favouriteToy;
        this.destroyedCouchesCount = destroyedCouchesCount;
        this.stolenFoodCount = stolenFoodCount;
    }

    public String toString() {
        return "Dog. Name is " + this.name + ". Age is " + this.age + ". Breed is " + this.breed + ". Favourite toy " +
                this.favouriteToy + ". Amount of destroyed couches is " + this.destroyedCouchesCount +
                ". Amount of successful food thefts is " + this.stolenFoodCount + ".";
    }
}