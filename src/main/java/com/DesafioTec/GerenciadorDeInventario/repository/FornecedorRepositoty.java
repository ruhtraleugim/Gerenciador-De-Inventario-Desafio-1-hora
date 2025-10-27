package com.DesafioTec.GerenciadorDeInventario.repository;

import com.DesafioTec.GerenciadorDeInventario.Model.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FornecedorRepositoty extends JpaRepository<FornecedorModel, UUID> {
}