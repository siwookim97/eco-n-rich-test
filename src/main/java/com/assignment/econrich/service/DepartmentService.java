package com.assignment.econrich.service;

import com.assignment.econrich.domain.Country;
import com.assignment.econrich.domain.Department;
import com.assignment.econrich.domain.Location;
import com.assignment.econrich.domain.Region;
import com.assignment.econrich.domain.repository.CountryRepository;
import com.assignment.econrich.domain.repository.DepartMentRepository;
import com.assignment.econrich.domain.repository.LocationRepository;
import com.assignment.econrich.domain.repository.RegionRepository;
import com.assignment.econrich.dto.LocationDto;
import com.assignment.econrich.dto.response.DepartmentAndLocationResponse;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.reflect.CodeSignature;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DepartmentService {

    private final DepartMentRepository departMentRepository;
    private final LocationRepository locationRepository;
    private final CountryRepository countryRepository;
    private final RegionRepository regionRepository;

    public DepartmentAndLocationResponse searchDepartmentAndLocation(Long id) {
        Department findDepartment = departMentRepository.findById(id).get();
        Location findLocation = locationRepository.findById(findDepartment.getLocationId()).get();
        Country findCountry = countryRepository.findById(findLocation.getCountryId()).get();
        Region findRegion = regionRepository.findById(findCountry.getRegionId()).get();
        LocationDto locationDto = new LocationDto(findLocation, findCountry, findRegion);

        return new DepartmentAndLocationResponse(findDepartment, locationDto);
    }
}
