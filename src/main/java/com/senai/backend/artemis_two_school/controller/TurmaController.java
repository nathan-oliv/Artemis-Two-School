package com.senai.backend.artemis_two_school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.senai.backend.artemis_two_school.models.turma;
import com.senai.backend.artemis_two_school.services.TurmaServices;


@RestController
@RequestMapping("/turma")
public class TurmaController {


    @Autowired
    private TurmaServices turmaServices;


    @GetMapping("/buscar-turma/{id}")
    public turma buscarTurma(@PathVariable Integer id){
        return turmaServices.getTurmaById(id);
    }

    @GetMapping("/listar-turmas")
    public List<turma> listarTurmas(){
        return turmaServices.getAllTurmas();
    }

    @DeleteMapping("/deletar-turma/{id}")
    public String deletarTurma(@PathVariable Integer id){
        if (turmaServices.deleteTurma(id)){
            return "Turma deletada com sucesso";
        }
        return "Erro ao deletar turma";
    }

    @PostMapping("/salvar-turma")
    public turma cadastrarTurma(@RequestBody turma turma){
        return turmaServices.createTurma(turma);
    }

    @PutMapping("/atualizar-turma/{id}")
    public String atualizarTurma(
        @PathVariable Integer id,
        @RequestBody turma turma
    ){
        if (turmaServices.updateTurma(id, turma) != null){
            return "Turma atualizada com sucesso";
        }
        return "Erro ao atualizar turma";
    }
}



