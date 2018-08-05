package com.svlugovoy.companyemployee.repository;

import com.svlugovoy.companyemployee.domain.CompanyContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyContactRepository extends JpaRepository<CompanyContact, Long> {

}
