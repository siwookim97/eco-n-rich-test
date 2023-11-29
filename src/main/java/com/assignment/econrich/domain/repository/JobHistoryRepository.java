package com.assignment.econrich.domain.repository;

import com.assignment.econrich.domain.JobHistory;
import com.assignment.econrich.domain.uk.JobHistoryUK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobHistoryRepository extends JpaRepository<JobHistory, JobHistoryUK> {

    List<JobHistory> findByEmployeeId(Long employeeId);
}
