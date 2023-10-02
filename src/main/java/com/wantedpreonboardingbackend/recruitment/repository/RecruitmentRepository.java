package com.wantedpreonboardingbackend.recruitment.repository;

import com.wantedpreonboardingbackend.recruitment.entity.Recruitment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruitmentRepository extends JpaRepository<Recruitment, Integer> {
}
