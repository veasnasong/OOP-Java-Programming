package Constructor;

public class Car {
    int YearCar;
    String ModelCar;

    public Car(){
        YearCar  = 1992;
        ModelCar = "Mustang";
    }
    //Constructor have parameter
    public Car(int year, String model){
        YearCar = year;
        ModelCar = model;
    }
}
