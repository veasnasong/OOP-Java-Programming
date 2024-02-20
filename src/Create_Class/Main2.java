package Create_Class;

public class Main2 {
    public static void main(String[] args) {
        Person2 person = new Person2();
        person.Register("Sna", "veasnanoslo@gmail.com", "Student", "Sna123");
        person.getinfo();
        System.out.println("==================================");
        Person2 person1 = new Person2();
        person1.Register("Ny", "Marany@gmail.com", "Student", "ny123");
        person1.getinfo();
        System.out.println("==================================");


    }
}
