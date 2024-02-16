package MyNewHomeworkUsingGit.l23.people;
public class Old extends Human {
    String isGrumpyOrNo;
    int pension;

    public Old(String name, String gender, int age, String isGrumpyOrNo, int pension){
        super(name, gender, age);
        this.isGrumpyOrNo = isGrumpyOrNo;
        this.pension = pension;
    }

    public String toString() {
        return "Old human. Name is " + this.name + "Is a " + this.gender + ". Age is " + this.age +
                ". Are they grumpy? - " + this.isGrumpyOrNo + "The pension is " + this.pension + " EURO";
    }

    protected void occupation (){
        super.occupation();
        System.out.println(this.name + " is relaxing\n");
    }
}