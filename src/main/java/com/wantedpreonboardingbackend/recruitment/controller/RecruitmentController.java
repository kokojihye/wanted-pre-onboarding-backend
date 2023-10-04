package com.wantedpreonboardingbackend.recruitment.controller;

import com.wantedpreonboardingbackend.recruitment.dto.RecruitmentDTO;
import com.wantedpreonboardingbackend.recruitment.service.RecruitmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/recruitment")
public class RecruitmentController {

    private final RecruitmentService recruitmentService;
    public RecruitmentController(RecruitmentService recruitmentService){
        this.recruitmentService = recruitmentService;
    }

    @GetMapping("/jobSeeker")
    public String findRecruitmentList(Model model) {
        List<RecruitmentDTO> recruitmentList = recruitmentService.recruitmentList();
        model.addAttribute("recruitmentList", recruitmentList);
        return "jobSeeker/readRecruitmentList";
    }

    @GetMapping(value = "/create")
    public String createNewRecruitment(RecruitmentDTO newRecruitment) {
        recruitmentService.createNewRecruitment(newRecruitment);
        return "redirect:/company/createRecruitment";
    }

}
