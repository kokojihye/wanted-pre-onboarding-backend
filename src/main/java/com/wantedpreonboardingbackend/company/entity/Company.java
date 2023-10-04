package com.wantedpreonboardingbackend.company.entity;

import javax.persistence.*;

@Entity
@Table(name = "회사")
public class Company {
    @Id
    @Column(name = "회사_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int companyId;
    @Column(name = "회사명")
    private String companyName;
    @Column(name = "국가")
    private String companyNation;
    @Column(name = "지역")
    private String companyRegion;

    public Company() {}

    public Company(int companyId, String companyName, String companyNation, String companyRegion) {
        super();
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyNation = companyNation;
        this.companyRegion = companyRegion;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyNation() {
        return companyNation;
    }

    public void setCompanyNation(String companyNation) {
        this.companyNation = companyNation;
    }

    public String getCompanyRegion() {
        return companyRegion;
    }

    public void setCompanyRegion(String companyRegion) {
        this.companyRegion = companyRegion;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", companyNation='" + companyNation + '\'' +
                ", companyRegion='" + companyRegion + '\'' +
                '}';
    }
}
