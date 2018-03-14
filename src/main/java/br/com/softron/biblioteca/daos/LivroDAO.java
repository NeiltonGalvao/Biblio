package br.com.softron.biblioteca.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.softron.biblioteca.models.Livro;

@Repository
@Transactional
public class LivroDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Livro livro){
		manager.persist(livro);
	}
	
	public List<Livro> listar(){
	    return manager.createQuery("select l from Livro l", Livro.class).getResultList();
	}	
}