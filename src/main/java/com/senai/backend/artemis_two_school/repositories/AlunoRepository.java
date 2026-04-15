package com.senai.backend.artemis_two_school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.artemis_two_school.models.aluno;
    
@Repository
public interface AlunoRepository extends JpaRepository<aluno, Integer>{

}

