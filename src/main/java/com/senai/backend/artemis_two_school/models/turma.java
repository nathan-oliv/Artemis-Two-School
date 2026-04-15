// comente a logica do codigo para fins de estudo
package com.senai.backend.artemis_two_school.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "turmas")
@Entity
public class turma {

    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    public turma() {
    }

    public turma(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}