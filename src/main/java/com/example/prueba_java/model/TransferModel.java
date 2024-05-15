package com.example.prueba_java.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transfer")
public class TransferModel {
    @Id //check it out
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="NAMEORIGIN")
	private String nameOrigin;
	@Column(name="NAMEDESTINATION")
    private String nameDestination;
	@Column(name="ACCOUNTORIGIN")
    private String accountOrigin;
	@Column(name="ACCOUNTDESTINATION")
    private String accountDestination;
	private Integer amount;
    private Date date;

	//Constructor by default
	public TransferModel(){

	}

	// Constructor with parameters
	public TransferModel( String nameOrigin,String nameDestination,String accountOrigin,String accountDestination,Integer amount, java.util.Date date) {
		this.nameOrigin = nameOrigin;
        this.nameDestination = nameDestination;
        this.accountOrigin = accountOrigin;
        this.accountDestination = accountDestination;
        this.amount = amount;
        this.date = date;
	}
	
	// Getters y setters
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNameOrigin() {
		return nameOrigin;
	}
	
	public void setNaneOrigin(String nameOrigin) {
		this.nameOrigin = nameOrigin;
	}

    public String getNameDestination() {
		return nameDestination;
	}
	
	public void setNameDestination(String nameDestination) {
		this.nameDestination = nameDestination;
	}

    public String getAccountOrigin() {
		return accountOrigin;
	}
	
	public void setAccountOrigin(String accountOrigin) {
		this.accountOrigin = accountOrigin;
	}

    public String getAccountDestination() {
		return accountDestination;
	}
	
	public void setAccountDestination(String accountDestination) {
		this.accountDestination = accountDestination;
	}
	
	public Integer getAmount() {
		return amount;
	}
	
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
    public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
}
