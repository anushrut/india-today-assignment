package com.indiatoday.test.project.homescreen.repository;


import com.indiatoday.test.project.homescreen.entity.Reports;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Reports, String> {
}
