package com.jobapp.ananyaa.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobapp.ananyaa.model.Application;

@Repository
public interface ApplicationRepo extends JpaRepository<Application,String>{

}
