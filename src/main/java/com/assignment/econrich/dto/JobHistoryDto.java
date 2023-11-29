package com.assignment.econrich.dto;

import com.assignment.econrich.domain.JobHistory;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class JobHistoryDto {

    private Long employee_id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private LocalDateTime start_date;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private LocalDateTime end_date;
    private String job_id;
    private Long department_id;

    public JobHistoryDto(final JobHistory jobHistory) {
        this.employee_id = jobHistory.getEmployeeId();
        this.start_date = jobHistory.getStartDate();
        this.end_date = jobHistory.getEndDate();
        this.job_id = jobHistory.getJobId();
        this.department_id = jobHistory.getDepartmentId();
    }
}
