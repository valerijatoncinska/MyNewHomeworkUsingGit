package MyNewHomeworkUsingGit.l23.people;

public class Human {
    String name;
    String gender;
    int age;
    public Human (String gender, String name, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    protected void occupation (){
        System.out.println("Exists");
    }
}
