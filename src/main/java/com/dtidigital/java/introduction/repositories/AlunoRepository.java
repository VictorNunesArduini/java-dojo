package com.dtidigital.java.introduction.repositories;

import com.dtidigital.java.introduction.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlunoRepository extends JpaRepository<Aluno, UUID> {
}
