package com.example.prueba_java.response;

import java.util.Date;

public class TransferResponse {
    private Integer id;
    private String nombreOrigen;
    private String nombreDestino;
    private String cuentaOrigen;
    private String cuentaDestino;
	private Integer cantidad;
    private Date date;
    private Integer status; //error
    private String message; //error
    
    public TransferResponse(Integer id, String nombreOrigen, String nombreDestino, String cuentaOrigen,
            String cuentaDestino, Integer cantidad, java.util.Date fecha) {
        this.id = id;
        this.nombreOrigen = nombreOrigen;
        this.nombreDestino = nombreDestino;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.cantidad = cantidad;
        this.date = date;
    }

    //Constructor for errors
    public TransferResponse(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public TransferResponse() {
    }

    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
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
