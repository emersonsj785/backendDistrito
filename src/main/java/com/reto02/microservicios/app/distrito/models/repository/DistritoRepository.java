package com.reto02.microservicios.app.distrito.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.reto02.microservicios.app.distrito.models.entity.Distrito;

public interface DistritoRepository extends CrudRepository<Distrito, Long>
{
	
}
