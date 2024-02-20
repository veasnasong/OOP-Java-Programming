package Inheritence.Override_Method;

public class Main {
    public static void main(String[] args) {
        Card obj = new Card();
        System.out.println(obj.message());
        obj.date();
        System.out.println("=====================\n");
        BirthdayCard obj1 = new BirthdayCard();
        System.out.println(obj1.message());
        obj1.birthday();
        System.out.println("=====================\n");
        Holiday obj2 = new Holiday();
        System.out.println(obj2.message());
        obj2.date();




    }
}
