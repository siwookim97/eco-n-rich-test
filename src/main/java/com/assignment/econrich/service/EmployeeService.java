package com.assignment.econrich.service;

import com.assignment.econrich.domain.Department;
import com.assignment.econrich.domain.Job;
import com.assignment.econrich.domain.JobHistory;
import com.assignment.econrich.domain.repository.DepartMentRepository;
import com.assignment.econrich.domain.repository.EmployeeRepository;
import com.assignment.econrich.domain.Employee;
import com.assignment.econrich.domain.repository.JobHistoryRepository;
import com.assignment.econrich.domain.repository.JobRepository;
import com.assignment.econrich.domain.uk.JobHistoryUK;
import com.assignment.econrich.dto.JobHistoryDto;
import com.assignment.econrich.dto.response.CurrentEmployeeResponse;
import com.assignment.econrich.dto.response.HistoryEmployeeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final JobRepository jobRepository;
    private final DepartMentRepository departMentRepository;
    private final JobHistoryRepository jobHistoryRepository;

    public CurrentEmployeeResponse searchCurrentEmployee(Long id) {
        Employee findEmployee = employeeRepository.findById(id).get();
        Job findJob = jobRepository.findById(findEmployee.getJobId()).get();
        Employee findManager = employeeRepository.findById(findEmployee.getManagerId()).get();
        Department findDepartment = departMentRepository.findById(findEmployee.getDepartmentId()).get();

        return new CurrentEmployeeResponse(findEmployee, findJob, findManager, findDepartment);
    }

    public HistoryEmployeeResponse searchHistoryEmployee(Long id) {
        List<JobHistory> findJobHistoyList = jobHistoryRepository.findByEmployeeId(id);
        HistoryEmployeeResponse historyEmployeeResponse = new HistoryEmployeeResponse();

        historyEmployeeResponse.setJob_history_list(findJobHistoyList.stream()
                .map(JobHistoryDto::new)
                .collect(Collectors.toList()));

        return historyEmployeeResponse;
    }
}
