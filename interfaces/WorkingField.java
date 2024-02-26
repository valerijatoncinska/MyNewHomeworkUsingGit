package MyNewHomeworkUsingGit.interfaces;

public class WorkingField {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.draw();
        Square s1 = new Square();
        s1.draw();

        Triangle t1 = new Triangle();
        t1.print();
        Oval o1 = new Oval();
        o1.print();

        AbstractCircleExample c2 = new AbstractCircleExample("Abstract Circle number 1", 12, 11);
        c2.draw();
        c2.getArea();
        c2.getPerimeter();

        AbstractCircleExample c3 = new AbstractCircleExample("Abstract Circle number 2", 6, 6);
        c3.draw();
        c3.getArea();
        c3.getPerimeter();

        AbstractSquareExample s2 = new AbstractSquareExample("Abstract Square number 1", 12, 11);
        s2.draw();
        s2.getArea();
        s2.getPerimeter();

        AbstractSquareExample s3 = new AbstractSquareExample("Abstract Square number 1", 20, 11);
        s3.draw();
        s3.getArea();
        s3.getPerimeter();

    }
}