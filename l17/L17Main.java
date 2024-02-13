package MyNewHomeworkUsingGit.l17;
import MyNewHomeworkUsingGit.l17.animal.Cat;
import MyNewHomeworkUsingGit.l17.animal.Cow;
import MyNewHomeworkUsingGit.l17.animal.Dog;
import MyNewHomeworkUsingGit.l17.people.Man;
import MyNewHomeworkUsingGit.l17.transport.Bike;
import MyNewHomeworkUsingGit.l17.transport.Bus;
import MyNewHomeworkUsingGit.l17.transport.Car;
import MyNewHomeworkUsingGit.l17.transport.MyCarList;

public class L17Main {
    public static void main(String[] args) {

        Cat simon = new Cat("Simon", 12);
        System.out.println(simon);

        Cow burionka = new Cow ("Burionka", 12);
        System.out.println(burionka);

        Dog luna = new Dog ("Luna", 7);
        System.out.println(luna);

        Man karl = new Man("Karl", 99);
        System.out.println(karl);

        Man sabina = new Man("Sabina", 33);
        System.out.println(sabina);

        Bike bikeCompany = new Bike("WeMakeBikes!", 2);
        System.out.println(bikeCompany);

        Bus busCompany = new Bus("WeMakeBuses!", 4);
        System.out.println(busCompany);

        Car volvo = new Car("volvo", 99);
        Car bMW = new Car("bMW", 29);
        Car toyota = new Car("toyota", 989);
        Car bentley = new Car("bentley", 12);
        Car honda = new Car("honda", 1);

        MyCarList aLotOfCars = new MyCarList();

        aLotOfCars.addCar(volvo);
        aLotOfCars.addCar(bMW);
        aLotOfCars.addCar(toyota);
        aLotOfCars.addCar(bentley);
        aLotOfCars.addCar(honda);


        System.out.println(aLotOfCars);

    }
}
