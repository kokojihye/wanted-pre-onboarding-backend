package com.wantedpreonboardingbackend.company.dto;

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
        return "CompanyDTO{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", companyNation='" + companyNation + '\'' +
                ", companyRegion='" + companyRegion + '\'' +
                '}';
    }
}
