package com.assignment.econrich.domain.repository;

import com.assignment.econrich.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, String> {
}
