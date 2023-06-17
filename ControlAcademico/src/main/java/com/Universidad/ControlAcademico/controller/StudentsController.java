package com.Universidad.ControlAcademico.controller;

import com.Universidad.ControlAcademico.dao.DaoStudents;
import com.Universidad.ControlAcademico.entity.Students;
import com.Universidad.ControlAcademico.service.ServiceStudents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/students")
public class StudentsController {
    @Autowired
    ServiceStudents serviceStudents;
    //Todos los registros estudiantes
    @GetMapping
    public List<Students> listStudents(){
        return serviceStudents.findAll();
    }
    //Buscar estudiantes por id
    @GetMapping(value = "/{id}")
    public Optional<Students> studentsId(@PathVariable Long id){
        return serviceStudents.findById(id);
    }
    //Registrar nuevo estudiante
    @PostMapping()
    public void addStudents(@Validated @RequestBody Students students){
        serviceStudents.addStudents(students);
    }
    //Modificar estudiante Id
    @PutMapping(value = "/{id}")
    public void modifyStudents(Long id, Students students){
        serviceStudents.modifyStudents(id,students);
    }
    //Eliminar estudiante id
    @DeleteMapping(value = "/{id}")
    public void deleteStudents(Long id){
        serviceStudents.deleteStudents(id);
    }
}
