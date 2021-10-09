package com.indiatoday.test.project.homescreen.repository;


import com.indiatoday.test.project.homescreen.entity.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerRepository extends JpaRepository<Banner, Integer> {
}
