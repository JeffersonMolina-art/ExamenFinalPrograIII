package com.Universidad.ControlAcademico.service;

import com.Universidad.ControlAcademico.dao.DaoStudents;
import com.Universidad.ControlAcademico.entity.Students;
import com.Universidad.ControlAcademico.execption.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentsServiceImpl implements ServiceStudents {
    @Autowired
    private DaoStudents daoStudents;

    @Override
    public List<Students> findAll() {
        return (List<Students>)daoStudents.findAll();
    }

    @Override
    public Optional<Students> findById(Long id) {
        Optional<Students> optionalStudent = daoStudents.findById(id);
        if(optionalStudent.isEmpty()){
            throw new NotFoundException("Estudiante no encontrado");
        }
        return optionalStudent;
    }

    @Override
    public List<Students> findByNameStudents(String nameStudents) {
        List<Students> studentsList = daoStudents.findByNameStudents(nameStudents);
        if (studentsList.isEmpty()){
            throw new NotFoundException("El estudiante no encontrado");
        }
        return studentsList;
    }

    @Override
    public void addStudents(Students students) {
        daoStudents.save(students);
        if(students == null){
            throw new NotFoundException("No se puede crear estudiante");
        }
    }

    @Override
    public void modifyStudents(Long id, Students students) {
        if(daoStudents.existsById(id)){
            students.setId(id);
            daoStudents.save(students);
        }else{
            throw new NotFoundException("No se pudo modificar estudiante");
        }

    }

    @Override
    public void deleteStudents(Long id) {
        if(daoStudents.existsById(id)){
            daoStudents.deleteById(id);
        }else {
            throw new NotFoundException("No se pudo eliminar estuidante");
        }
    }
}
