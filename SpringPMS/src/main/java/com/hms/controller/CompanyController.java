package com.hms.controller;
import com.hms.model.Company;
import com.hms.repository.CompanyRepo;
import com.hms.service.CompanyService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Getter
@Setter
@RestController

public class CompanyController {


        //
        @Autowired
        CompanyRepo companyRepo;
        //
        @Autowired //(required=true)
        private CompanyService companyService;

        @PostMapping("/companies")
        public Company saveCompany(@RequestBody Company company){
            return companyService.saveCompany(company);
        }

        @GetMapping("/companies")
        public List<Company> fetchCompanyList(){
            return companyService.fetchCompanyList();
        }

        @GetMapping("/companies/{id}")
        public Company fetchCompanyById(@PathVariable("id") int companyId ){
            return companyService.fetchCompanyById(companyId);
        }

        @DeleteMapping("/companies/{id}")
        public String deleteById(@PathVariable("id") int companyId){ companyService.deleteById(companyId);
            return "Deleted successfully!";
        }

        @PutMapping("/companies/{id}")
        public Company updateCompanyById(@PathVariable("id") int companyId, @RequestBody Company company){
            return companyService.updateCompanyById(companyId,company);}
    }


