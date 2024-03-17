package MyNewHomeworkUsingGit.consultations.cons11;

public enum Positions {
    ;
    private int x;
    private int y;

    Positions(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void move(int distance, Directions direction) {
        switch (direction) {
            case UP:
                y += distance;
                break;
            case DOWN:
                y -= distance;
                break;
            case RIGHT:
                x += distance;
                break;
            case LEFT:
                x -= distance;
                break;
        }
    }

    @Override
    public String toString() {
        return "Positions{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}


