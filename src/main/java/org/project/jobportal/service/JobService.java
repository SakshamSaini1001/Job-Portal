package org.project.jobportal.service;

import org.project.jobportal.dto.JobDTO;
import org.project.jobportal.exception.JobPortalException;
import org.project.jobportal.repository.JobRepository;
import org.project.jobportal.utils.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public JobDTO postJob(JobDTO jobDTO) throws JobPortalException {
        jobDTO.setId(Utilities.getNextSequence("jobs"));
        jobDTO.setPostTime(LocalDateTime.now());
        return jobRepository.save(jobDTO.toEntity()).toDTO();
    }
}
