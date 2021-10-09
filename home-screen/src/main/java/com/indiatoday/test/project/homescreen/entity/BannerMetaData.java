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
@Table(name = "banner_meta_data")
public class BannerMetaData {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "professional_slug")
    private String professionalSlug;

    @Column(name = "banner_id")
    private String bannerId;
}
