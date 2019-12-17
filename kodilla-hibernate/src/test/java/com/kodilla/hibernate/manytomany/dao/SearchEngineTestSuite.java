package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.EmployeeOrCompany;
import com.kodilla.hibernate.manytomany.facade.SearchEngine;
import com.kodilla.hibernate.manytomany.facade.SearchObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchEngineTestSuite {
    @Autowired
    private SearchEngine searchEngine;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void companySearchTest() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        EmployeeOrCompany result = searchEngine
                .searchForEmployeeOrCompany(SearchObject.COMPANY, "ae");

        //Then
        Assert.assertEquals(result.getCompanies().get(0).getName(), dataMaesters.getName());
    }

    @Test
    public void employeeSearchTest() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        //When
        EmployeeOrCompany result = searchEngine
                .searchForEmployeeOrCompany(SearchObject.EMPLOYEE, "rc");

        //Then
        Assert.assertEquals(result.getEmployees().get(0).getLastname(), stephanieClarckson.getLastname());
    }

    @Test
    public void nullSearchResultTest() {
        //Given

        //When
        EmployeeOrCompany result = searchEngine
                .searchForEmployeeOrCompany(SearchObject.COMPANY, "YY");

        //Then
        Assert.assertTrue(result.getCompanies().isEmpty());
    }
}
