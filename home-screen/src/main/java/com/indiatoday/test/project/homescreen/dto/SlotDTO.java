package com.indiatoday.test.project.homescreen.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SlotDTO {
    private String toFormat;
    private String fromFormat;
    private String from;
    private String to;
}
