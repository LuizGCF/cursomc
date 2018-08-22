package com.luizgcf.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizgcf.cursomc.domain.Categoria;
import com.luizgcf.cursomc.repositories.CategoriaRepository;
import com.luizgcf.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não encontrado! Id: "+id+", Tipo: "+Categoria.class.getName()));
	}
}
