package com.reto02.microservicios.app.distrito.services;
import org.springframework.stereotype.Service;

import com.reto02.microservicios.app.distrito.models.entity.Distrito;
import com.reto02.microservicios.app.distrito.models.repository.DistritoRepository;
import com.reto02.microservicios.commons.services.CommonServiceImpl;

@Service
public class DistritoServiceImpl extends CommonServiceImpl<Distrito, DistritoRepository> implements DistritoService
{
	
}
