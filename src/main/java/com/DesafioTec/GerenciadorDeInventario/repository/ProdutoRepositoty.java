package com.DesafioTec.GerenciadorDeInventario.repository;

import com.DesafioTec.GerenciadorDeInventario.Model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProdutoRepositoty extends JpaRepository<ProdutoModel, UUID> {
}
