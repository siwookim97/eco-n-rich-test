package com.assignment.econrich.domain.uk;

import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

@EqualsAndHashCode
public class JobHistoryUK implements Serializable {

    private Long employeeId;
    private LocalDateTime startDate;
}
