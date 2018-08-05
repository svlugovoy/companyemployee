package com.svlugovoy.companyemployee.bootstrap;

import com.svlugovoy.companyemployee.domain.Company;
import com.svlugovoy.companyemployee.domain.CompanyContact;
import com.svlugovoy.companyemployee.domain.Employee;
import com.svlugovoy.companyemployee.repository.CompanyContactRepository;
import com.svlugovoy.companyemployee.repository.CompanyRepository;
import com.svlugovoy.companyemployee.repository.EmployeeRepository;
import com.svlugovoy.companyemployee.repository.SkillRepository;
import org.hibernate.LazyInitializationException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TesterBootstrap implements CommandLineRunner {

    private CompanyRepository companyRepository;
    private EmployeeRepository employeeRepository;
    private CompanyContactRepository companyContactRepository;
    private SkillRepository skillRepository;

    public TesterBootstrap(CompanyRepository companyRepository, EmployeeRepository employeeRepository, CompanyContactRepository companyContactRepository, SkillRepository skillRepository) {
        this.companyRepository = companyRepository;
        this.employeeRepository = employeeRepository;
        this.companyContactRepository = companyContactRepository;
        this.skillRepository = skillRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        String separator = "\n*****===================================*****\n";

        List<Company> companies = companyRepository.findAll();
        System.out.println(separator + "All companies: " + companies + separator);

        Company google = companyRepository.findByCompanyName("Google");
        System.out.println(separator + "This is Google: " + google + separator);

        try {
            google.getEmployees().get(0);
            System.out.println(separator + "NO LazyInitializationException when fetch = FetchType.EAGER" + separator);
        } catch (LazyInitializationException e){
            System.out.println(separator + "LazyInitializationException when fetch = FetchType.LAZY (default for @OneToMAny)" + separator);
        }


        long count = employeeRepository.count();
        System.out.println(separator + "In Table Employee - : " + count + " persons" + separator);

        Company c1 = new Company();
        c1.setCompanyName("Facebook");
        c1.setCompanyContact(new CompanyContact(){{
            setCity("LA");
            setCountry("USA");
            setWww("facebook.com");
            setCompany(c1);
        }});

        System.out.println(separator + companyRepository.save(c1) + separator);

        System.out.println(separator + " N+1 demo " + separator);
        List<Employee> employees = companyRepository.findByCompanyName("Rozetka").getEmployees();
        System.out.println(separator + "This is Rozetka: " + employees + separator);

    }
}
