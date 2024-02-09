package com.jobapp.ananyaa.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.jobapp.ananyaa.dto.request.JobListRequest;
import com.jobapp.ananyaa.dto.response.BasicResponse;
import com.jobapp.ananyaa.dto.response.JobListResponse;
import com.jobapp.ananyaa.dto.response.RegisterResponse;
import com.jobapp.ananyaa.model.JobList;
import com.jobapp.ananyaa.repository.JobListRepository;
import com.jobapp.ananyaa.service.JobListService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JobListServiceImpl implements JobListService {

    private final JobListRepository jobListRepository;
   
    @Override
    public BasicResponse<JobListResponse> getAllJobs() {
        List<JobList> jobs = jobListRepository.findAll();
        List<JobListResponse> JobListResponses = jobs.stream().map(job->JobListResponse.builder()
        .jobId(job.getJobId())
        .jobTitle(job.getJobTitle())
        .jobLocation(job.getJobLocation())
        .jobDescription(job.getJobDescription())
        .Salary(job.getSalary())
        .DatePosted(job.getDatePosted())
        .build())
        .collect(Collectors.toList()); 
        return BasicResponse.<JobListResponse>builder()
        .message("Job data fetched successfully!")
          .data(JobListResponses)
          .build();
        
    }

    @Override
    public RegisterResponse register(JobListRequest request) {
    
        var user=JobList.builder()
        .jobTitle(request.getJobTitle())
        .jobLocation(request.getJobLocation())
        .jobDescription(request.getJobDescription())
        .Salary(request.getSalary())
        .DatePosted(request.getDatePosted())
                .build();
        jobListRepository.save(user);
        // throw new UnsupportedOperationException("Unimplemented method 'register'");
        return RegisterResponse.builder()
        .message("job create successfully!")
        .build();
    }


}
