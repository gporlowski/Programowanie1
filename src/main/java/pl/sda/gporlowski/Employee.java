package pl.sda.gporlowski;

public class Employee {
    private String name;
    private String peselNumber;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String peselNumber, int salary) {
        this.name = name;
        this.peselNumber = peselNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public int getSalary() {
        return salary;
    }
}
