package com.example.prueba_java.request;

import java.sql.Date;

public class TransferRequest {
	private String nombreOrigen;
    private String nombreDestino;
    private String cuentaOrigen;
    private String cuentaDestino;
	private Integer cantidad;
    
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

    
}
