package com.example.prueba_java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba_java.model.AccountModel;
import com.example.prueba_java.model.TransferModel;
import com.example.prueba_java.repository.AccountRepository;
import com.example.prueba_java.repository.TransferRepository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountRepository cuentaRepository;

    @Autowired
    private TransferRepository transferenciaRepository;

    @GetMapping("/cuenta")
    public List<AccountModel> obtenerTodasLasCuentas() {
        return cuentaRepository.findAll();
    }

    @GetMapping("/cuenta/{id}")
    public AccountModel obtenerCuentaPorId(@PathVariable String id) {
        return cuentaRepository.findById(id).orElse(null);
    }
    
    @GetMapping("/cuenta/{id}/existe")
    public boolean existeCuenta(@PathVariable String id){
        return cuentaRepository.existsById(id);
    }

    //This method will be used in the TransferRequest to validate the money and if the account exits
    public boolean ExistsAccountandMoney(String id, Integer cantidad) {
        System.out.println("Account");
        System.out.println(id);
        AccountModel cuenta = cuentaRepository.findById(id).orElse(null);
        System.out.println(cuenta);
        if (cuenta == null) return false;
        return cuenta.getMoney().compareTo(cantidad) >= 0;
    }

    public boolean EnoughMoney(String id, Integer cantidad) {
        System.out.println("Money");
        System.out.println(id);
        AccountModel cuenta = cuentaRepository.findById(id).orElse(null);
        return cuenta.getMoney() >= cantidad;
    }

    public void realizarTransferencia(String nameOrigin, String nameDestination,String accountOrigin, String accountDestination, Integer amount, Date currentDate) throws Exception {
        AccountModel accountOr = cuentaRepository.findById(accountOrigin)
                                              .orElseThrow(() -> new Exception("Account Origin does not exist"));
        AccountModel accountDest = cuentaRepository.findById(accountDestination)
                                               .orElseThrow(() -> new Exception("Account Destination does not exist"));

        if (accountOr.withdraw(amount)) {
            accountDest.deposit(amount);
        } else {
            throw new Exception("Not enough money to make the transfer");
        }

        cuentaRepository.save(accountOr);
        cuentaRepository.save(accountDest);

        TransferModel transfer = new TransferModel(1,nameOrigin, nameDestination,accountOrigin, accountDestination, amount, currentDate);
        transferenciaRepository.save(transfer);
    }
}
