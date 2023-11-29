package com.assignment.econrich.dto.response;

import com.assignment.econrich.domain.Employee;
import com.assignment.econrich.domain.Job;
import com.assignment.econrich.dto.EmployeeDto;
import com.assignment.econrich.dto.JobDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(description = "사원 현재 정보 Response")
@Getter
public class CurrentEmployeeResponse {

    @Schema(description = "조회 사원 ID")
    private final Long employee_id;
    private final String first_name;
    private final String last_name;
    private final String email;
    private final String phone_number;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private final LocalDateTime hire_date;
    private final JobDto job_info;
    private final BigDecimal salary;
    private final BigDecimal commission_pct;
    private final EmployeeDto manager_info;
    private final Long department_id;

    public CurrentEmployeeResponse(final Employee employee, final Job job, final Employee manager) {
        this.employee_id = employee.getId();
        this.first_name = employee.getFirstName();
        this.last_name = employee.getLastName();
        this.email = employee.getEmail();
        this.phone_number = employee.getPhoneNumber();
        this.hire_date = employee.getHireDate();
        this.job_info = new JobDto(job);
        this.salary = employee.getSalary();
        this.commission_pct = employee.getCommissionPct();
        this.manager_info = new EmployeeDto(manager);
        this.department_id = employee.getDepartmentId();
    }
}
