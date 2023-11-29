package com.assignment.econrich.dto;

import com.assignment.econrich.domain.Country;
import com.assignment.econrich.domain.Location;
import com.assignment.econrich.domain.Region;
import lombok.Getter;

@Getter
public class LocationDto {

    private final Long location_Id;
    private final String street_Address;
    private final String postal_code;
    private final String city;
    private final String state_province;
    private final CountryDto country_info;

    public LocationDto(final Location location, final Country country, final Region region) {
        this.location_Id = location.getLocationId();
        this.street_Address = location.getStreetAddress();
        this.postal_code = location.getPostalCode();
        this.city = location.getCity();
        this.state_province = location.getStateProvince();
        this.country_info = new CountryDto(country, region);
    }
}
