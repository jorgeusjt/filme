package br.usjt.movies_init.model.dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.usjt.movies_init.model.entity.Genero;
/* Jorge Sampaio De Lima RA:81513901*/
@Repository
public class GeneroDAO {
	@PersistenceContext
	EntityManager manager;

	public Genero buscarGenero(int id) throws IOException {
		return manager.find(Genero.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Genero> listarGeneros() throws IOException {
		return manager.createQuery("select g from Genero g").getResultList();
	}
}
