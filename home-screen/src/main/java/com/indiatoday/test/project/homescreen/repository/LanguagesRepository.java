package com.indiatoday.test.project.homescreen.repository;

import com.indiatoday.test.project.homescreen.entity.Languages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguagesRepository extends JpaRepository<Languages, Integer> {
}
