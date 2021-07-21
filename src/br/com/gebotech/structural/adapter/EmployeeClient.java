package br.com.gebotech.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList(){

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234","John","Wick","john@gmail.com");

        employees.add(employeeFromDB);

        EmployeeLdap employeeFromLdap = new EmployeeLdap("456", "Solo","Chewie","chewie@gmail.com");

        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        return employees;
    }





}
