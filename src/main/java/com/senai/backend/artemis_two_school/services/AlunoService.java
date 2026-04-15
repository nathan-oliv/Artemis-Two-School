package com.senai.backend.artemis_two_school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.artemis_two_school.models.aluno;
import com.senai.backend.artemis_two_school.repositories.AlunoRepository;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    public aluno getAlunoById(Integer id) {
        return alunoRepository.findById(id).orElse(null);
    }

    public aluno createAluno(aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public aluno updateAluno(Integer id, aluno aluno) {
        if (alunoRepository.existsById(id)) {
            aluno.setId(id);
            return alunoRepository.save(aluno);
        }
        return null;
    }

    public boolean deleteAluno(Integer id) {
        if (alunoRepository.existsById(id)) {
            alunoRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
