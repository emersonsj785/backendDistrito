package com.reto02.microservicios.app.distrito.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.reto02.commons.entidad.models.entity.Provincia;

import java.util.Date;

@Entity
@Table(name = "distrito")
public class Distrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddistrito")
    private Long idDistrito;

    @ManyToOne
    @JoinColumn(name = "idprovincia", nullable = false)
    private Provincia provincia;

    @Column(name = "descdistrito")
    private String descDistrito;

    @Column(name = "fecharegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    @PrePersist
    public void prePersist() {
        this.fechaRegistro = new Date();
    }

    // Constructor vacío
    public Distrito() {
    }

    // Constructor con todos los atributos
    public Distrito(Long idDistrito, Provincia provincia, String descDistrito, Date fechaRegistro) {
        this.idDistrito = idDistrito;
        this.provincia = provincia;
        this.descDistrito = descDistrito;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y setters
    public Long getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(Long idDistrito) {
        this.idDistrito = idDistrito;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getDescDistrito() {
        return descDistrito;
    }

    public void setDescDistrito(String descDistrito) {
        this.descDistrito = descDistrito;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}