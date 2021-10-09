package com.indiatoday.test.project.homescreen.controller;

import com.indiatoday.test.project.homescreen.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
public class IndiaTodayController {

    private static final Logger logger = LoggerFactory.getLogger(IndiaTodayController.class);
    @Autowired
    private BannerService bannerService;
    @Autowired
    private ReportService reportService;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private HoroscopeService horoscopeService;
    @Autowired
    private AstroService astroService;

    @RequestMapping(method = RequestMethod.GET, path = "/banner")
    public Object getBanner() {
        return bannerService.getData();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/report")
    public Object getReport() {
        return reportService.getData();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/question")
    public Object getQuestion() {
        return questionService.getData();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/horoscope")
    public Object getHoroscope() {
        return horoscopeService.getData();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/astro")
    public Object getAstro(@RequestParam Integer id) {
        return astroService.getData(id);
    }
}
