package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private CompanyFacade companyFacade;

    @Autowired
    private EmployeeFacade employeeFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;


    @Test
    void testGetCompaniesByNameFragment() {
        //Given
        Company company1 = new Company("General Motors");
        companyDao.save(company1);
        int id = company1.getId();
        //When
        String expectedString = companyFacade.getCompaniesBy("oto").get(0).getName();
        //Then
        assertEquals("General Motors", expectedString);
        //CleanUp
        try {
            companyDao.deleteById(id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    void testGetEmployeesByNameFragment() {
        //Given
        Employee employee1 = new Employee("Mariusz", "Kość");
        employeeDao.save(employee1);
        int id = employee1.getId();
        //When
        String expectedString = employeeFacade.getEmployeesBy("ość").get(0).getLastname();
        //Then
        assertEquals("Kość", expectedString);
        //CleanUp
        try {
            employeeDao.deleteById(id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
