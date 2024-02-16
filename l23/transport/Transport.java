package MyNewHomeworkUsingGit.l23.transport;

public class Transport {
    String manufacturer;
    String condition;

    public Transport(String name, String condition) {
        this.manufacturer = name;
        this.condition = condition;
    }

    protected void specialThingsItCanDo(){
        System.out.println("Random purpose");
    }
}