package MyNewHomeworkUsingGit.l17.animal;

public class Cat extends Animal {
    String meowsALotOrNo;
    int destroyedVasesCount;
    int stolenFoodCount;

    public Cat(String name, int age, String breed, String meowsALotOrNo, int destroyedVasesCount, int stolenFoodCount) {
        super(name, age, breed);
        this.meowsALotOrNo = meowsALotOrNo;
        this.destroyedVasesCount = destroyedVasesCount;
        this.stolenFoodCount = stolenFoodCount;
    }

    public String toString() {
        return "Cat. Name is " + this.name + ". Age is " + this.age + ". Breed is " + this.breed + ". Does it meow a lot? - " +
                this.meowsALotOrNo + ". Amount of destroyed vases is " + this.destroyedVasesCount +
                ". Amount of successful food thefts is " + this.stolenFoodCount + ".";
    }
}