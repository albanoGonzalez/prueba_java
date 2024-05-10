package com.example.prueba_java.model;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// This class is where I am going to define the Entity JPA CUENTA
//I am going to create the constructors, getters and setters methods. 
@Entity
@Table(name = "Cuenta")
public class CuentaModel {
    @Id //check it out
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private String id;
	private String nombre;
	private Integer saldo;

	//Constructor by default
	public CuentaModel(){

	}

	// Constructor with parameters
	public CuentaModel(String id, String nombre, Integer saldo) {
		this.id = id;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	// Getters y setters
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
	

}
