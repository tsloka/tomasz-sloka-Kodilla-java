package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;

import java.util.List;

public class EmployeeOrCompany {
    private List<Employee> employees;
    private List<Company> companies;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employees = employeeList;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
