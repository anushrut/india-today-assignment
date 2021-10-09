package com.indiatoday.test.project.homescreen.response;

import com.indiatoday.test.project.homescreen.dto.AvailabilityDTO;
import com.indiatoday.test.project.homescreen.dto.BaseImageDTO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class AstroResponse {
    private Integer id;
    private String urlSlug;
    private String namePrefix;
    private String firstName;
    private String lastName;
    private String aboutMe;
    private String profilePicUrl;
    private Double experience;
    private List<String> languages;
    private Integer minimumCallDuration;
    private Double minimumCallDurationCharges;
    private double additionalPerMinuteCharges;
    private boolean isAvailable;
    private Integer rating;
    private List<String> skills;
    private BaseImageDTO images;
    private Boolean isOnCall;
    private AvailabilityDTO availability;
}
