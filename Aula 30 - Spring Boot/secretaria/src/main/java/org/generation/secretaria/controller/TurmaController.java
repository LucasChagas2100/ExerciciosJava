package org.generation.secretaria.controller;

import java.util.List;

import org.generation.secretaria.model.Turma;
import org.generation.secretaria.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turma")
@CrossOrigin("*")
public class TurmaController {
	@Autowired
	private TurmaRepository repository;
	
	@GetMapping //Acessa o /turma do requestMapping e passa as turmas no postman pelo GET
	public ResponseEntity<List<Turma>> GetAll(){
		return ResponseEntity.ok(repository.findAll()); //Encontra todas as turmas listadas
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Turma> GetById(@PathVariable long id){
		return repository.findById(id) //procura pelo id
				.map(resp -> ResponseEntity.ok(resp)) //manda resp se estiver ok
				.orElse(ResponseEntity.notFound().build()); //retorna não encontrado
	}
	
	@PostMapping
	public ResponseEntity<Turma> postTurma(@RequestBody Turma turma){ //POST Usado para salvar oque está na body do postman
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(turma));
	}
	
	@PutMapping
	public ResponseEntity<Turma> putTurma(@RequestBody Turma turma){ //PUT Usado para salvar oque está na body do postman
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(turma));
	}
	
	@DeleteMapping("/{id}")
	public void deleteTurma(@PathVariable long id) {
		repository.deleteById(id);
	}

}
