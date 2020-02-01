package pl.sda.gporlowski;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PensionAnalyzerApp {
    public static void main(String[] args) {
        Employee kristoff = new Employee("Kristof", "123", 15000);
        Employee kasia = new Employee("Kasia", "324",25000);
        Employee grazynka = new Employee("Grażynka", "456",3500);
        Employee karol = new Employee("Karol", "433",13000);
        Employee zbigniew = new Employee("Zbigniew", "555",13000);
        Employee joanna = new Employee("Joanna", "322",1500);
        Employee aziz = new Employee("Aziz", "333",4999);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(kristoff);
        employeeList.add(kasia);
        employeeList.add(grazynka);
        employeeList.add(karol);
        employeeList.add(zbigniew);
        employeeList.add(joanna);
        employeeList.add(aziz);

        List<Employee> employeesToFired = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getSalary() < 10000) {
                employeesToFired.add(employee);
            }
        }

        System.out.println("\nEmployee to fired is: " + employeesToFired.get(employeeDismissalApplication(employeesToFired)).getName());

    }

    public static int employeeDismissalApplication(List<Employee> employees) {
        Random i = new Random();
        return i.nextInt(employees.size());
    }
}