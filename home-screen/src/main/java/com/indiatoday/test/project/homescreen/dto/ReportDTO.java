package com.indiatoday.test.project.homescreen.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ReportDTO {
    private String name;
    private String productCode;
    private String imageUrl;
    private String description;
    private List<String> availableLanguages;
    private List<String> indepthPoints;
    private Integer price;
    private Integer offerPrice;
}
