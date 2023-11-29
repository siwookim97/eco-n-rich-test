package com.assignment.econrich.dto;

import com.assignment.econrich.domain.Country;
import com.assignment.econrich.domain.Region;
import lombok.Getter;

@Getter
public class CountryDto {

    private final String country_id;
    private final String country_name;
    private final RegionDto region_info;

    public CountryDto(final Country country, final Region region) {
        this.country_id = country.getCountryId();
        this.country_name = country.getCountryName();
        this.region_info = new RegionDto(region);
    }
}
