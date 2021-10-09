package com.indiatoday.test.project.homescreen.response;

import com.indiatoday.test.project.homescreen.dto.QuestionDTO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class QuestionResponse {
    private String httpStatus;
    private Integer httpStatusCode;
    private boolean success;
    private String message;
    private String apiName;
    private List<QuestionDTO> data;
}
