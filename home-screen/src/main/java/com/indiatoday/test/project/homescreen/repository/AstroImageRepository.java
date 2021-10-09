package com.indiatoday.test.project.homescreen.repository;

import com.indiatoday.test.project.homescreen.entity.AstroImages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AstroImageRepository extends JpaRepository<AstroImages, Integer> {
    List<AstroImages> findByAstroId(Integer id);
}
