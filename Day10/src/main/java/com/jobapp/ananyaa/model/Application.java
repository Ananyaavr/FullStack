package com.jobapp.ananyaa.model;

// import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Applications")
public class Application {

    @Id
    @GeneratedValue(strategy = UUID)//GenerationType.UUID
    private String app_id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User applicant;

    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "jobPosting_id", referencedColumnName = "id")
    // private JobPosting jobPosting;

    @Column(nullable = false)
    private String resume;

    @Column(nullable = false)
    private String coverLetter;

    
    @Column(nullable = false)
    private String status;


}
