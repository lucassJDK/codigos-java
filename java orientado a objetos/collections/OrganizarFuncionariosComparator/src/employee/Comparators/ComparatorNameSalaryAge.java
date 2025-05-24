package employee.Comparators;

import employee.Employee;

import java.util.Comparator;

public class ComparatorNameSalaryAge implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int compareName = o1.getEMPLOYEE_NAME().compareTo(o2.getEMPLOYEE_NAME());

        if (compareName != 0) {
            return compareName;
        }
        int compareSalary = Double.compare(
                o1.getEMPLOYEE_SALARY(),
                o2.getEMPLOYEE_SALARY()
        );

        if(compareSalary != 0) {
            return Double.compare(
                    o2.getEMPLOYEE_SALARY(),
                    o1.getEMPLOYEE_SALARY()
            );
        }
        int compareAge = Double.compare(o1.getEMPLOYEE_AGE(),
                o2.getEMPLOYEE_AGE()
        );

        if(compareAge != 0) {
            return compareAge;
        }
        return compareName;

    }
}
