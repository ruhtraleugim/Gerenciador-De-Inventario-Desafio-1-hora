package com.DesafioTec.GerenciadorDeInventario.Controller;

import com.DesafioTec.GerenciadorDeInventario.Model.ProdutoModel;
import com.DesafioTec.GerenciadorDeInventario.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController

@RequestMapping("api/produto")
public class ProdutoController {

    @Autowired
    ProdutoService service;

    @GetMapping("/find-all")
    ResponseEntity<List<ProdutoModel>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/find={id}")
    ResponseEntity<Optional<ProdutoModel>> findById(@PathVariable UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }

    @PostMapping("")
    ResponseEntity save(@RequestBody ProdutoModel model){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveProduto(model));
    }

    @PatchMapping("={id}")
    ResponseEntity<ProdutoModel> update(@PathVariable UUID id, @RequestBody ProdutoModel model){
        return ResponseEntity.status(HttpStatus.OK).body(service.updateProduto(id,model));
    }

    @DeleteMapping("/delete={id}")
    ResponseEntity delete(@PathVariable UUID id){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("");
    }

}