package designpatterns.structuralpatterns.adapter;

import java.util.*;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234", "JOhn", "Wick", "john@wick.com");
        employees.add(employeeFromDB);

        // You cannot do this without adapter
        //Employee employeeFromLdap = new EmployeeLdap("chewie","solo","Han","han@solo.com");

        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie","solo","Han","han@solo.com");

        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
        employees.add(new EmployeeAdapterCSV(employeeCSV));
        return employees;
    }
}
