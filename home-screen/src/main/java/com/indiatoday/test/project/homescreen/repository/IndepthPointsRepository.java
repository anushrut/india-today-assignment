package com.indiatoday.test.project.homescreen.repository;

import com.indiatoday.test.project.homescreen.entity.IndepthPoints;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IndepthPointsRepository extends JpaRepository<IndepthPoints, String> {
    List<IndepthPoints> findByReportsId(Integer toString);
}
