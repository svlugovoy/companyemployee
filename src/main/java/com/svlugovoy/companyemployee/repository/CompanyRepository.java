package com.svlugovoy.companyemployee.repository;

import com.svlugovoy.companyemployee.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    Company findByCompanyName(String name);
}
