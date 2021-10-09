package com.indiatoday.test.project.homescreen.service;

import com.indiatoday.test.project.homescreen.dto.ReportDTO;
import com.indiatoday.test.project.homescreen.dto.ReportDataDTO;
import com.indiatoday.test.project.homescreen.entity.AvailableLanguages;
import com.indiatoday.test.project.homescreen.entity.IndepthPoints;
import com.indiatoday.test.project.homescreen.entity.Reports;
import com.indiatoday.test.project.homescreen.repository.AvailableLanguagesRepository;
import com.indiatoday.test.project.homescreen.repository.IndepthPointsRepository;
import com.indiatoday.test.project.homescreen.repository.ReportRepository;
import com.indiatoday.test.project.homescreen.response.ReportResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportService {
    @Autowired
    ReportRepository reportRepository;
    @Autowired
    AvailableLanguagesRepository availableLanguagesRepository;
    @Autowired
    IndepthPointsRepository indepthPointsRepository;

    public ReportResponse getData() {
        List<Reports> reportsList = reportRepository.findAll();
        List<ReportDTO> reportDTOS = new ArrayList<>();

        for (Reports report : reportsList) {
            List<AvailableLanguages> languagesList = availableLanguagesRepository.findByReportsId(report.getId());
            List<IndepthPoints> indepthPointsList = indepthPointsRepository.findByReportsId(report.getId());
            List<String> langList = languagesList.stream().map(e -> e.getLangValue()).collect(Collectors.toList());
            List<String> pointList = indepthPointsList.stream().map(e -> e.getPointValue()).collect(Collectors.toList());
            ReportDTO reportDTO = ReportDTO.builder()
                    .availableLanguages(langList)
                    .indepthPoints(pointList)
                    .description(report.getDescription())
                    .name(report.getName())
                    .imageUrl(report.getImageUrl())
                    .offerPrice(report.getOfferPrice())
                    .productCode(report.getProductCode())
                    .price(report.getPrice())
                    .build();
            reportDTOS.add(reportDTO);
        }

        ReportDataDTO reportDataDTO = ReportDataDTO.builder().services(reportDTOS).build();
        ReportResponse reportResponse = ReportResponse.builder()
                .httpStatus("OK")
                .httpStatusCode(200)
                .success(true)
                .message("Services fetched successfully.")
                .apiName("Get all services.")
                .data(reportDataDTO)
                .build();
        return reportResponse;
    }
}
