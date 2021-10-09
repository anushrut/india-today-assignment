package com.indiatoday.test.project.homescreen.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "astro")
public class Astro {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "url_slug")
    private String urlSlug;

    @Column(name = "name_prefix")
    private String namePrefix;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "about_me")
    private String aboutMe;

    @Column(name = "proflie_pic_url")
    private String profliePicUrl;

    @Column(name = "experience")
    private Double experience;

    @Column(name = "is_on_call")
    private Boolean isOnCall;

    @Column(name = "minimum_call_duration")
    private Integer minimumCallDuration;

    @Column(name = "minimum_call_duration_charges")
    private Double minimumCallDurationCharges;

    @Column(name = "additional_per_minute_charges")
    private double additionalPerMinuteCharges;

    @Column(name = "is_available")
    private boolean isAvailable;

    @Column(name = "rating")
    private Integer rating;


}

