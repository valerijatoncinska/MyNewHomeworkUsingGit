package MyNewHomeworkUsingGit.l17.people;

public class Adult extends Human {
    String job;
    String hobby;

    public Adult(String name, String gender, int age, String job, String hobby) {
        super(name, gender, age);
        this.job = job;
        this.hobby = hobby;
    }

    public String toString() {
        return "Adult human. Name is " + this.name + "Is a " + this.gender + ". Age is " + this.age +
                ". Job is " + this.job + " Hobby is " + this.hobby;
    }
}
