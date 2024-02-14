package MyNewHomeworkUsingGit.l17;

import MyNewHomeworkUsingGit.l17.animal.Cat;
import MyNewHomeworkUsingGit.l17.animal.Cow;
import MyNewHomeworkUsingGit.l17.animal.Dog;
import MyNewHomeworkUsingGit.l17.people.Old;
import MyNewHomeworkUsingGit.l17.people.Adult;
import MyNewHomeworkUsingGit.l17.people.Child;
import MyNewHomeworkUsingGit.l17.transport.Bike;
import MyNewHomeworkUsingGit.l17.transport.Bus;
import MyNewHomeworkUsingGit.l17.transport.Car;
import MyNewHomeworkUsingGit.l17.transport.MyCarList;
import org.junit.jupiter.api.Assertions;

public class L17Main {
    public static void main(String[] args) {

        Cat simon = new Cat("Simon", 2, "a Bengal", "Yes", 8, 5);
        System.out.println(simon);

        Cat pumpkin = new Cat("Pumpkin", 5, "an American Wirehair", "No", 1, 0);
        System.out.println(pumpkin);

        Cow burionka = new Cow("Burionka", 5, "a Brown Swiss", "Corn", 5);
        System.out.println(burionka);

        Cow strawberry = new Cow("Strawberry", 2, "a Shorthorn", "Apple", 2);
        System.out.println(strawberry);

        Dog luna = new Dog("Luna", 6, "a pug", "a stuffed rabbit", 0, 12);
        System.out.println(luna);

        Dog bobik = new Dog("Bobik", 3, "a husky", "a ball", 1, 4);
        System.out.println(bobik);

        Adult mike = new Adult("Mike", "male", 22, "Server", "Piano");
        System.out.println(mike);

        Adult abby = new Adult("Abby", "female", 32, "Engineer", "TTRPG");
        System.out.println(abby);

        Old peter = new Old("Peter", "male", 70, "yes", 999999);
        System.out.println(peter);

        Old rose = new Old("Rose", "female", 76, "no", 996699);
        System.out.println(rose);

        Child kirill = new Child("Kirill", "male", 7, "4th Primary School", 1);
        System.out.println(kirill);

        Child mary = new Child("Mary", "female", 8, "17th Primary School", 2);
        System.out.println(mary);

        Bike bajaj = new Bike("bajaj", "broken", "Mike");
        System.out.println(bajaj);

        Bike yamaha = new Bike("yamaha", "new", "Abby");
        System.out.println(yamaha);

        Bus yutong = new Bus("yutong", "almost new", "school trips", 33);
        System.out.println(yutong);

        Bus daimler = new Bus("daimler", "almost broken", "tourism", 41);
        System.out.println(daimler);

        Car volvo = new Car("volvo", "broken", "Thomson", 5);
        Car bMW = new Car("BMW", "new", "Smith", 2);
        Car toyota = new Car("toyota", "almost new", "Brown", 6);
        Car bentley = new Car("bentley", "new", "Davis", 3);
        Car honda = new Car("honda", "almost broken", "Jones", 4);

        MyCarList aLotOfCars = new MyCarList();

        aLotOfCars.addCar(volvo);
        aLotOfCars.addCar(bMW);
        aLotOfCars.addCar(toyota);
        aLotOfCars.addCar(bentley);
        aLotOfCars.addCar(honda);

        aLotOfCars.printTheList();


    }
}