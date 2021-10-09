package com.indiatoday.test.project.homescreen.dto;

import com.indiatoday.test.project.homescreen.entity.BannerMetaData;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BannerData {
    private int id;
    private String name;
    private String landingUrl;
    private String orderType;
    private BannerMetaData metaData;
    private ImagesObjectDTO images;
}
