package com.Universidad.ControlAcademico.entity;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "El nombre no puede ser vacio")
    private String nameStudents;
    @NotBlank(message = "El apellido no puede ser vacio")
    private String lastnamerStudents;
    @Range(min = 19, max = 50)
    private int age;
    @NotBlank(message = "El carnet no puede ser vacio")
    private String carnet;
    @Column
    @Temporal(TemporalType.DATE)
    private Date createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameStudents() {
        return nameStudents;
    }

    public void setNameStudents(String nameStudents) {
        this.nameStudents = nameStudents;
    }

    public String getLastnamerStudents() {
        return lastnamerStudents;
    }

    public void setLastnamerStudents(String lastnamerStudents) {
        this.lastnamerStudents = lastnamerStudents;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
