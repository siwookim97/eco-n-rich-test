package com.assignment.econrich.dto;

import com.assignment.econrich.domain.Region;
import lombok.Getter;

@Getter
public class RegionDto {

    private final Long region_id;
    private final String region_name;

    public RegionDto(final Region region) {
        this.region_id = region.getRegionId();
        this.region_name = region.getRegionName();
    }
}
