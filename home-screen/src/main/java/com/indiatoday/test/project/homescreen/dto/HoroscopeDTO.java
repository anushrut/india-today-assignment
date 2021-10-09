package com.indiatoday.test.project.homescreen.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class HoroscopeDTO {
    private String name;
    private String date;
    private String img;
    private BaseImageDTO images;

}
