package com.DesafioTec.GerenciadorDeInventario.Model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Table(name = "FORNECEDOR")
@Entity(name = "FORNECEDOR")
@NoArgsConstructor
public class FornecedorModel {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private UUID uuid;

    private String name;

    private String contato;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}