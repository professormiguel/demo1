package com.softlab.professor.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softlab.professor.entities.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UserResources {

	@GetMapping
	public ResponseEntity<Usuario> findAll(){		
		Usuario u = new Usuario(1L, "Miguel Angelo", "biobsexpert@gmail.com", "9.9651-0014", "12345");
		return ResponseEntity.ok().body(u);
	}
}
