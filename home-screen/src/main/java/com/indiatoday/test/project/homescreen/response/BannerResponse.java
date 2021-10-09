package com.indiatoday.test.project.homescreen.response;

import com.indiatoday.test.project.homescreen.dto.BannerData;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class BannerResponse {
    private String httpStatus;
    private Integer httpStatusCode;
    private boolean success;
    private String message;
    private String apiName;
    List<BannerData> data;
}
