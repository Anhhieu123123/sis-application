package com.hust.sis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "subject_t")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Integer subjectId;
    
    @Column(name = "subject_code", nullable = false, length = 20)
    private String subjectCode;
    
    @Column(name = "subject_name", nullable = false, length = 100)
    private String subjectName;
    
    @Column(name = "credit", nullable = false)
    private Integer credit;
}
