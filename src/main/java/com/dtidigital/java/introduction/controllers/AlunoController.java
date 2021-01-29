package com.dtidigital.java.introduction.controllers;

import com.dtidigital.java.introduction.entities.Aluno;
import com.dtidigital.java.introduction.repositories.AlunoRepository;
import com.dtidigital.java.introduction.service.AlunoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
@AllArgsConstructor
public class AlunoController {
    public AlunoService alunoService;

    @GetMapping(value = "/Alunos")
    public ResponseEntity<List<Aluno>> getAlunos() {
        List<Aluno> alunos = alunoService.listAlunos();
        if(!alunos.isEmpty())
            return ResponseEntity.ok(alunos);
        return ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/Alunos")
    public ResponseEntity<String> setAluno(@RequestBody Aluno aluno) {
        alunoService.saveAluno(aluno);
        return ResponseEntity.ok("inserido");
    }
}
