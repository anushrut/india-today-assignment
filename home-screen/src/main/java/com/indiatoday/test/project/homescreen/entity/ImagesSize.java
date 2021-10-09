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

@Table(name = "images_size")


public class ImagesSize {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "image_type")
    private String imageType;

    @Column(name = "horoscopes_id")
    private Integer horoscopeId;
}
