package MyNewHomeworkUsingGit.l23.animal;

public class Animal {
    String name;
    int age;
    String breed;

    public Animal (String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    protected void makesSound (){
        System.out.println(this.name + " makes a random sound\n");
    }
}
