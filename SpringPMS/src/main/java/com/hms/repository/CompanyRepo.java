package com.hms.repository;

import com.hms.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company, String> {
}
