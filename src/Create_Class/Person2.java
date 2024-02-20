package Create_Class;

public class Person2 {
    public String Username;
    private String Email;
    protected String Role;
    String Password;

     void Register(String name, String email, String role, String password){
         Username = name;
         Email=email;
         Role = role;
         Password = password;

    }
    public void getinfo(){
        System.out.println("Name: "+ Username);
        System.out.println("Email: "+ Email);
        System.out.println("Role: "+ Role);
        System.out.println("Password: "+ Password);

    }
}
