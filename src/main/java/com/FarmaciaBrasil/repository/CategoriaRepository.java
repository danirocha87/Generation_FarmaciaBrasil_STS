package com.FarmaciaBrasil.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FarmaciaBrasil.model.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{
	//Aqui preciso importa Repository,JpaRepository e Categoria.
	
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}
