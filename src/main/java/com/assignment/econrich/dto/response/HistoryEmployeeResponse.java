package com.assignment.econrich.dto.response;

import com.assignment.econrich.domain.Employee;
import com.assignment.econrich.dto.EmployeeDto;
import com.assignment.econrich.dto.JobHistoryDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Schema(description = "사원 이력 정보 Response")
@Getter
public class HistoryEmployeeResponse {

    private final EmployeeDto employee_info;
    private List<JobHistoryDto> job_history_list = new ArrayList<>();

    public HistoryEmployeeResponse(final Employee employee) {
        employee_info = new EmployeeDto(employee);
    }

    public void addJobHistoryDto(JobHistoryDto jobHistoryDto) {
        job_history_list.add(jobHistoryDto);
    }

    public void setJob_history_list(List<JobHistoryDto> jobHistoryDtos) {
        job_history_list = jobHistoryDtos;
    }
}
