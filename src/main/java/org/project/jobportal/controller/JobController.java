package org.project.jobportal.controller;

import jakarta.validation.Valid;
import org.project.jobportal.dto.JobDTO;
import org.project.jobportal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Validated
@RequestMapping("/jobs")
public class JobController {
    @Autowired
    private JobService jobService;

    @PostMapping("/post")
    public ResponseEntity<JobDTO> postJob(@RequestBody @Valid JobDTO jobDTO) {
        return new ResponseEntity<>(jobService.postJob(jobDTO), HttpStatus.CREATED);
    }
}
