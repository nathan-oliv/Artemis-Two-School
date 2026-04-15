package com.senai.backend.artemis_two_school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.artemis_two_school.models.turma;
import com.senai.backend.artemis_two_school.repositories.TurmaRepository;

@Service
public class TurmaServices {

    @Autowired
    private TurmaRepository turmaRepository;

    public List<turma> getAllTurmas() {
        return turmaRepository.findAll();
    }

    public turma getTurmaById(Integer id) {
        return turmaRepository.findById(id).orElse(null);
    }

    public turma createTurma(turma turma) {
        return turmaRepository.save(turma);
    }

    public turma updateTurma(Integer id, turma turma) {
        if (turmaRepository.existsById(id)) {
            turma.setId(id);
            return turmaRepository.save(turma);
        }
        return null;
    }

    public boolean deleteTurma(Integer id) {
        if (turmaRepository.existsById(id)) {
            turmaRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
