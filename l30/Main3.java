package MyNewHomeworkUsingGit.l30;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

class Main3 {
    public static void main(String[] args) {
        Calculator add = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        Calculator subtract = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };

        add.operate(2, 3);
        subtract.operate(4, 2);

    }
}