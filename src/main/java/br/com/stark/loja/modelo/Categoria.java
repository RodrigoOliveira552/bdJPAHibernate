package br.com.stark.loja.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // para dizer que � uma entidade representada
@Table(name = "categorias")
public class Categoria {
	// organizando a constante sem n�mero n�o cria problemas futuros se algu�m
	// quiser mudar a ordem do banco de dados
	/*
	 * CELULARES, INFORMATICA, LIVROS;
	 */
	@Id // para dizer que o id ser� a chave prim�ria
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	public Categoria(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
