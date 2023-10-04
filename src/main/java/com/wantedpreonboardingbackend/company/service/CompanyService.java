package com.wantedpreonboardingbackend.company.service;

import com.wantedpreonboardingbackend.company.dto.CompanyDTO;
import com.wantedpreonboardingbackend.company.entity.Company;
import com.wantedpreonboardingbackend.company.repository.CompanyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final ModelMapper modelMapper;

    public CompanyService(CompanyRepository companyRepository, ModelMapper modelMapper) {
        this.companyRepository = companyRepository;
        this.modelMapper = modelMapper;
    }

    //회사 아이디로 조회
    public CompanyDTO findCompanyById(int companyId) {
        Company company = companyRepository.findById(companyId).orElseThrow(IllegalArgumentException::new);
        return modelMapper.map(company, CompanyDTO.class);
    }

    //전체 회사 조회(회사 아이디 순으로 오름차순 정렬)
    public List<CompanyDTO> findCompanyList() {
        List<Company> companyList = companyRepository.findAll(Sort.by("companyId").ascending());
        return companyList.stream().map(company -> modelMapper.map(company, CompanyDTO.class))
                .collect(Collectors.toList());
    }
}
