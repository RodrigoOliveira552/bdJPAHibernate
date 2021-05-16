package br.com.stark.loja.dao;

import javax.persistence.EntityManager;

import br.com.stark.loja.modelo.Produto;

public class ProdutoDao {

	private EntityManager em;

	public ProdutoDao(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Produto produto ) {
		this.em.persist(produto);
	}
	
	
}
