package com.dtidigital.java.introduction.service;

import com.dtidigital.java.introduction.entities.Aluno;

import java.util.List;
import java.util.UUID;

public interface AlunoService {
    void saveAluno(Aluno product);

    List<Aluno> listAlunos();

    Aluno findAluno(UUID identifier);
}
