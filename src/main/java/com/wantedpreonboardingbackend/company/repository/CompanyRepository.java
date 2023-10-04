package com.wantedpreonboardingbackend.company.repository;

import com.wantedpreonboardingbackend.company.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> { }
