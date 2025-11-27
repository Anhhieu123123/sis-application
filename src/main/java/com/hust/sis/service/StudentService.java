package com.hust.sis.service;

import com.hust.sis.entity.Student;
import com.hust.sis.entity.StudentScore;
import com.hust.sis.entity.Subject;
import com.hust.sis.repository.StudentRepository;
import com.hust.sis.repository.StudentScoreRepository;
import com.hust.sis.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;
    
    @Autowired
    private SubjectRepository subjectRepository;
    
    @Autowired
    private StudentScoreRepository studentScoreRepository;
    
    // Student operations
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }
    
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
    
    // Subject operations
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
    
    public Subject getSubjectById(Integer id) {
        return subjectRepository.findById(id).orElse(null);
    }
    
    // StudentScore operations
    public List<StudentScore> getAllScores() {
        return studentScoreRepository.findAll();
    }
    
    public List<StudentScore> getScoresByStudentId(Integer studentId) {
        return studentScoreRepository.findByStudentStudentId(studentId);
    }
    
    public StudentScore getScoreById(Integer id) {
        return studentScoreRepository.findById(id).orElse(null);
    }
    
    public StudentScore saveScore(StudentScore score) {
        return studentScoreRepository.save(score);
    }
    
    public void deleteScore(Integer id) {
        studentScoreRepository.deleteById(id);
    }
}
