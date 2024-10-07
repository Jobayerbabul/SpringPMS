package com.hms.service;
import com.hms.model.Company;

import java.util.List;

public interface CompanyService {
        public Company saveCompany(Company company);

        public List<Company> fetchCompanyList();

        public Company fetchCompanyById(int companyId);

        public void deleteById(int companyId);

        public Company updateCompanyById(int companyId, Company company);

    }


