package com.jobapp.ananyaa.controller;

import static com.jobapp.ananyaa.utils.MyConstant.APPLICATIONLIST;
import static com.jobapp.ananyaa.utils.MyConstant.JOB;
import static com.jobapp.ananyaa.utils.MyConstant.JOBLIST;
import static com.jobapp.ananyaa.utils.MyConstant.REGISTER;
import static org.springframework.http.HttpStatus.ACCEPTED;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;
import static org.springframework.http.HttpStatus.OK;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobapp.ananyaa.dto.request.JobListRequest;
import com.jobapp.ananyaa.dto.response.BasicResponse;
import com.jobapp.ananyaa.dto.response.JobListResponse;
import com.jobapp.ananyaa.dto.response.RegisterResponse;
import com.jobapp.ananyaa.service.JobListService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

@RequestMapping(JOB)
@RestController
@RequiredArgsConstructor
public class JobListController {

     private final  JobListService jobListService;
     @GetMapping(JOBLIST)
       public ResponseEntity<BasicResponse<JobListResponse>> create() {
        BasicResponse<JobListResponse> response=new BasicResponse<>();


           try {
               response=jobListService.getAllJobs();
               return new ResponseEntity<>(response,OK);
           } catch (Exception e) {
               response.setMessage("Something went wrong!");
               return new ResponseEntity<>(response, EXPECTATION_FAILED);
           }
       }

        @PostMapping(REGISTER)
    public ResponseEntity<RegisterResponse>register(@RequestBody JobListRequest request)
    {
        RegisterResponse response=new RegisterResponse();
        try{
            response=jobListService.register(request);
            return new ResponseEntity<>(response,ACCEPTED);
        }catch (Exception e)
        {
            System.out.println(e);
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response,EXPECTATION_FAILED);
        }
    }


}
