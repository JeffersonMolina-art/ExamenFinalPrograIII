package com.Universidad.ControlAcademico.dao;

import com.Universidad.ControlAcademico.entity.Course;
import com.Universidad.ControlAcademico.entity.Students;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DaoCourse extends CrudRepository<Course, Long> {
    List<Course> findByNameCourse(String nameCourse);
}
