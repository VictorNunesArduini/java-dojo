package com.dtidigital.java.introduction.service.impl;

import com.dtidigital.java.introduction.entities.Aluno;
import com.dtidigital.java.introduction.repositories.AlunoRepository;
import com.dtidigital.java.introduction.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AlunoServiceImpl implements AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public void saveAluno(Aluno product) {
        alunoRepository.save(product);
    }

    public List<Aluno> listAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno findAluno(UUID identifier) {
        final Optional<Aluno> optionalAluno = alunoRepository.findById(identifier);
        return optionalAluno.orElse(null);
    }
}
