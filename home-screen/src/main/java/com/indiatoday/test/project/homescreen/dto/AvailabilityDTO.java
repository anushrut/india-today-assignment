package com.indiatoday.test.project.homescreen.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class AvailabilityDTO {
    private List<String> days;
    private SlotDTO slot;
}
