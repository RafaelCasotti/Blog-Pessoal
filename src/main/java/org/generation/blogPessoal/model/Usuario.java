package org.generation.blogPessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;



@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Digite um nome.")
	@Size(min = 2, max = 100)
	private String nome; 
	
	@Size(max = 5000)
	private String foto;
	
	@Schema(example = "email@email.com.br")
	@NotNull(message = "Digite um e-mail.")
	@Email(message = "Digite um e-mail válido.")
	@Size(min = 5, max = 100)
	private String usuario;
	
	@NotNull(message = "Digite uma senha.")
	@Size(min = 5, max = 100)
	private String senha;
	
	public Usuario(long id, String nome, String foto, String usuario, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.foto = foto;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public Usuario() { }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	


}
