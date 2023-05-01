package com.felipe.cliente;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Cliente {

    private Long id;
    private String nome;

    public static Cliente of(Long id, String nome) {
        return new Cliente(id, nome);
    }
}
