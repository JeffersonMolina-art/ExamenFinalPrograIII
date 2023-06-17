package com.Universidad.ControlAcademico.controller;

import com.Universidad.ControlAcademico.entity.Course;
import com.Universidad.ControlAcademico.service.ServiceCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.lang.management.OperatingSystemMXBean;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/course")
public class CourseController {
    @Autowired
    ServiceCourse serviceCourse;
    //Listar todos los cursos
    @GetMapping
    public List<Course> listCourse(){
        return serviceCourse.findAll();
    }
    //obtener curso por id
    @GetMapping(value = "/{id}")
    public Optional<Course> courseId(@PathVariable Long id){
        return serviceCourse.findById(id);
    }
    //Agregar curso
    @PostMapping()
    public void addCourse(@Validated @RequestBody Course course){
        serviceCourse.addCourse(course);
    }
    //Modificar curso
    @PutMapping(value = "/{id}")
    public void modifyCourse(@PathVariable Long id, @RequestBody Course course){
        serviceCourse.modifyCourse(id,course);
    }
    //Eliminar curso
    @DeleteMapping(value = "/{id}")
    public void deleteCourse(@PathVariable Long id){
        serviceCourse.deleteCourse(id);
    }
}
