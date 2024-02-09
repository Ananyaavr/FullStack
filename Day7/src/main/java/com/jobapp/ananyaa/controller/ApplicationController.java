package com.jobapp.ananyaa.controller;

import static com.jobapp.ananyaa.utils.MyConstant.APPLICATIONLIST;
import static com.jobapp.ananyaa.utils.MyConstant.JOB;
// import static com.jobapp.ananyaa.utils.MyConstant.REGISTER;
// import static com.jobapp.ananyaa.utils.MyConstant.USER;
// import static org.springframework.http.HttpStatus.ACCEPTED;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;
import static org.springframework.http.HttpStatus.OK;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.jobapp.ananyaa.dto.request.ApplicationRequest;
import com.jobapp.ananyaa.dto.response.ApplicationResponse;
import com.jobapp.ananyaa.dto.response.BasicResponse;
// import com.jobapp.ananyaa.model.Application;
import com.jobapp.ananyaa.service.ApplicationService;

import lombok.RequiredArgsConstructor;

@RequestMapping(JOB)
@RestController
@RequiredArgsConstructor
public class ApplicationController {
    private ApplicationService applicationService;

    @GetMapping(APPLICATIONLIST)
       public ResponseEntity<BasicResponse<ApplicationResponse>> create() {
        BasicResponse<ApplicationResponse> response=new BasicResponse<>();


           try {
               response=applicationService.getAllApplication();
               return new ResponseEntity<>(response,OK);
           } catch (Exception e) {
               response.setMessage("Something went wrong!");
               return new ResponseEntity<>(response, EXPECTATION_FAILED);
           }
       }

    //     @PostMapping(REGISTER)
    // public ResponseEntity< ApplicationResponse>register(@RequestBody ApplicationRequest request)
    // {
    //     ApplicationResponse response=new ApplicationResponse();
    //     try{
    //         response=ApplicationService.register(request);
    //         return new ResponseEntity<>(response,ACCEPTED);
    //     }catch (Exception e)
    //     {
    //         System.out.println(e);
    //         response.setMessage("Something went wrong!");
    //         return new ResponseEntity<>(response,EXPECTATION_FAILED);
    //     }
    // }
}
