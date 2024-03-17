package MyNewHomeworkUsingGit.LinkedList;

public class Cells {

    Cells next;
    Cells previous;
    int value;

    public Cells (int value){
        this.value = value;
    }

    public Cells getNext(){
        return next;
    }

    public Cells getPrevious(){
        return previous;
    }

    public void setNext(Cells next){
        this.next = next;
    }

    public void setPrevious(Cells next){
        this.previous = previous;
    }
}
