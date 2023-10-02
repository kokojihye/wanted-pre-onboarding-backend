package com.wantedpreonboardingbackend.main.controller;

import com.wantedpreonboardingbackend.company.controller.CompanyController;
import com.wantedpreonboardingbackend.company.service.CompanyService;
import com.wantedpreonboardingbackend.recruitment.dto.RecruitmentDTO;
import com.wantedpreonboardingbackend.recruitment.service.RecruitmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    //localhost:8080으로 접속하거나 localhost:8080/main 으로 접속할 경우 /resources/templates/main/main.html 호출
    @GetMapping(value = {"/", "/main"})
    public String main() {
        return ("main/main");
    }

}
