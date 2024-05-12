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
import com.example.prueba_java.repository.AccountRepository;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountRepository cuentaRepository;

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
    public boolean verificarExistenciaYFondos(@PathVariable String id, @PathVariable Integer cantidad) {
        AccountModel cuenta = cuentaRepository.findById(id).orElse(null);
        if (cuenta == null) return false;
        return cuenta.getMoney().compareTo(cantidad) >= 0;
    }

    public void realizarTransferencia(String accountOrigin, String accountDestination, Integer amount) throws Exception {
        AccountModel accountOr = cuentaRepository.findById(accountOrigin)
                                              .orElseThrow(() -> new Exception("Account Origin does not exist"));
        AccountModel accountDest = cuentaRepository.findById(accountDestination)
                                               .orElseThrow(() -> new Exception("Account Destination does not exist"));

        if (accountOr.retirar(amount)) {
            accountDest.depositar(amount);
        } else {
            throw new Exception("Saldo insuficiente para realizar la transferencia");
        }

        cuentaRepository.save(cuentaOrigen);
        cuentaRepository.save(cuentaDestino);
    }
}
