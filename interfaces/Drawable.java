package MyNewHomeworkUsingGit.interfaces;

public interface Drawable {
    void draw();
}

class Circle implements Drawable{
    @Override
    public void draw(){
        System.out.println("Draw circle");
    }
}

class Square implements Drawable{
    @Override
    public void draw(){
        System.out.println("Draw square");
    }
}

