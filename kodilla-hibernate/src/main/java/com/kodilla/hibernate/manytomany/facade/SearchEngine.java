package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchEngine {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    public EmployeeOrCompany searchForEmployeeOrCompany(SearchObject searchObject, String searchString) {
        EmployeeOrCompany returnObject = new EmployeeOrCompany();
        if (searchObject.equals(SearchObject.EMPLOYEE)) {
            returnObject.setEmployeeList(employeeDao.getNameWithFragmentParameter(searchString));
        } else {
            returnObject.setCompanies(companyDao.getNameWithFragmentParameter(searchString));
        }
        return returnObject;
    }
}
