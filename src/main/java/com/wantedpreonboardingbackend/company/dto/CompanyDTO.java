package com.wantedpreonboardingbackend.company.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDTO {
    private int companyId;
    private String companyName;
    private String companyNation;
    private String companyRegion;

    public CompanyDTO() { }

    public CompanyDTO(int companyId, String companyName, String companyNation, String companyRegion) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyNation = companyNation;
        this.companyRegion = companyRegion;
    }

    @Override
    public String toString() {
        return "CompanyDTO{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", companyNation='" + companyNation + '\'' +
                ", companyRegion='" + companyRegion + '\'' +
                '}';
    }
}
