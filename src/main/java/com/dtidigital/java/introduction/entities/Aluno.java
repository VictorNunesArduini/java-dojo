package com.dtidigital.java.introduction.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID id;
    public String nome;
    public String matricula;
    public String cpf;
    public String email;
}
