package Constructor;

import java.util.SplittableRandom;

public class Employee {
    private int id;
    private String firstrname;
    private String lastname;
    private int salary;

    public Employee(int id, String lastname, String firstrname, int salary) {
        this.id = id;
        this.firstrname = firstrname;
        this.lastname = lastname;
        this.salary = salary;


    }

    public int getId() {
        return this.id;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getFirstrname() {
        return this.firstrname;
    }

    public String getName() {
        return this.firstrname + " " + lastname;
    }

    public int getSalary() {
        return salary;

    }

    public void setSalary(int salary) {
        this.salary = salary;

    }

    public int getAnnualSalary() {
        return this.salary = salary*12;

    }
    public int raiseSalary(int percent){
        return  (salary * percent)/100+salary;

    }
    public String toString(){
        return "Employee [ id: " +this.id + ",Name: " + this.getName() + "Salary: " + this.salary + "]";
    }
    public void println(){
        this.getId();
        this.getName();

    }



}
