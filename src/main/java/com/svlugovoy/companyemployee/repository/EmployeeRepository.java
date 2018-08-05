package com.svlugovoy.companyemployee.repository;

import com.svlugovoy.companyemployee.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
