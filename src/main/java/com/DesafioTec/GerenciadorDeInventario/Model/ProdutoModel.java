package com.DesafioTec.GerenciadorDeInventario.Model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "PRODUTO")
@Table(name = "PRODUTO")
@NoArgsConstructor
public class ProdutoModel {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private UUID id;

    private String name;

    private BigDecimal preco;

    private Integer estoque;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}