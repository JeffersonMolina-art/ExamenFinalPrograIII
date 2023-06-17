package com.Universidad.ControlAcademico.dao;

import com.Universidad.ControlAcademico.entity.Grades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DaoGrades extends CrudRepository<Grades, Long> {
    List<Grades> findByStudentId(Long studentId);
    List<Grades> findByStudentIdAndCourseId(Long studentId, Long courseId);
}
