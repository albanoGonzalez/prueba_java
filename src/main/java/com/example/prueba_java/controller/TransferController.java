package com.example.prueba_java.controller;

import java.math.BigDecimal;

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

    private AccountController accountCont;

    @PutMapping("transferencia/estado")
    public ResponseEntity<TransferResponse> estadoTransferencia(@RequestBody TransferRequest transferRequest){
     
        try{
            String nameOrigin = TransferRequest.getNameOrigin();
            String nameDestination = TransferRequest.getNameDestination();
            String accountOrigin = TransferRequest.getAccountOrigin();
            String accountDestination = TransferRequest.getAccountDestination();
	        Integer amount = TransferRequest.getAmount();

            // verify the accounts and the money in each account
            System.out.println(accountOrigin);
            boolean origenValido = accountCont.ExistsAccountandMoney(accountOrigin, amount);
            //boolean destinoValido = accountCont.ExistsAccountandMoney(accountDestination, 0);
            System.out.println(origenValido);

            
            System.out.println("todo bien");

            return ResponseEntity.ok(new TransferResponse(1,"dummu","dd","ddd",
            "dsssd",34,"2024-04-19")) ;

        }catch (Exception e ){ return ResponseEntity.badRequest().body(new TransferResponse(400,"Error en la transferencia: " + e.getMessage()));}
    }
}
