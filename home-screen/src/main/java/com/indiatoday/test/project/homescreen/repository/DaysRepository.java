package com.indiatoday.test.project.homescreen.repository;


import com.indiatoday.test.project.homescreen.entity.Days;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DaysRepository extends JpaRepository<Days, Integer> {
    List<Days> findByAstroId(Integer id);
}
