package br.com.stark.loja.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // para dizer que é uma entidade representada
@Table(name = "categorias")
public class Categoria {
	// organizando a constante sem número não cria problemas futuros se alguém
	// quiser mudar a ordem do banco de dados
	/*
	 * CELULARES, INFORMATICA, LIVROS;
	 */
	@Id // para dizer que o id será a chave primária
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
