package org.generation.secretaria.repository;

import java.util.List;

import org.generation.secretaria.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	public List<Aluno> findAllByNomeContainingIgnoreCase(String nome); //lista de nomes de alunos parecidos

}
