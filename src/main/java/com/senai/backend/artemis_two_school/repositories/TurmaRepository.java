package com.senai.backend.artemis_two_school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.artemis_two_school.models.turma;

@Repository
public interface TurmaRepository extends JpaRepository<turma, Integer>{

}