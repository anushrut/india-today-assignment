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

@Table(name = "skills")


public class Availability {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "days")
    private String days;

    @Column(name = "astro_id")
    private Integer astro_id;

}

