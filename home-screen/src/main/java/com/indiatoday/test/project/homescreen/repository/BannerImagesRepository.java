package com.indiatoday.test.project.homescreen.repository;


import com.indiatoday.test.project.homescreen.entity.BannerImages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerImagesRepository extends JpaRepository<BannerImages, Integer> {
    BannerImages findByBannerId(String id);
}
