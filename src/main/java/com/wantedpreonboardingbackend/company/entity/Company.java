package com.wantedpreonboardingbackend.company.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
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
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyNation = companyNation;
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
