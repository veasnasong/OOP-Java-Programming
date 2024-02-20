package Constructor;

public class Main {
    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println("Year: "+obj.YearCar);
        System.out.println("Model:"+ obj.ModelCar);
        System.out.println("==============================");
        Car obj1 =new Car(2024, "BMW");
        System.out.println("Year: "+ obj1.YearCar);
        System.out.println("Model: "+ obj1.ModelCar);
        System.out.println("===============================\n");
        Car obj2 =new Car(2022, "Ford");
        System.out.println("Year: "+ obj2.YearCar);
        System.out.println("Model: "+ obj2.ModelCar);
        System.out.println("===============================");


    }
}
