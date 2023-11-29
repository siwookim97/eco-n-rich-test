package com.assignment.econrich.domain;

import com.assignment.econrich.domain.uk.JobHistoryUK;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "job_history")
@IdClass(JobHistoryUK.class)
public class JobHistory {

    @Id
    @Column(name = "employee_id")
    private Long employeeId;

    @Id
    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;

    @Column(name = "job_id", nullable = false)
    private String jobId;

    @Column(name = "department_id", nullable = false)
    private Long departmentId;
}