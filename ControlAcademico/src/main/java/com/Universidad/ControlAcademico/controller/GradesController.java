package com.Universidad.ControlAcademico.controller;

import com.Universidad.ControlAcademico.dao.DaoCourse;
import com.Universidad.ControlAcademico.entity.Course;
import com.Universidad.ControlAcademico.entity.Grades;
import com.Universidad.ControlAcademico.execption.NotFoundException;
import com.Universidad.ControlAcademico.service.ServiceGrades;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/grades")
public class GradesController {
    @Autowired
    ServiceGrades serviceGrades;
    @PostMapping()
    public void addGrade(@Validated @RequestBody Grades grades) {
        serviceGrades.addNote(grades);
    }
    @GetMapping("/student/{studentId}/course/{courseId}")
    public ResponseEntity<List<Grades>> getStudetnAndCourse(@PathVariable Long studentId,@PathVariable Long courseId ){
        List<Grades> grades = serviceGrades.findByStudentsCourse(studentId,courseId);
        if (!grades.isEmpty()) {
            return ResponseEntity.ok(grades);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/student/{studentId}")
    public List<Grades> getStudetnsId(@PathVariable Long studentId){
        return serviceGrades.findByStudentsId(studentId);
    }
}
