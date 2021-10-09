package com.indiatoday.test.project.homescreen.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class QuestionDTO {
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private List<String> suggestions;
}

