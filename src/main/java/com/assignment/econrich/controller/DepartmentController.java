package com.assignment.econrich.controller;

import com.assignment.econrich.dto.response.DepartmentAndLocationResponse;
import com.assignment.econrich.service.DepartmentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "부서 조회 API", description = "Swagger 테스트용 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("/{id}")
    public ResponseEntity<DepartmentAndLocationResponse> searchDepartmentAndLocation(@PathVariable Long id) {
        DepartmentAndLocationResponse response =  departmentService.searchDepartmentAndLocation(id);

        return ResponseEntity.ok(response);
    }
}
