package com.sv.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sv.modelos.Tienda;

@Repository
public interface Interface_tienda extends CrudRepository<Tienda, Integer>{

	
	
	
}
