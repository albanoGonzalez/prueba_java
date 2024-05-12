package com.example.prueba_java.request;

import java.sql.Date;

public class TransferRequest {
	private Integer id;
	private static String nameOrigin;
    private static String nameDestination;
    private static String accountOrigin;
    private static String accountDestination;
	private static Integer amount;
    private Date date;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public static String getNameOrigin() {
        return nameOrigin;
    }
    public void setNameOrigin(String nameOrigin) {
        this.nameOrigin = nameOrigin;
    }
    public static String getNameDestination() {
        return nameDestination;
    }
    public void setNameDestination(String nameDestination) {
        this.nameDestination = nameDestination;
    }
    public static String getAccountOrigin() {
        return accountOrigin;
    }
    public void setAccountOrigin(String accountOrigin) {
        this.accountOrigin = accountOrigin;
    }
    public static String getAccountDestination() {
        return accountDestination;
    }
    public void setAccountDestination(String accountDestination) {
        this.accountDestination = accountDestination;
    }
    public static Integer getAmount() {
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
