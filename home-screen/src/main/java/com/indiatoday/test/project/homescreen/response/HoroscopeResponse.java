package com.indiatoday.test.project.homescreen.response;

import com.indiatoday.test.project.homescreen.dto.HoroscopeDTO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class HoroscopeResponse {

    private String httpStatus;
    private Integer httpStatusCode;
    private boolean success;
    private String message;
    private String apiName;
    private List<HoroscopeDTO> data;
}
