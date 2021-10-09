package com.indiatoday.test.project.homescreen.repository;


import com.indiatoday.test.project.homescreen.entity.Suggestions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuggestionsRepository extends JpaRepository<Suggestions, Integer> {
    List<Suggestions> findByQuestionsId(Integer id);
}
