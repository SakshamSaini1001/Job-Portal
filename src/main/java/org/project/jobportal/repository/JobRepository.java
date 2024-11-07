package org.project.jobportal.repository;

import org.project.jobportal.model.Job;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<Job, Long> {

}
