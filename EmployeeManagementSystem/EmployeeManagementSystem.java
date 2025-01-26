package EmployeeManagementSystem;

import java.util.*;

class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee fullTime1 = new FullTimeEmployee("FT26451", "Aryan", 120564, 134656);
        fullTime1.assignDepartment("Manager");
        employees.add(fullTime1);

        FullTimeEmployee fullTime2 = new FullTimeEmployee("FT62345", "Zaid", 165565, 126565);
        fullTime2.assignDepartment("Developer");
        employees.add(fullTime2);

        PartTimeEmployee partTime1 = new PartTimeEmployee("PT54133", "Sameer", 54651, 120);
        partTime1.assignDepartment("Developer");
        employees.add(partTime1);

        PartTimeEmployee partTime2 = new PartTimeEmployee("PT61564", "Naman", 56413, 106);
        partTime2.assignDepartment("Intern");
        employees.add(partTime2);

        for(Employee employee: employees){
            employee.displayDetails();
            if(employee instanceof Department){
                System.out.println(((Department) employee).getDepartment());
            }
        }
    }
}
