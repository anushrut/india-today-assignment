package com.indiatoday.test.project.homescreen.service;

import com.indiatoday.test.project.homescreen.dto.BaseImageDTO;
import com.indiatoday.test.project.homescreen.dto.HoroscopeDTO;
import com.indiatoday.test.project.homescreen.dto.ImageDTO;
import com.indiatoday.test.project.homescreen.entity.Horoscopes;
import com.indiatoday.test.project.homescreen.entity.ImagesSize;
import com.indiatoday.test.project.homescreen.repository.HoroscopesRepository;
import com.indiatoday.test.project.homescreen.repository.ImagesSizeRepository;
import com.indiatoday.test.project.homescreen.response.HoroscopeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HoroscopeService {
    @Autowired
    HoroscopesRepository horoscopesRepository;
    @Autowired
    ImagesSizeRepository imagesSizeRepository;

    public HoroscopeResponse getData() {
        List<Horoscopes> horoscopesList = horoscopesRepository.findAll();
        List<HoroscopeDTO> data = new ArrayList<>();

        for (Horoscopes horoscopes : horoscopesList) {
            List<ImagesSize> imagesSizes = imagesSizeRepository.findByHoroscopeId(horoscopes.getId());

            ImageDTO medium = null;
            ImageDTO large = null;
            ImageDTO small = null;

            for (ImagesSize image : imagesSizes) {
                if (image.getImageType().equals("small")) {
                    small = ImageDTO.builder()
                            .id(image.getId())
                            .imageUrl(image.getImageUrl())
                            .build();
                } else if (image.getImageType().equals("large")) {
                    large = ImageDTO.builder()
                            .id(image.getId())
                            .imageUrl(image.getImageUrl())
                            .build();
                } else {
                    medium = ImageDTO.builder()
                            .id(image.getId())
                            .imageUrl(image.getImageUrl())
                            .build();
                }
            }

            BaseImageDTO images = BaseImageDTO.builder()
                    .medium(medium)
                    .large(large)
                    .small(small)
                    .build();
            HoroscopeDTO horoscopeDTO = HoroscopeDTO.builder()
                    .name(horoscopes.getName())
                    .date(horoscopes.getDate())
                    .img(horoscopes.getImg())
                    .images(images)
                    .build();
            data.add(horoscopeDTO);
        }


        HoroscopeResponse horoscopeResponse = HoroscopeResponse.builder()
                .httpStatus("OK")
                .httpStatusCode(200)
                .success(true)
                .message("fetched successfully")
                .apiName("Get all daily horoscopes")
                .data(data)
                .build();

        return horoscopeResponse;
    }
}
