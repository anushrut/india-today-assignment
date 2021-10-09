package com.indiatoday.test.project.homescreen.response;

import com.indiatoday.test.project.homescreen.dto.ReportDataDTO;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ReportResponse {
    private String httpStatus;
    private Integer httpStatusCode;
    private boolean success;
    private String message;
    private String apiName;
    private ReportDataDTO data;
}
