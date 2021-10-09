package com.indiatoday.test.project.homescreen.service;

import com.indiatoday.test.project.homescreen.dto.BannerData;
import com.indiatoday.test.project.homescreen.dto.ImageDTO;
import com.indiatoday.test.project.homescreen.dto.ImagesObjectDTO;
import com.indiatoday.test.project.homescreen.entity.Banner;
import com.indiatoday.test.project.homescreen.entity.BannerImages;
import com.indiatoday.test.project.homescreen.entity.BannerMetaData;
import com.indiatoday.test.project.homescreen.repository.BannerImagesRepository;
import com.indiatoday.test.project.homescreen.repository.BannerMetaDataRepository;
import com.indiatoday.test.project.homescreen.repository.BannerRepository;
import com.indiatoday.test.project.homescreen.response.BannerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BannerService {

    @Autowired
    BannerRepository bannerRepository;
    @Autowired
    BannerMetaDataRepository bannerMetaDataRepository;
    @Autowired
    BannerImagesRepository bannerImagesRepository;

    public BannerResponse getData() {
        List<BannerData> bannerDataList = new ArrayList<>();
        List<Banner> bannerList = bannerRepository.findAll();
        for (Banner banner : bannerList) {
            BannerMetaData bannerMetaData = bannerMetaDataRepository.findByBannerId(banner.getId().toString());
            BannerImages bannerImages = bannerImagesRepository.findByBannerId(banner.getId().toString());
            ImageDTO imageDTO = ImageDTO.builder().id(bannerImages.getId()).imageUrl(bannerImages.getImageUrl()).build();
            ImagesObjectDTO imagesObjectDTO = ImagesObjectDTO.builder().medium(imageDTO).build();
            BannerData bannerData =
                    BannerData.builder().id(banner.getId())
                            .name(banner.getName())
                            .landingUrl(banner.getLandingUrl())
                            .orderType(banner.getOrderType())
                            .metaData(bannerMetaData)
                            .images(imagesObjectDTO)
                            .build();
            bannerDataList.add(bannerData);
        }

        BannerResponse bannerResponse = BannerResponse.builder()
                .apiName("Fetch Banner")
                .message("Banners fetched successfully")
                .httpStatus("OK")
                .httpStatusCode(200)
                .success(true)
                .data(bannerDataList)
                .build();
        return bannerResponse;
    }
}
