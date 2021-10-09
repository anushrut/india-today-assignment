package com.indiatoday.test.project.homescreen.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ImageDTO {
    private int id;
    private String imageUrl;
}
