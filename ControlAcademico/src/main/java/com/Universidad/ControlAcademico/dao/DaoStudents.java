package com.Universidad.ControlAcademico.dao;

import com.Universidad.ControlAcademico.entity.Students;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DaoStudents extends CrudRepository<Students, Long> {
    List<Students> findByNameStudents(String nameStudents);
}
