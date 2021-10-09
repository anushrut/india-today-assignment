package com.indiatoday.test.project.homescreen.repository;

import com.indiatoday.test.project.homescreen.entity.Horoscopes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoroscopesRepository extends JpaRepository<Horoscopes, Integer> {
}
