package com.assignment.econrich.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "departments")
public class Department {

    @Id
    @Column(name = "department_id", nullable = false, columnDefinition = "INT UNSIGNED")
    private Long id;

    @Column(name = "department_name", nullable = false, length = 30)
    private String departmentName;

    @Column(name = "manager_id", columnDefinition = "INT UNSIGNED")
    private Long managerId;

    @Column(name = "location_id", columnDefinition = "INT UNSIGNED")
    private Long locationId;

}
