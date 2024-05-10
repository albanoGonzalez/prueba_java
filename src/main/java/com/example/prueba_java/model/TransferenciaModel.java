package com.example.prueba_java.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Transferencia")
public class TransferenciaModel {
    @Id //check it out
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombreOrigen;
    private String nombreDestino;
    private String cuentaOrigen;
    private String cuentaDestino;
	private Integer cantidad;
    private Date fecha;

	//Constructor by default
	//public Transferencia(){

	//}

	// Constructor with parameters
	public TransferenciaModel(Integer id, String nombreOrigen,String nombreDestino,String cuentaOrigen,String cuentaDestino,Integer cantidad, Date fecha) {
		this.id = id;
		this.nombreOrigen = nombreOrigen;
        this.nombreDestino = nombreDestino;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.cantidad = cantidad;
        this.fecha = fecha;
	}
	
	// Getters y setters
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombreOrigen() {
		return nombreOrigen;
	}
	
	public void setNombreOrigen(String nombreOrigen) {
		this.nombreOrigen = nombreOrigen;
	}

    public String getNombreDestino() {
		return nombreDestino;
	}
	
	public void setNombreDestino(String nombreDestino) {
		this.nombreDestino = nombreDestino;
	}

    public String getCuentaOrigen() {
		return cuentaOrigen;
	}
	
	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

    public String getCuentaDestino() {
		return cuentaDestino;
	}
	
	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	
	public Integer getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
    public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
