package com.assignment.econrich.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "jobs")
public class Job {

    @Id
    @Column(name = "job_id", nullable = false, length = 10)
    private String id;

    @Column(name = "job_title", nullable = false, length = 35)
    private String jobTitle;

    @Column(name = "min_salary", precision = 8, scale = 0)
    private Long minSalary;

    @Column(name = "max_salary", precision = 8, scale = 0)
    private Long maxSalary;

}
