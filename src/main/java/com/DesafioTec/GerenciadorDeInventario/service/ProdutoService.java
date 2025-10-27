package com.DesafioTec.GerenciadorDeInventario.service;

import com.DesafioTec.GerenciadorDeInventario.Model.ProdutoModel;
import com.DesafioTec.GerenciadorDeInventario.repository.ProdutoRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepositoty repo;

    public List<ProdutoModel> findAll(){
        return repo.findAll();
    }

    public Optional<ProdutoModel> findById(UUID id){
        return repo.findById(id);
    }

    public ProdutoModel saveProduto(ProdutoModel produto){
        return repo.save(produto);
    }

    public void deleteProduto(UUID id){
        repo.deleteById(id);
    }

    public ProdutoModel updateProduto(UUID id, ProdutoModel model){
        return repo.findById(id).map( produto -> {
            produto.setName(model.getName());
            produto.setPreco(model.getPreco());
            produto.setEstoque(model.getEstoque());

            return repo.save(produto);
        }).orElseThrow();
    }
}
