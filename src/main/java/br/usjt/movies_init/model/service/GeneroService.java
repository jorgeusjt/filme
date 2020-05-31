package br.usjt.movies_init.model.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.movies_init.model.dao.GeneroDAO;
import br.usjt.movies_init.model.entity.Genero;
@Service
public class GeneroService {
	@Autowired
	private GeneroDAO dao;

	public Genero buscarGenero(int id) throws IOException {
		return dao.buscarGenero(id);
	}

	public List<Genero> listarGeneros() throws IOException{
		return dao.listarGeneros();
	}

}
