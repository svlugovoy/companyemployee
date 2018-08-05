package com.svlugovoy.companyemployee.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "COMPANY")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @OneToOne(cascade = CascadeType.ALL)
    private CompanyContact companyContact;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    List<Employee> employees;

}
