package com.Universidad.ControlAcademico.service;

import com.Universidad.ControlAcademico.dao.DaoCourse;
import com.Universidad.ControlAcademico.entity.Course;
import com.Universidad.ControlAcademico.entity.Students;
import com.Universidad.ControlAcademico.execption.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements ServiceCourse{
    @Autowired
    private DaoCourse daoCourse;

    @Override
    public List<Course> findAll() {
        return (List<Course>)daoCourse.findAll() ;
    }

    @Override
    public Optional<Course> findById(Long id) {
        Optional<Course> optionalCourse = daoCourse.findById(id);
        if(optionalCourse.isEmpty()){
            throw new NotFoundException("Curso no encontrado");
        }
        return optionalCourse;

    }

    @Override
    public List<Course> findByNameCourse(String nameCourse) {
        List<Course> courseList = daoCourse.findByNameCourse(nameCourse);
        if (courseList.isEmpty()){
            throw new NotFoundException("El curso no encontrado no encontrado");
        }
        return courseList;
    }

    @Override
    public void addCourse(Course course) {
        daoCourse.save(course);
        if (course == null){
            throw new NotFoundException("No se puede crear el curso");
        }
    }

    @Override
    public void modifyCourse(Long id, Course course) {
        if(daoCourse.existsById(id)){
            course.setId(id);
            daoCourse.save(course);
        }else{
            throw new NotFoundException("No se pudo modificar el curso");
        }

    }

    @Override
    public void deleteCourse(Long id) {
        if(daoCourse.existsById(id)){
            daoCourse.deleteById(id);
        }else {
            throw new NotFoundException("No se pudo eliminar estuidante");
        }
    }
}
