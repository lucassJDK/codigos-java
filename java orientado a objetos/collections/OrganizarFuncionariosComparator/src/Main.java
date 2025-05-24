import employee.Comparators.ComparatorNameSalaryAge;
import employee.Employee;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Employee> employees = Arrays.asList(
                new Employee("Carlos",1400,20),
                new Employee("Ana",2200,25),
                new Employee("Ana",3000,19),
                new Employee("Felipe",5000,47),
                new Employee("José",5000,21)
        );
        employees.sort(new ComparatorNameSalaryAge());
        Main.printSortedList(employees);
    }
    protected static void printSortedList(List<Employee> employees) {
        for(Employee employee : employees) {
            System.out.printf("%s:R$ %.2f idade:%d %n",
                    employee.getEMPLOYEE_NAME(),
                    employee.getEMPLOYEE_SALARY(),
                    employee.getEMPLOYEE_AGE());
        }
    }
}
