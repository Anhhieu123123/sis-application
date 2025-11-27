package com.hust.sis.repository;

import com.hust.sis.entity.StudentScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentScoreRepository extends JpaRepository<StudentScore, Integer> {
    List<StudentScore> findByStudentStudentId(Integer studentId);
}
