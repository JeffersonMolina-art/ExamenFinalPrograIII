package com.Universidad.ControlAcademico.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "El nombre del curso no puede ser vacio")
    private String nameCourse;
    @NotBlank(message = "El nombre del maestro no puede ser vacio")
    private String teacher;
    @NotBlank(message = "El codigo del curso no puede ser vacio")
    private String codigoCourse;
    @NotBlank(message = "El numero del maestro no puede ser vacio")
    private String numberPhoneTeacher;
    @Column
    @Temporal(TemporalType.DATE)
    private Date createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCodigoCourse() {
        return codigoCourse;
    }

    public void setCodigoCourse(String codigoCourse) {
        this.codigoCourse = codigoCourse;
    }

    public String getNumberPhoneTeacher() {
        return numberPhoneTeacher;
    }

    public void setNumberPhoneTeacher(String numberPhoneTeacher) {
        this.numberPhoneTeacher = numberPhoneTeacher;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
