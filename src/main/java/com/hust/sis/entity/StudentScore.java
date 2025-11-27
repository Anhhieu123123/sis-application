package com.hust.sis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "student_score_t")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentScore {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_score_id")
    private Integer studentScoreId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subject_id")
    private Subject subject;
    
    @Column(name = "score1", precision = 5, scale = 2)
    private BigDecimal score1;
    
    @Column(name = "score2", precision = 5, scale = 2)
    private BigDecimal score2;
    
    // Calculate final grade: 0.3 * score1 + 0.7 * score2
    @Transient
    public Double calculateGrade() {
        if (score1 == null || score2 == null) {
            return 0.0;
        }
        return 0.3 * score1.doubleValue() + 0.7 * score2.doubleValue();
    }
    
    // Convert numeric grade to letter grade
    @Transient
    public String getLetterGrade() {
        Double grade = calculateGrade();
        if (grade >= 8.0) {
            return "A";
        } else if (grade >= 6.0) {
            return "B";
        } else if (grade >= 4.0) {
            return "D";
        } else {
            return "F";
        }
    }
}
