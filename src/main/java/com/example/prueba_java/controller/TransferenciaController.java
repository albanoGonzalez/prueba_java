package com.example.prueba_java.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba_java.model.TransferenciaModel;
import com.example.prueba_java.repository.TransferenciaRepository;
import com.example.prueba_java.request.TransferRequest;
import com.example.prueba_java.response.TransferResponse;

@RestController
public class TransferenciaController {

    @PutMapping("transferencia/estado")
    public ResponseEntity<TransferResponse> estadoTransferencia(@RequestBody TransferRequest transferRequest){
        System.out.println("todo bien");
        return ResponseEntity.ok(new TransferResponse(1,"dummu","dd","ddd",
        "dsssd",34,"2024-04-19")) ;
    }
}
