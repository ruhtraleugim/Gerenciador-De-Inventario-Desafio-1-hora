package com.DesafioTec.GerenciadorDeInventario.Controller;

import com.DesafioTec.GerenciadorDeInventario.Model.FornecedorModel;
import com.DesafioTec.GerenciadorDeInventario.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/forncedor")
public class FornecedorController{
    @Autowired
    FornecedorService service;

    @GetMapping("/find-all")
    ResponseEntity<List<FornecedorModel>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/find={id}")
    ResponseEntity<Optional<FornecedorModel>> findById(@PathVariable UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }

    @PostMapping("")
    ResponseEntity save(@RequestBody FornecedorModel model){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addFornecedor(model));
    }

    @PatchMapping("={id}")
    ResponseEntity<FornecedorModel> update(@PathVariable UUID id, @RequestBody FornecedorModel model){
        return ResponseEntity.status(HttpStatus.OK).body(service.updateFornecedor(id,model));
    }
    @DeleteMapping("/delete={id}")
    ResponseEntity delete(@PathVariable UUID id){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("");
    }
}
