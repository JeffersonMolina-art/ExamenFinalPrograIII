package com.Universidad.ControlAcademico.service;

import com.Universidad.ControlAcademico.dao.DaoGrades;
import com.Universidad.ControlAcademico.entity.Grades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradesServiceImpl implements ServiceGrades{
    @Autowired
    private DaoGrades daoGrades;

    @Override
    public void addNote(Grades grades) {
        daoGrades.save(grades);
    }

    @Override
    public List<Grades> findByStudentsCourse(Long studentId, Long courseId) {
        return daoGrades.findByStudentIdAndCourseId(studentId,courseId);
    }

    @Override
    public List<Grades> findByStudentsId(Long studentId) {
        return daoGrades.findByStudentId(studentId);
    }
}
