package com.indiatoday.test.project.homescreen.repository;

import com.indiatoday.test.project.homescreen.entity.AvailableLanguages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvailableLanguagesRepository extends JpaRepository<AvailableLanguages, String> {
    List<AvailableLanguages> findByReportsId(Integer toString);
}
