package com.example.prueba_java.controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired //Important -- automatically inject an instance
    private AccountController accountCont;

    @PutMapping("transferencia/estado")
    public ResponseEntity<TransferResponse> estadoTransferencia(@RequestBody TransferRequest transferRequest){
     
        try{
            String nameOrigin = transferRequest.getNameOrigin();
            String nameDestination = transferRequest.getNameDestination();
            String accountOrigin = transferRequest.getAccountOrigin();
            String accountDestination = transferRequest.getAccountDestination();
	        Integer amount = transferRequest.getAmount();

            LocalDateTime now = LocalDateTime.now();
            Date currentDate = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
            System.out.println(currentDate);
            
            // verify the accounts and the money in each account
            System.out.println(accountOrigin);
            System.out.println(amount);
            boolean originValid = accountCont.ExistsAccountandMoney(accountOrigin, amount);
            boolean destinationValid = accountCont.ExistsAccountandMoney(accountDestination, 0);
            System.out.println(originValid);
            System.out.println(destinationValid);
            //if it's true both accounts will be on the table and they have money
            //Now we are gonna check if the origin has enough money to make it 
            //CURRENCY¿??? IMPORTANT TO CHECK THIS - If i have time do it - API Currency

            boolean enoughMoney = accountCont.EnoughMoney(accountOrigin, amount);
            System.out.println(enoughMoney);

            if (!originValid || !destinationValid || !enoughMoney) {
                throw new Exception("Verification of failed accounts: make sure that both accounts exist and that the source account has sufficient funds.");
            }
            System.out.println("ok");

            // Realizar la transferencia
            accountCont.realizarTransferencia(nameOrigin, nameDestination, accountOrigin, accountDestination, amount,currentDate);
            return ResponseEntity.ok(new TransferResponse(1, nameOrigin, nameDestination,
            accountOrigin, accountDestination,amount, currentDate));
           // return ResponseEntity.ok(new TransferResponse(1,"dummu","dd","ddd",
           // "dsssd",34,"2024-04-19")) ;


        }catch (Exception e ){ return ResponseEntity.badRequest().body(new TransferResponse(400,"Error en la transferencia: " + e.getMessage()));}
    }
}
