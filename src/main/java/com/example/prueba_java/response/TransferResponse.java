package com.example.prueba_java.response;

import java.util.Date;

public class TransferResponse {
    private Integer id;
	private String nameOrigin;
    private String nameDestination;
    private String accountOrigin;
    private String accountDestination;
	private Integer amount;
    private Date date;
    private Integer status; //error
    private String message; //error
    
    public TransferResponse(Integer id, String nameOrigin, String nameDestination, String accountOrigin,
            String accountDestination, Integer amount, java.util.Date date) {
            this.id = id;
            this.nameOrigin = nameOrigin;
            this.nameDestination = nameDestination;
            this.accountOrigin = accountOrigin;
            this.accountDestination = accountDestination;
            this.amount = amount;
            this.date = date;
    }

    //Constructor for errors
    public TransferResponse(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public TransferResponse() {
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
  
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
