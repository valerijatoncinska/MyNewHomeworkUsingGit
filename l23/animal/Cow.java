package MyNewHomeworkUsingGit.l23.animal;

public class Cow extends Animal {
    String favouriteFood;
    int yearsOnTheFarm;

    public Cow(String name, int age, String breed, String favouriteFood, int yearsOnTheFarm) {
        super(name, age, breed);
        this.favouriteFood = favouriteFood;
        this.yearsOnTheFarm = yearsOnTheFarm;
    }

    public String toString() {
        return "Cow. Name is " + this.name + ". Age is " + this.age + ". Breed is " + this.breed + ". Favourite food is " +
                this.favouriteFood + ". Amount of years lived on this farm is " + this.yearsOnTheFarm;
    }

    protected void makesSound (){
        super.makesSound();
        System.out.println(this.name + " is mooing\n");
    }
}