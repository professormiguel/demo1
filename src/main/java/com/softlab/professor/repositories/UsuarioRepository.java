package com.softlab.professor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softlab.professor.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
