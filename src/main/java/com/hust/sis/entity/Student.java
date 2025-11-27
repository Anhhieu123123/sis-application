package com.hust.sis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student_t")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer studentId;
    
    @Column(name = "student_code", nullable = false, length = 20)
    private String studentCode;
    
    @Column(name = "full_name", nullable = false, length = 100)
    private String fullName;
    
    @Column(name = "address", length = 255)
    private String address;
    
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<StudentScore> scores = new ArrayList<>();
}
