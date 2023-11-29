package com.assignment.econrich.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "employees")
public class Employee {

    @Id
    @Column(name = "employee_id", nullable = false, columnDefinition = "INT UNSIGNED")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "hire_date", nullable = false)
    private LocalDateTime hireDate;

    @Column(name = "job_id", nullable = false)
    private String jobId;

    @Column(name = "salary", nullable = false, precision = 8, scale = 2)
    private BigDecimal salary;

    @Column(name = "commission_pct", precision = 2, scale = 2)
    private BigDecimal commissionPct;

    @Column(name = "manager_id", columnDefinition = "INT UNSIGNED")
    private Long managerId;

    @Column(name = "department_id", columnDefinition = "INT UNSIGNED")
    private Long departmentId;
}

