package br.com.softron.biblioteca.models;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String titulo;
	private String autor;
	private String ano;
	private String descricao;
	private int paginas;
	
	@ElementCollection
	private List<Preco> precos;	
	
	public String getTitulo() {
		return titulo;
	} 
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	} 
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getDescricao() {
		return descricao;
	} 
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	} 
	
	public int getPaginas() {
		return paginas;
	} 
	
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	} 
	
	@Override
	public String toString() {
		return "Produto [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + ", descricao=" + descricao + ", paginas=" + paginas ;
	}

}
