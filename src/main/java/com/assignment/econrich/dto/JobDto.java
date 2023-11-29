package com.assignment.econrich.dto;

import com.assignment.econrich.domain.Job;
import lombok.Getter;

@Getter
public class JobDto {

    private final String job_id;
    private final String job_title;
    private final Long min_salary;
    private final Long max_salary;

    public JobDto(Job job) {
        this.job_id = job.getId();
        this.job_title = job.getJobTitle();
        this.min_salary = job.getMinSalary();
        this.max_salary = job.getMaxSalary();
    }
}
