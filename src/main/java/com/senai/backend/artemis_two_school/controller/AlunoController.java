package com.senai.backend.artemis_two_school.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.artemis_two_school.models.aluno;
import com.senai.backend.artemis_two_school.services.AlunoService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    private AlunoService alunoService; 


    @GetMapping("/buscar-aluno/{id}")
    public aluno buscarAluno(@PathVariable Integer id) {
        return alunoService.getAlunoById(id);
    }

    public List<aluno> listarAlunos() {
        return alunoService.getAllAlunos();
    }

    @DeleteMapping("/deletar-aluno/{id}")
    public String deletarAluno(@PathVariable Integer id) {
        if(alunoService.deleteAluno(id)){
            return "Aluno deletado com sucesso";
        } 
            return "Aluno não encontrado";
        }
        @PostMapping("/salvar-aluno")
        public aluno cadastrarAluno(@RequestBody aluno aluno) {
            return alunoService.createAluno(aluno);
        }
        @PutMapping("/atualizar-aluno/{id}")
        public String atualizarAluno(@PathVariable Integer id, 
            @RequestBody aluno aluno) {
            if (alunoService.updateAluno(id, aluno) != null) {
                return "Aluno atualizado com sucesso";
            }
            return "Falha ao atualizar aluno";
        }

        
    }
