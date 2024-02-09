package com.jobapp.ananyaa.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.jobapp.ananyaa.dto.request.ApplicationRequest;
import com.jobapp.ananyaa.dto.response.ApplicationResponse;
import com.jobapp.ananyaa.dto.response.BasicResponse;
import com.jobapp.ananyaa.model.Application;
import com.jobapp.ananyaa.repository.ApplicationRepo;
import com.jobapp.ananyaa.service.ApplicationService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ApplicationServiceImpl implements ApplicationService{

    private final ApplicationRepo applicationRepo;
   
    @Override
    public BasicResponse<ApplicationResponse> getAllApplication() {
        List<Application> applications = applicationRepo.findAll();
        List<ApplicationResponse> applicationResponses = applications.stream().map(application->ApplicationResponse.builder()
        .app_id(application.getApp_id())
        .applicant(application.getApplicant())
        .resume(application.getResume())
        .coverLetter(application.getCoverLetter())
        .status(application.getStatus())
        .build())
        .collect(Collectors.toList()); 
        return BasicResponse.<ApplicationResponse>builder()
        .message("Application data fetched successfully!")
          .data(applicationResponses)
          .build();
        
    }

    @Override
    public ApplicationResponse register(ApplicationRequest request) {
    
        var user=Application.builder()
                .applicant(request.getApplicant())
                .resume(request.getResume())
                .coverLetter(request.getCoverLetter())
                .status(request.getStatus())
                .build();
                applicationRepo.save(user);
        // throw new UnsupportedOperationException("Unimplemented method 'register'");
        return ApplicationResponse.builder()
        .message("Application create successfully!")
        .build();
    }

}
