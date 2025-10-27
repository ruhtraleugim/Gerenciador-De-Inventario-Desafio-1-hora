package com.DesafioTec.GerenciadorDeInventario.service;

import com.DesafioTec.GerenciadorDeInventario.Model.FornecedorModel;
import com.DesafioTec.GerenciadorDeInventario.repository.FornecedorRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepositoty repo;

    public List<FornecedorModel> findAll(){
        return repo.findAll();
    }

    public Optional<FornecedorModel> findById(UUID id){
        return repo.findById(id);
    }

    public FornecedorModel addFornecedor(FornecedorModel fornecedor){
        return repo.save(fornecedor);
    }

    public void deleteFornecedor(UUID id){
        repo.deleteById(id);
    }

    public FornecedorModel updateFornecedor(UUID id, FornecedorModel model){
        return repo.findById(id).map( fornedor -> {
            fornedor.setName(model.getName());
            fornedor.setContato(model.getContato());

            return repo.save(fornedor);
        }).orElseThrow();
    }
}