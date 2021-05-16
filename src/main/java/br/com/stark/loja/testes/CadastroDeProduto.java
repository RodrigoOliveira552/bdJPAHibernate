package br.com.stark.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.stark.loja.dao.CategoriaDao;
import br.com.stark.loja.dao.ProdutoDao;
import br.com.stark.loja.modelo.Categoria;
import br.com.stark.loja.modelo.Produto;
import br.com.stark.loja.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {
		Categoria celulares = new Categoria("CELULARES");
		Produto celular = new Produto("Xiaomi Redmi", "Muito moderno com 5 câmeras", new BigDecimal("800"), celulares);
	
		//EntityManager gerencia todo o banco de dados, salvar excluir,atualizar etc...
		//EntityManagerFactory factory = Persistence.
			//	createEntityManagerFactory("loja");
	
		//EntityManager em = factory.createEntityManager();
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);
		
		em.getTransaction().begin();
		
		categoriaDao.cadastrar(celulares);
		produtoDao.cadastrar(celular);
		em.getTransaction().commit();
		em.close();
	}
}
