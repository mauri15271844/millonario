package com.millones.entity;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="Estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(name="name")
    private String name;

    @Column(name="surename")
    private String surename;

    @Column(name="email")
    private String email;

    @Column(name="birthDay")
    private LocalDate birthDay;


    public Estudiante() {
    }

    public Estudiante(String name, String surename, String email, LocalDate birthDay) {
        this.name = name;
        this.surename = surename;
        this.email = email;
        this.birthDay = birthDay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}