package Constructor;

public class MainEmp {
    public static void main(String[] args) {
        Employee emp =new Employee(1, "Dara", "Som", 1200);
        System.out.println("ID: "+emp.getId());
        System.out.println("First Name: " +emp.getFirstrname());
        System.out.println("Last Name: " +emp.getLastname());
        System.out.println("Full Name: " +emp.getName());
        System.out.println("Salary: " +emp.getSalary());
        System.out.println("Annul Salary: " + emp.getAnnualSalary());
        System.out.println("Raise Salary: " + emp.raiseSalary(10));
        System.out.println("______________________________________________");
        Employee emp1 = new Employee(2, "Veasna", "Song", 800);

        System.out.println("ID: "+emp1.getId());
        System.out.println("First Name: " +emp1.getFirstrname());
        System.out.println("Last Name: " +emp1.getLastname());
        System.out.println("Full Name: " +emp1.getName());
        System.out.println("Salary: " +emp1.getSalary());
        System.out.println("Annul Salary: " + emp1.getAnnualSalary());
        System.out.println("Raise Salary: " + emp1.raiseSalary(20));



    }
}
