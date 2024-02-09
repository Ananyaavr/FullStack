package com.jobapp.ananyaa.dto.response;

import com.jobapp.ananyaa.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationResponse {

    private String app_id;
    private User applicant;
    private String resume;
    private String coverLetter;
    private String status;
    private String message;

}
