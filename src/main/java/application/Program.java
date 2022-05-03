package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Employee> employeesList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int qtdEmp = sc.nextInt();

        //List add employees
        for (int i = 1; i <= qtdEmp ; i++) {

            Employee employee = new Employee();
            System.out.printf("\nEmployee #%d:",i);

            System.out.print("\nId: ");
            employee.setId(sc.nextInt());
            sc.nextLine();

            System.out.print("Name: ");
            employee.setName( sc.nextLine());

            System.out.print("Salary: ");
            employee.setSalary(sc.nextDouble());

            employeesList.add(employee);
        }


        System.out.print("\nEnter the employee id that will have salary increase: ");
        int searchID = sc.nextInt();
        boolean flag = false;

        //Searching the given id in the employeeList
        for (Employee employee : employeesList) {
            if (employee.getId() == searchID) {
                System.out.print("Enter the percentage: ");
                employee.increaseSalary(sc.nextDouble());
                flag = true;
            }
        }
        if(!flag){
            System.out.println("This id does not exist!");
        }

        //displaying the list.
        System.out.println("\n\nList of employees:");
        for (Employee employee: employeesList) {
            System.out.println(employee.toString());
        }
        sc.close();
    }
}
