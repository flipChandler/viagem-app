package com.felipe.cliente;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

    private Long id;
    private String nome;

    private Cliente(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public static Cliente of(Long id, String nome) {
        return new Cliente(id, nome);
    }
}
