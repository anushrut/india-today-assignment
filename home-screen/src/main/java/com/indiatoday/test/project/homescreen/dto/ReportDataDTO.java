package com.indiatoday.test.project.homescreen.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ReportDataDTO {
    List<ReportDTO> services;
}
