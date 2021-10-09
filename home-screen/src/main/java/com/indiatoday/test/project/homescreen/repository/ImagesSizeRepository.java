package com.indiatoday.test.project.homescreen.repository;

import com.indiatoday.test.project.homescreen.entity.ImagesSize;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImagesSizeRepository extends JpaRepository<ImagesSize, Integer> {
    List<ImagesSize> findByHoroscopeId(Integer id);
}
