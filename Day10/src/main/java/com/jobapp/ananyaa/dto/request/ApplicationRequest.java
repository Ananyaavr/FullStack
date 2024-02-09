package com.jobapp.ananyaa.dto.request;

import com.jobapp.ananyaa.model.User;

import lombok.Data;


@Data

public class ApplicationRequest {

    
    private User applicant;
    private String resume;
    private String coverLetter;
    private String status;

}
