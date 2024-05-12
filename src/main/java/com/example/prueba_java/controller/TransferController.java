package com.example.prueba_java.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba_java.model.TransferModel;
import com.example.prueba_java.repository.TransferRepository;
import com.example.prueba_java.request.TransferRequest;
import com.example.prueba_java.response.TransferResponse;

@RestController
public class TransferController {

    @PutMapping("transferencia/estado")
    public ResponseEntity<TransferResponse> estadoTransferencia(@RequestBody TransferRequest transferRequest){
     
        try{
            System.out.println("todo bien");

            return ResponseEntity.ok(new TransferResponse(1,"dummu","dd","ddd",
            "dsssd",34,"2024-04-19")) ;

        }catch (Exception e ){ return ResponseEntity.badRequest().body(new TransferResponse(400,"Error en la transferencia: " + e.getMessage()));}
    }
}
