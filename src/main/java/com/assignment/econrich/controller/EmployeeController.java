package com.assignment.econrich.controller;

import com.assignment.econrich.dto.response.CurrentEmployeeResponse;
import com.assignment.econrich.service.EmployeeService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "사원 조회 API", description = "Swagger 테스트용 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json"), useReturnTypeSchema = true),
    })
    @GetMapping("/{id}")
    public ResponseEntity<CurrentEmployeeResponse> searchCurrentEmployee(@PathVariable Long id) {

        CurrentEmployeeResponse response = employeeService.searchEmployee(id);

        return ResponseEntity.ok(response);
    }
}
