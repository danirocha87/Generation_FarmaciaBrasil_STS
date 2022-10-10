package com.FarmaciaBrasil.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity // uso para informar que é uma tabela
@Table(name  = "tb_categoria") // uso para o nome da tabela
public class Categoria {
	
	@Id // uso para fazer a ligação com o banco de dados chave primaria
	@GeneratedValue(strategy =GenerationType.IDENTITY)// uso para ser auto-incremento, que começa uma sequencia numerica iniciando 1;
	private Long id;
	
	@NotBlank(message = "O atributo tipo é obrigatório!")//
	@Size(min = 2, max = 100, message = "O atributo tipo deve conter no minimo 2 e maximo 100 caracteres")
	private String tipo;
	
	@NotBlank(message = "O atributo descrição é obrigatório!")//obrigada a digitar alguma coisa 
	@Size(min = 2, max = 100, message = "O atributo descrição deve conter no minimo 2 e maximo 10 caracteres")//limita o tamanho de minimo e maximo.
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescrição() {
		return descricao;
	}

	public void setDescrição(String descrição) {
		this.descricao = descrição;
	}
	
}
