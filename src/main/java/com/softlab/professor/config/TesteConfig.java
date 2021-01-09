package com.softlab.professor.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.softlab.professor.entities.Usuario;
import com.softlab.professor.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void run(String... args) throws Exception {
	
		Usuario u1 = new Usuario(null, "Miguel", "biobsexpert@gmail.com", "(67)9.9651-0014", "123456");
		Usuario u2 = new Usuario(null, "Maria", "maria@gmail.com", "(67)9.5896-2589", "aadfg");
		Usuario u3 = new Usuario(null, "Geovana", "geovana@gmail.com", "(67)9.8555-1514", "geo10");
		Usuario u4 = new Usuario(null, "Andreza", "andreza@gmail.com", "(67)9.7896-3214", "drezaan");
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2,u3,u4));
		
	}
}
