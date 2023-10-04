package com.wantedpreonboardingbackend.company.controller;

import com.wantedpreonboardingbackend.company.dto.CompanyDTO;
import com.wantedpreonboardingbackend.company.service.CompanyService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@RequestMapping("/company")
@Controller
public class CompanyController {
    @GetMapping(value = "/menu")
    public String companyMenu() {
        return("company/menu");
    }

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService){
        this.companyService = companyService;
    }



    @GetMapping("/{companyId}")
    public String findCompanyById(@PathVariable int companyId, Model model){
        CompanyDTO company = companyService.findCompanyById(companyId);
        model.addAttribute("company", company);
        return "companyList";
    }
}
