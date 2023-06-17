package com.Universidad.ControlAcademico.service;

import com.Universidad.ControlAcademico.entity.Students;

import java.util.List;
import java.util.Optional;

public interface ServiceStudents {
    public List<Students> findAll();
    public Optional<Students> findById(Long id);
    public List<Students> findByNameStudents(String nameStudents);
    public void addStudents(Students students);
    public void modifyStudents(Long id, Students students);
    public void deleteStudents(Long id);
}
