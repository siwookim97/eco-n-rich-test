package com.assignment.econrich.domain.repository;

import com.assignment.econrich.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartMentRepository extends JpaRepository<Department, Long> {
}
