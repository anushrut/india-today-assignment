package com.indiatoday.test.project.homescreen.repository;

import com.indiatoday.test.project.homescreen.entity.Astro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AstroRepository extends JpaRepository<Astro, Integer> {
}
