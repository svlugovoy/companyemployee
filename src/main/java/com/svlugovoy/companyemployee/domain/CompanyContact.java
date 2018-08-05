package com.svlugovoy.companyemployee.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "COMPANY_CONTACT")
public class CompanyContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CITY")
    private String city;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "WWW")
    private String www;

    @OneToOne
    private Company company;


}
