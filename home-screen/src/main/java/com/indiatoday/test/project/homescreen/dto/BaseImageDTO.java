package com.indiatoday.test.project.homescreen.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BaseImageDTO {
    private ImageDTO small;
    private ImageDTO large;
    private ImageDTO medium;

}
