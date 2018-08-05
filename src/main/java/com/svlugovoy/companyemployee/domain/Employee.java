package com.svlugovoy.companyemployee.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DATE_OF_BIRTHDAY")
    private LocalDate dateOfBirthday;

    @ManyToOne
    private Company company;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "EMPLOYEE_SKILL",
            joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
            inverseJoinColumns = @JoinColumn(name = "SKILL_ID")
    )
    private List<Skill> skills;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }
}
