package com.hms.service;
import com.hms.model.Company;
import com.hms.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class CompanyServiceImpl implements CompanyService{

        @Autowired
        private CompanyRepo companyRepo;

        @Override
        public Company saveCompany(Company company) { return companyRepo.save(company); }

        @Override
        public List<Company> fetchCompanyList() {
            return companyRepo.findAll();
        }

        @Override
        public Company fetchCompanyById(int companyId) {
            return companyRepo.findById(String.valueOf(companyId)).get();
        }

        @Override
        public void deleteById(int companyId) { companyRepo.deleteById(String.valueOf(companyId));}

        @Override
        public Company updateCompanyById(int companyId, Company company) {
            Company updateCompanyDB = companyRepo.findById(String.valueOf(companyId)).get();

            if (Objects.nonNull(company.getCompanyName()) && !"".equalsIgnoreCase(company.getCompanyName())) {
                updateCompanyDB.setCompanyName(company.getCompanyName());
            }

            return companyRepo.save(updateCompanyDB);

        }

    }



