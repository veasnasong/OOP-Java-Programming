package Encapsulation;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        //Method set from user
        user.setId(1);
        user.setUsername("Sna");
        user.setEmail("veasnaloyloyloy@gmail.com");
        user.setPassword("sna123");
        //Method get from uer
        System.out.println("ID: " +user.getId());
        System.out.println("Username: "+ user.getUsername());
        System.out.println("Email: "+ user.getEmail());
        System.out.println("Password: "+ user.getPassword());
        System.out.println("_________________________________");
        user.setId(2);
        user.setUsername("Ny");
        user.setEmail("ranyloyloyloy@gmail.com");
        user.setPassword("ny");
        System.out.println("ID: " +user.getId());
        System.out.println("Username: "+ user.getUsername());
        System.out.println("Email: "+ user.getEmail());
        System.out.println("Password: "+ user.getPassword());


    }
}
