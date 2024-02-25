package MyNewHomeworkUsingGit.interfaces;

abstract public class AbstractFigures {
    String name;
    int sideX;
    int sideY;

    public AbstractFigures(String name, int sideX, int sideY) {
        this.name = name;
        this.sideX = sideX;
        this.sideY = sideY;
    }

    abstract void draw();
    abstract void getPerimetr();
    abstract void getArea();

    public String toString(){
        return name + ", " + sideX + ", " + sideY;
    }
}

class AbstractCircleExample extends AbstractFigures {
    public AbstractCircleExample(String name, int sideX, int sideY) {
        super(name, sideX, sideY);
    }

    double pNumber = 3.14;
    double radius = sideX;

    @Override
    void draw() {
        System.out.println("I draw a circle");
    }

    @Override
    void getPerimetr() {
        System.out.println("The perimeter of this circle is " + (2 * pNumber * radius));
    }

    @Override
    void getArea() {
        System.out.println("The area of this circle is " + pNumber * radius * radius);
    }
}

class AbstractSquareExample extends AbstractFigures {
    public AbstractSquareExample(String name, int sideX, int sideY) {
        super(name, sideX, sideY);
    }

    @Override
    void draw() {
        System.out.println("I draw a square");
    }

    @Override
    void getPerimetr() {
        System.out.println("The perimeter of this square is " + sideX * 4);
    }

    @Override
    void getArea() {
        System.out.println("The area of this square is " + sideX * sideX);
    }
}