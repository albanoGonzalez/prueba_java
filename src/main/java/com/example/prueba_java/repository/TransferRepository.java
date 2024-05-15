package com.example.prueba_java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prueba_java.model.TransferModel;

public interface TransferRepository extends JpaRepository<TransferModel, Integer> {
    //long count(); //total rows in the table
}

