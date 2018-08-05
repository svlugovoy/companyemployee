package com.svlugovoy.companyemployee.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "SKILL")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SKILL_NAME")
    private String skillName;

    @ManyToMany(mappedBy = "skills", fetch = FetchType.EAGER)
    private List<Employee> employees;

    @Override
    public String toString() {
        return skillName;
    }
}
