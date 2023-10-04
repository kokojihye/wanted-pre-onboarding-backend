package com.wantedpreonboardingbackend.recruitment.service;

import com.wantedpreonboardingbackend.recruitment.dto.RecruitmentDTO;
import com.wantedpreonboardingbackend.recruitment.entity.Recruitment;
import com.wantedpreonboardingbackend.recruitment.repository.RecruitmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecruitmentService {

    private RecruitmentRepository recruitmentRepository;
    private ModelMapper modelMapper;
    public RecruitmentService(RecruitmentRepository recruitmentRepository, ModelMapper modelMapper) {
        this.recruitmentRepository = recruitmentRepository;
        this.modelMapper = modelMapper;
    }

    //채용공고 설정 : descending으로 sort하여 최신순 정렬
    public List<RecruitmentDTO> recruitmentList() {
        List<Recruitment> recruitmentList = recruitmentRepository.findAll(Sort.by("recruitmentId").descending());
        return recruitmentList.stream().map(recruitment -> modelMapper.map(recruitment, RecruitmentDTO.class))
                .collect(Collectors.toList());
    }

    @Transactional
    public void createNewRecruitment(RecruitmentDTO newRecruitment) {
        recruitmentRepository.save(modelMapper.map(newRecruitment, Recruitment.class));
    }

}
