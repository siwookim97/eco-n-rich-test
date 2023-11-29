package com.assignment.econrich.dto.response;

import com.assignment.econrich.domain.Department;
import com.assignment.econrich.dto.LocationDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Schema(description = "부서 및 위치 정보 Response")
@Getter
public class DepartmentAndLocationResponse {

    private final Long department_id;
    private final String department_name;
    private final Long manager_id;
    private final LocationDto location_info;

    public DepartmentAndLocationResponse(final Department department, final LocationDto locationDto) {
        this.department_id = department.getId();
        this.department_name = department.getDepartmentName();
        this.manager_id = department.getManagerId();
        this.location_info = locationDto;
    }
}
