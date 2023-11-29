package com.assignment.econrich.dto;

import com.assignment.econrich.domain.Department;
import com.assignment.econrich.domain.JobHistory;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class JobHistoryDto {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private LocalDateTime start_date;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private LocalDateTime end_date;
    private String job_id;
    private DepartmentDto department_info;

    public JobHistoryDto(final JobHistory jobHistory, final Department department) {
        this.start_date = jobHistory.getStartDate();
        this.end_date = jobHistory.getEndDate();
        this.job_id = jobHistory.getJobId();
        this.department_info = new DepartmentDto(department);
    }
}
