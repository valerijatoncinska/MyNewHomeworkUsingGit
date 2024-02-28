package MyNewHomeworkUsingGit.l31;

public interface CalculatorInterface {

    int operate(int a, int b);
}

class Main99 {
    public static void main(String[] args) {
        // переопределение метода operate для получения метода сложения
        CalculatorInterface add = new CalculatorInterface() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        // переопределение метода operate для получения метода вычитания
        CalculatorInterface subtract = new CalculatorInterface() {
            @Override
            public int operate(int a, int b) {

                return a - b;
            }
        };
        // переопределение метода operate для получения метода умножения
        CalculatorInterface multiply = new CalculatorInterface() {
            @Override
            public int operate(int a, int b) {

                return a * b;
            }
        };
        // переопределение метода operate для получения метода деления
        CalculatorInterface divide = new CalculatorInterface() {
            @Override
            public int operate(int a, int b) {

                return a / b;
            }
        };

        // переопределение результатов всех 4-х методов в отдельные переменные
        int resultAdd = add.operate(3,4);
        int resultSubtract = subtract.operate(9,4);
        int resultMultiply = multiply.operate(12,4);
        int resultDivide = divide.operate(8, 2);

        // вынесение результатов в консоль
        System.out.println(
                "3 + 4 = " + resultAdd + "\n" +
                        "9 - 4 = " + resultSubtract + "\n" +
                        "12 x 4 = " + resultMultiply + "\n" +
                        "8 / 2 = " + resultDivide + "\n"
        );
    }
}

class Main66 {
    public static void main(String[] args) {

        // определение новых лямбд для сложения, вычитания, умножения и деления
        CalculatorInterface add = (a,b) -> a + b;
        CalculatorInterface subtract = (a,b) -> a - b;
        CalculatorInterface multiply = (a,b) -> a * b;
        CalculatorInterface divide = (a,b) -> a / b;

        // вынесение результатов в консоль
        System.out.println(
                "3 + 4 = " + add.operate(3,4) + "\n" +
                        "9 - 4 = " + subtract.operate(9,4) + "\n" +
                        "12 x 4 = " + multiply.operate(12,4) + "\n" +
                        "8 / 2 = " + divide.operate(8,2) + "\n"
        );

    }
}