package com.wantedpreonboardingbackend.recruitment.dto;

import com.wantedpreonboardingbackend.company.entity.Company;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecruitmentDTO {
    private int recruitmentId;
    private Company company;
    private String position;
    private int reward;
    private String details;
    private String techStack;

    public RecruitmentDTO() {
    }

    public RecruitmentDTO(int recruitmentId, String companyName, String companyNation, String companyRegion, String position, int reward, String details, String techStack) {
        this.recruitmentId = recruitmentId;
        this.company = new Company(0, companyName, companyNation, companyRegion);
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
