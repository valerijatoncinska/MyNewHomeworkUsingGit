package MyNewHomeworkUsingGit.l17.transport;

import java.util.Arrays;

public class MyCarList {

    Car[] carList;
    int carListInitialSize = 5;
    private int count = 0;

    public MyCarList() {
        carList= new Car[carListInitialSize];
    }

    public void addCar(Car myCar){
        carList[count] = myCar;
        count++;
    }

    public Car getCar (int index){
        return carList[index];
    }

    public void printTheList(){
        for (count = 0; count < carListInitialSize; count++){
            System.out.println(getCar(count));
        }
    }
    public String toString() {
        return Arrays.toString(this.carList);
    }

}