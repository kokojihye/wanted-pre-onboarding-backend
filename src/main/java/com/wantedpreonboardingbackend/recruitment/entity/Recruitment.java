package com.wantedpreonboardingbackend.recruitment.entity;

import com.wantedpreonboardingbackend.company.entity.Company;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "채용공고")
public class Recruitment {
    @Id
    @Column(name = "채용공고_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recruitmentId;

    @ManyToOne
    @JoinColumn(name = "회사_id")
    private Company company;

    @Column(name = "채용포지션")
    private String position;

    @Column(name = "채용보상금")
    private int reward;

    @Column(name = "채용내용")
    private String details;

    @Column(name = "사용기술")
    private String techStack;

    public Recruitment() {
    }

    public Recruitment(int recruitmentId, Company company, String position, int reward, String details, String techStack) {
        this.recruitmentId = recruitmentId;
        this.company = company;
        this.position = position;
        this.reward = reward;
        this.details = details;
        this.techStack = techStack;
    }

    @Override
    public String toString() {
        return "RecruitmentDTO{" +
                "recruitmentId=" + recruitmentId +
                ", companyId=" + company.getCompanyId() +
                ", companyName=" + company.getCompanyName() +
                ", companyNation=" + company.getCompanyNation() +
                ", companyRegion=" + company.getCompanyRegion() +
                ", position='" + position + '\'' +
                ", reward=" + reward +
                ", details=" + details +
                ", techStack='" + techStack + '\'' +
                '}';
    }
}
