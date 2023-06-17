package com.Universidad.ControlAcademico.service;

import com.Universidad.ControlAcademico.entity.Course;

import java.util.List;
import java.util.Optional;

public interface ServiceCourse {
    public List<Course> findAll();
    public Optional<Course> findById(Long id);
    public List<Course> findByNameCourse(String nameCourse);
    public void addCourse(Course course);
    public void modifyCourse(Long id, Course course);
    public void deleteCourse(Long id);
}
