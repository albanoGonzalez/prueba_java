package com.example.prueba_java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prueba_java.model.CuentaModel;

//with this class I can do the CRUD operations in a relational BBDD

public interface CuentaRepository extends JpaRepository<CuentaModel, String> {
    //long count(); //total rows in the table
}

