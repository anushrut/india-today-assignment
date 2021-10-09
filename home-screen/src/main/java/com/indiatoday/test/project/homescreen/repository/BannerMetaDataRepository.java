package com.indiatoday.test.project.homescreen.repository;


import com.indiatoday.test.project.homescreen.entity.BannerMetaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerMetaDataRepository extends JpaRepository<BannerMetaData, Integer> {
    BannerMetaData findByBannerId(String id);
}
