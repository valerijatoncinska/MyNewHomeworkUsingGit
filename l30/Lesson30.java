package MyNewHomeworkUsingGit.l30;

interface Greeting {
    void sayHello();

    void sayGoodbye();
}

class Main1 {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Привет из анонимного класса!");
            }

            @Override
            public void sayGoodbye() {
                System.out.println("Пока из анонимного класса!");
            }
        };

        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Здравствуйте!");
            }

            @Override
            public void sayGoodbye() {
                System.out.println("До скорой встречи!");
            }
        };

        Greeting greeting3 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Здарова!");
            }

            @Override
            public void sayGoodbye() {
                System.out.println("Покедова!");
            }
        };

        greeting.sayHello();
        greeting2.sayHello();
        greeting3.sayHello();
        greeting.sayGoodbye();
        greeting2.sayGoodbye();
        greeting3.sayGoodbye();
    }
}
