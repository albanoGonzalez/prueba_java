package com.example.prueba_java.model;

import java.math.BigDecimal;

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
public class AccountModel {
    @Id //check it out
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private String id;
	private String name;
	private Integer money;

	//Constructor by default
	public AccountModel(){

	}

	// Constructor with parameters
	public AccountModel(String id, String name, Integer money) {
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// Getters y setters
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getMoney() {
		return money;
	}
	
	public void setMoney(Integer money) {
		this.money = money;
	}

	//Method to deposit money into the account
	public void deposit(Integer moneyAdd) {
        if (moneyAdd > 0) {
            this.money = money + moneyAdd;
        } else {
            throw new IllegalArgumentException("The total money to deposit have to be greater than zero");
        }
    }
	
	//Method to withdraw money from the account. Returns true if the operation is successful.
	public boolean withdraw(Integer moneyWithdraw) {
        if (moneyWithdraw > 0 && this.money >= 0) {
            this.money = money- moneyWithdraw;
            return true;
        } else if (moneyWithdraw <= 0) {
            throw new IllegalArgumentException("The money to withdraw have to be greater than zero");
        } else {
            return false;
        }
    }

}
