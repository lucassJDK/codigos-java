package employee;

public class Employee implements Comparable<Employee>{
    private final String EMPLOYEE_NAME;
    private final double EMPLOYEE_SALARY;
    private final int EMPLOYEE_AGE;

    public Employee(String employeeName, double employeeSalary, int employeeAge) {
        EMPLOYEE_NAME = employeeName;
        EMPLOYEE_SALARY = employeeSalary;
        EMPLOYEE_AGE = employeeAge;
    }

    public String getEMPLOYEE_NAME() {
        return EMPLOYEE_NAME;
    }

    public double getEMPLOYEE_SALARY() {
        return EMPLOYEE_SALARY;
    }

    public int getEMPLOYEE_AGE() {
        return EMPLOYEE_AGE;
    }

    @Override
    public int compareTo(Employee o) {
        return EMPLOYEE_NAME.compareTo(o.getEMPLOYEE_NAME());
    }
}
