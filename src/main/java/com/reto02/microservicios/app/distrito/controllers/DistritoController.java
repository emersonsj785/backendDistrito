package com.reto02.microservicios.app.distrito.controllers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reto02.commons.entidad.models.entity.Provincia;
import com.reto02.microservicios.app.distrito.models.entity.Distrito;
import com.reto02.microservicios.app.distrito.services.DistritoService;
import com.reto02.microservicios.app.provincia.micorserviciosprovincia.services.ProvinciaService;
import com.reto02.microservicios.commons.controllers.CommonController;

@RestController
public class DistritoController extends CommonController<Distrito, DistritoService>
{
	/*private final ProvinciaService provinciaService;

    @Autowired
    public DistritoController(DistritoService distritoService, ProvinciaService provinciaService) {
        super();
        this.provinciaService = provinciaService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editar(@RequestBody Distrito distrito, @PathVariable Long id) {
        Optional<Distrito> d = this.service.findById(id);
        if (!d.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Distrito distritoDb = d.get();
        distritoDb.setDescDistrito(distrito.getDescDistrito());

        // Validar provincia
        Provincia provincia = distrito.getProvincia();
        if (provincia != null) {
            Optional<Provincia> provinciaOptional = provinciaService.findById(provincia.getIdProvincia());
            if (!provinciaOptional.isPresent()) {
                return ResponseEntity.badRequest().body("La provincia asociada no existe");
            }
            distritoDb.setProvincia(provinciaOptional.get());
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(distritoDb));
    }*/


}
