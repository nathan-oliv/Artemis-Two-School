package com.senai.backend.artemis_two_school.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Table(name = "alunos")
@Entity
public class aluno {

    @Column(name = "id")
    private Integer id;

    @Column(name = "turma")
    private String turma;

    @JoinColumn(name = "aluno_id")
    private List<aluno> alunos;

    public aluno() {
    }

    public aluno(Integer id, String turma, List<aluno> alunos) {
        this.id = id;
        this.turma = turma;
        this.alunos = alunos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<aluno> alunos) {
        this.alunos = alunos;
    }
}