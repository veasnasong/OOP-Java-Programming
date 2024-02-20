package Create_Class;

import Create_Class.Dog;

public class Main {
    public static void main(String[] args) {
       Dog dog1 = new Dog();
        System.out.println("==========================\n");
        dog1.Bark();
        dog1.sleep();
        System.out.println("Name: "+ dog1.name);
        System.out.println("Age: "+ dog1.age);
        System.out.println("Color: "+ dog1.color);
        System.out.println("==========================\n");

        Dog dog2 =new Dog();
        System.out.println("==========================\n");
        dog2.Bark();
        dog2.sleep();
        dog2.eat();
        System.out.println("Name: "+ dog2.name);
        System.out.println("Age: "+ dog2.age);
        System.out.println("Color: "+ dog2.color);
        System.out.println("==========================\n");






    }
}