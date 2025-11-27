package com.hust.sis.controller;

import com.hust.sis.entity.Student;
import com.hust.sis.entity.StudentScore;
import com.hust.sis.entity.Subject;
import com.hust.sis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class StudentController {
    
    @Autowired
    private StudentService studentService;
    
    // Display all students and their scores
    @GetMapping("/")
    public String index(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "index";
    }
    
    // Show add student form
    @GetMapping("/add-student")
    public String showAddStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }
    
    // Save new student
    @PostMapping("/save-student")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/";
    }
    
    // Show edit student form
    @GetMapping("/edit-student/{id}")
    public String showEditStudentForm(@PathVariable("id") Integer id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "edit-student";
    }
    
    // Update student
    @PostMapping("/update-student/{id}")
    public String updateStudent(@PathVariable("id") Integer id, @ModelAttribute("student") Student student) {
        student.setStudentId(id);
        studentService.saveStudent(student);
        return "redirect:/";
    }
    
    // Delete student
    @GetMapping("/delete-student/{id}")
    public String deleteStudent(@PathVariable("id") Integer id) {
        studentService.deleteStudent(id);
        return "redirect:/";
    }
    
    // Show add score form
    @GetMapping("/add-score")
    public String showAddScoreForm(Model model) {
        List<Student> students = studentService.getAllStudents();
        List<Subject> subjects = studentService.getAllSubjects();
        model.addAttribute("students", students);
        model.addAttribute("subjects", subjects);
        model.addAttribute("studentScore", new StudentScore());
        return "add-score";
    }
    
    // Save new score
    @PostMapping("/save-score")
    public String saveScore(@RequestParam("studentId") Integer studentId,
                           @RequestParam("subjectId") Integer subjectId,
                           @RequestParam("score1") BigDecimal score1,
                           @RequestParam("score2") BigDecimal score2) {
        
        Student student = studentService.getStudentById(studentId);
        Subject subject = studentService.getSubjectById(subjectId);
        
        StudentScore studentScore = new StudentScore();
        studentScore.setStudent(student);
        studentScore.setSubject(subject);
        studentScore.setScore1(score1);
        studentScore.setScore2(score2);
        
        studentService.saveScore(studentScore);
        return "redirect:/";
    }
    
    // Show edit score form
    @GetMapping("/edit-score/{id}")
    public String showEditScoreForm(@PathVariable("id") Integer id, Model model) {
        StudentScore score = studentService.getScoreById(id);
        List<Student> students = studentService.getAllStudents();
        List<Subject> subjects = studentService.getAllSubjects();
        
        model.addAttribute("score", score);
        model.addAttribute("students", students);
        model.addAttribute("subjects", subjects);
        return "edit-score";
    }
    
    // Update score
    @PostMapping("/update-score/{id}")
    public String updateScore(@PathVariable("id") Integer id,
                             @RequestParam("studentId") Integer studentId,
                             @RequestParam("subjectId") Integer subjectId,
                             @RequestParam("score1") BigDecimal score1,
                             @RequestParam("score2") BigDecimal score2) {
        
        Student student = studentService.getStudentById(studentId);
        Subject subject = studentService.getSubjectById(subjectId);
        
        StudentScore studentScore = studentService.getScoreById(id);
        studentScore.setStudent(student);
        studentScore.setSubject(subject);
        studentScore.setScore1(score1);
        studentScore.setScore2(score2);
        
        studentService.saveScore(studentScore);
        return "redirect:/";
    }
    
    // Delete score
    @GetMapping("/delete-score/{id}")
    public String deleteScore(@PathVariable("id") Integer id) {
        studentService.deleteScore(id);
        return "redirect:/";
    }
}
