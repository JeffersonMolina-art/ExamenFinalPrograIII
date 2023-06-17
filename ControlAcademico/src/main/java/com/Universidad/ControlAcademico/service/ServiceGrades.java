package com.Universidad.ControlAcademico.service;

import com.Universidad.ControlAcademico.entity.Grades;

import java.util.List;

public interface ServiceGrades {
    public void addNote(Grades grades);
    public List<Grades> findByStudentsCourse(Long studentId, Long courseId);
    public List<Grades> findByStudentsId(Long studentId);
}
