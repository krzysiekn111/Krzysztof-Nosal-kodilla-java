package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    @Autowired
    private final CompanyDao companyDB;

    @Autowired
    public CompanyFacade(CompanyDao companyDB) {
        this.companyDB = companyDB;
    }

    public List<Company> getCompaniesBy(String fragment) {
        return companyDB.findCompanyByNameFragment("%" + fragment + "%");
    }
}