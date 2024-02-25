package MyNewHomeworkUsingGit.interfaces;

public interface Printable {
    void print();
}

class Triangle implements Printable{
    @Override
    public void print (){
        System.out.println("Print Triangle");
    }
}

class Oval implements Printable{
    @Override
    public void print (){
        System.out.println("Print Oval");
    }
}
