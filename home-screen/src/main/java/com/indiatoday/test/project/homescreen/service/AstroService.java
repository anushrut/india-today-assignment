package com.indiatoday.test.project.homescreen.service;

import com.indiatoday.test.project.homescreen.dto.AvailabilityDTO;
import com.indiatoday.test.project.homescreen.dto.BaseImageDTO;
import com.indiatoday.test.project.homescreen.dto.ImageDTO;
import com.indiatoday.test.project.homescreen.entity.Astro;
import com.indiatoday.test.project.homescreen.entity.AstroImages;
import com.indiatoday.test.project.homescreen.entity.Days;
import com.indiatoday.test.project.homescreen.repository.AstroImageRepository;
import com.indiatoday.test.project.homescreen.repository.AstroRepository;
import com.indiatoday.test.project.homescreen.repository.DaysRepository;
import com.indiatoday.test.project.homescreen.response.AstroResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AstroService {

    @Autowired
    AstroRepository astroRepository;

    @Autowired
    AstroImageRepository astroImageRepository;

    @Autowired
    DaysRepository daysRepository;

    public AstroResponse getData(Integer id) {
        Optional<Astro> astroOptional = astroRepository.findById(id);
        Astro astro = astroOptional.get();
        List<AstroImages> astroImagesList = astroImageRepository.findByAstroId(astro.getId());
        ImageDTO medium = null;
        ImageDTO large = null;
        ImageDTO small = null;

        for (AstroImages image : astroImagesList) {
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

        List<Days> daysList = daysRepository.findByAstroId(astro.getId());
        List<String> days = daysList.stream().map(e -> e.getDay()).collect(Collectors.toList());

        AvailabilityDTO availabilityDTO = AvailabilityDTO.builder()
                .days(days)
                .build();
        AstroResponse astroResponse = AstroResponse.builder()
                .id(astro.getId())
                .urlSlug(astro.getUrlSlug())
                .namePrefix(astro.getNamePrefix())
                .firstName(astro.getFirstName())
                .lastName(astro.getLastName())
                .aboutMe(astro.getAboutMe())
                .profilePicUrl(astro.getProfliePicUrl())
                .experience(astro.getExperience())
                .minimumCallDuration(astro.getMinimumCallDuration())
                .minimumCallDurationCharges(astro.getMinimumCallDurationCharges())
                .additionalPerMinuteCharges(astro.getAdditionalPerMinuteCharges())
                .isAvailable(astro.isAvailable())
                .rating(astro.getRating())
                .isOnCall(astro.getIsOnCall())
                .images(images)
                .availability(availabilityDTO)
                .build();
        return astroResponse;
    }
}
