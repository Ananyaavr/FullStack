package com.jobapp.ananyaa.service;

import org.springframework.stereotype.Service;

import com.jobapp.ananyaa.dto.request.ApplicationRequest;
import com.jobapp.ananyaa.dto.response.ApplicationResponse;
import com.jobapp.ananyaa.dto.response.BasicResponse;


@Service
public interface ApplicationService {

BasicResponse<ApplicationResponse> getAllApplication();
ApplicationResponse register(ApplicationRequest request);

    // @Autowired
    // private ApplicationRepo applicationRepository;

    // public Application getApplicationById(int id) {
    //     Optional<Application> optionalApplication = applicationRepository.findById(id);
    //     return optionalApplication.orElse(null);
    // }

    // public Application createApplication(Application application) {
    //     // Implement validation or other business logic here
    //     return applicationRepository.save(application);
    // }
}
