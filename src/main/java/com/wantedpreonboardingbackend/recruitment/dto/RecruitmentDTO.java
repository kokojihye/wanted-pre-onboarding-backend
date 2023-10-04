package com.wantedpreonboardingbackend.recruitment.dto;

import com.wantedpreonboardingbackend.company.entity.Company;
import org.attoparser.dom.Text;

public class RecruitmentDTO {
    private int recruitmentId;
    private Company company;
    private String position;
    private int reward;
    private String details;
    private String techStack;

    public RecruitmentDTO() {
    }

    public RecruitmentDTO(int recruitmentId, Company company, String position, int reward, String details, String techStack) {
        this.recruitmentId = recruitmentId;
        this.company = company;
        this.position = position;
        this.reward = reward;
        this.details = details;
        this.techStack = techStack;
    }

    public int getRecruitmentId() {
        return recruitmentId;
    }

    public void setRecruitmentId(int recruitmentId) {
        this.recruitmentId = recruitmentId;
    }

    public int getCompanyId() {
        return company.getCompanyId();
    }

    public String getCompanyName() {
        return company.getCompanyName();
    }

    public String getCompanyNation() {
        return company.getCompanyNation();
    }

    public String getCompanyRegion() {
        return company.getCompanyRegion();
    }

    public void setCompanyName(String companyName) {
        this.company.setCompanyName(companyName);
    }

    public void setCompanyRegion(String companyRegion) {
        this.company.setCompanyName(companyRegion);
    }

    public void setCompanyNation(String companyNation) {
        this.company.setCompanyName(companyNation);
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
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
