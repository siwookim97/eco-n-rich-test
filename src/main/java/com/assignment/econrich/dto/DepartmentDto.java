package com.assignment.econrich.dto;

import com.assignment.econrich.domain.Department;
import lombok.Getter;

@Getter
public class DepartmentDto {

    private Long department_id;
    private String department_name;
    private Long manager_id;
    private Long location_id;

    public DepartmentDto(final Department department) {
        this.department_id = department.getId();
        this.department_name = department.getDepartmentName();
        this.manager_id = department.getManagerId();
        this.location_id = department.getLocationId();
    }
}
