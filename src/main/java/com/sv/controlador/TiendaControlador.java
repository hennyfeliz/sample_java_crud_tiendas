package com.sv.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.modelos.Tienda;
import com.sv.repository.Interface_tienda;

@RestController
@RequestMapping("/Tienda")
public class TiendaControlador {

	@Autowired
	private Interface_tienda interfaceTienda;
	
	@GetMapping
	public List<Tienda> tiendas(){
		return (List<Tienda>) interfaceTienda.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody Tienda us){
		interfaceTienda.save(us);
	}

	@PutMapping 
	public void modificar(@RequestBody Tienda us){
		interfaceTienda.save(us);
	}
	
	/*
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") String id_tienda)
	{
		interfaceTienda.delete(id_tienda);
	}
	*/
	
}
