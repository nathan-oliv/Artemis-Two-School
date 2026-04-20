// comente a logica do codigo para fins de estudo
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

    public List<aluno> getAllAlunos() { // Retorna todos os alunos
        return alunoRepository.findAll(); // Retorna a lista de alunos
    }

    public aluno getAlunoById(Integer id) { // Retorna um aluno pelo ID
        return alunoRepository.findById(id).orElse(null); // Retorna o aluno encontrado ou null
    }

    public aluno createAluno(aluno aluno) { // Cria um novo aluno
        return alunoRepository.save(aluno); // Salva o aluno no repositório
    }

    public aluno updateAluno(Integer id, aluno aluno) { // Atualiza um aluno existente
        if (alunoRepository.existsById(id)) { // Verifica se o aluno existe
            aluno.setId(id); // Define o ID do aluno
            return alunoRepository.save(aluno); // Salva o aluno atualizado
        }
        return null; // Retorna null se o aluno não existir
    }

    public boolean deleteAluno(Integer id) { // Deleta um aluno pelo ID
        if (alunoRepository.existsById(id)) { // Verifica se o aluno existe
            alunoRepository.deleteById(id); // Deleta o aluno
            return true; // Retorna true se o aluno foi deletado
        }
        return false; // Retorna false se o aluno não existir
    }

}
