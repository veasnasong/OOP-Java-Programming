package Inheritence;

public class Main {
    public static void main(String[] args) {

        Animal obj = new Animal();
        obj.eat();;
        obj.sleep();

        System.out.println("===============================\n");
        System.out.println("reptile Child of Animal..");
        Reptile obj1 = new Reptile();
        obj1.eat();
        obj1.sleep();
        obj1.Crawl();
        System.out.println("===============================\n");
        Mammal obj2 = new Mammal();
        obj2.Breastfeed();
        obj2.eat();
        obj2.sleep();
        System.out.println("===============================\n");
        Human obj3 = new Human();
        obj3.speak();
        obj3.walk();
        obj3.watch();
        obj3.sleep();
        obj3.eat();
        obj3.Breastfeed();


    }

}
