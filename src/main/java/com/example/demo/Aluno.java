package com.example.demo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "alunoId")
	public Long alunoId;
	@Column(name = "nome", columnDefinition="VARCHAR(60)", nullable = false)
	public String nome;
	@Column(name = "cpf", columnDefinition="VARCHAR(11)", unique = true, nullable = false)
	public String cpf;
	@Column(name = "rg", columnDefinition="VARCHAR(10)", nullable = false)
	public String rg;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "enderecoId")
    public Endereco endereco;
}
