package com.assignment.econrich.dto;

import com.assignment.econrich.domain.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
public class EmployeeDto {

    private final Long employee_id;
    private final String first_name;
    private final String last_name;
    private final String email;
    private final String phone_number;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private final LocalDateTime hire_date;
    private final String job_id;
    private final BigDecimal salary;
    private final BigDecimal commission_pct;
    private final Long manager_id;
    private final Long department_id;

    public EmployeeDto(final Employee employee) {
        this.employee_id = employee.getId();
        this.first_name = employee.getFirstName();
        this.last_name = employee.getLastName();
        this.email = employee.getEmail();
        this.phone_number = employee.getPhoneNumber();
        this.hire_date = employee.getHireDate();
        this.job_id = employee.getJobId();
        this.salary = employee.getSalary();
        this.commission_pct = employee.getCommissionPct();
        this.manager_id = employee.getManagerId();
        this.department_id = employee.getDepartmentId();
    }
}
