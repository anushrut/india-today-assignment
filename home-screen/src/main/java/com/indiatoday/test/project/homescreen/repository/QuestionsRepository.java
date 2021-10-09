package com.indiatoday.test.project.homescreen.repository;

import com.indiatoday.test.project.homescreen.entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionsRepository extends JpaRepository<Questions, String> {
}
