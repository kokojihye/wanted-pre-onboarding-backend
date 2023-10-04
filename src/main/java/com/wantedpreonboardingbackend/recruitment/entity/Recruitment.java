package com.wantedpreonboardingbackend.recruitment.entity;

import com.wantedpreonboardingbackend.company.entity.Company;

import javax.persistence.*;

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


}
