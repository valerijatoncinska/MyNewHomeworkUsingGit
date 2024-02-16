package MyNewHomeworkUsingGit.l23.people;

public class Child extends Human {
    String schoolName;
    int grade;

    public Child(String name, String gender, int age, String schoolName, int grade) {
        super(name, gender, age);
        this.schoolName = schoolName;
        this.grade = grade;
    }

    public String toString() {
        return "Child. Name is " + this.name + "Is a " + this.gender + ". Age is " + this.age +
                ". Goes to school called " + this.schoolName + " Is in " + this.grade + " grade";
    }

    protected void occupation (){
        super.occupation();
        System.out.println(this.name + " is studying\n");
    }
}
